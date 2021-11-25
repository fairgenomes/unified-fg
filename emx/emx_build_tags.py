#'////////////////////////////////////////////////////////////////////////////
#' FILE: emx_build_tags.py
#' AUTHOR: David Ruvolo
#' CREATED: 2021-11-24
#' MODIFIED: 2021-11-24
#' PURPOSE: build or refresh EMX attributes tags
#' STATUS: stable
#' PACKAGES: os, re
#' COMMENTS: NA
#'////////////////////////////////////////////////////////////////////////////

from os import path
import re


def __emptyEmxTagTemplate__():
    """Empty Emx Tag Template
    Generate a blank dict for tag metadata
    """
    return {
        'identifier': None,
        'label': None,
        'objectIRI': None,
        'codeSystem': None,
        'relationLabel': 'isAssociatedWith',
        'relationIRI': 'http://molgenis.org#isAssociatedWith'
    }


def buildEmxTags(attributes: list = []):
    """Build Emx Tags
    
    At the attribute level, collate all tags from the `tags` property and
    transform into EMX format.
    
    ATTRIBUTES:
        attributes (list) : the post-converted emx object `attributes` 
        
    """
    rawTags = []
    for attr in attributes:
        if 'tags' in attr:
                if attr['tags'].split(','):
                    for t in attr['tags'].split(','):
                        rawTags.append(t.strip())
                else:
                    rawTags.append(attr['tags'])
    
    data = []
    tags = list(set(rawTags))
    
    # set known tags that do not follow the default
    # pattern: [a-zA-Z]{1,}_[a-zA-Z0-9]{1,}
    knownDcmiTags = ['http://purl.org/dc/terms/valid']
    knownW3Tags = ['https://w3id.org/reproduceme#wasUpdatedBy']
    knownDcatTags = {
        'https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset' : {
            'label': 'dcat:Dataset' 
        },
        'https://www.w3.org/TR/vocab-dcat-3/#Class:Catalog': {
            'label': 'dcat:Catalog' 
        }
    }
    
    for tag in tags:
        if bool(tag):
            d = __emptyEmxTagTemplate__()
            name = path.basename(tag)
            
            # codes that are split with a forward slash rather than a hyphen
            knownIriVariations = re.search(r'(/(HL7|SNOMEDCT)/)', tag)
            if knownIriVariations:
                d['identifier'] = tag
                d['label'] = f"{knownIriVariations.group().replace('/','')}:{name}"
                d['codeSystem'] = knownIriVariations.group().replace('/','')
            
            # for other Iri variations
            elif re.search(r'^([a-zA-Z]{1,}#[a-zA-Z]{1,}_[a-zA-Z0-9]{1,})', name):
                d['identifier'] = tag
                d['label'] = name.split('#')[1].replace('_',':')
                d['codeSystem'] = name.split('#')[1].split('_')[0]
                
            # process DCMI tags manually
            elif tag in knownDcmiTags:
                d['identifier'] = tag
                d['label'] = f'DCMI:{name}'
                d['codeSystem'] = 'DCMI'
                
            # tags from w3id.org
            elif tag in knownW3Tags:  
                d['identifier'] = tag
                d['label'] = f"W3ID:{name.split('#')[1]}"
                d['codeSystem'] = 'W3ID'
        
            # dcat tags
            elif tag in knownDcatTags:
                d['identifier'] = tag
                d['label'] = knownDcatTags[tag]['label']
                d['codeSystem'] = 'DCAT'
                
            # set EDAM
            elif re.search(r'^(data_)', name):
                d['identifier'] = tag
                d['codeSystem'] = 'EDAM'

            # default formats
            elif re.search(r'^([a-zA-Z]{1,}_[a-zA-Z0-9]{1,})$', name):
                d['identifier'] = tag
            
            else:
                print(f"Unable to process tag: {d['identifier']}")
                                
            if bool(d['identifier']):
                d['objectIRI'] = tag
                if not bool(d['label']):
                    d['label'] = name.replace('_', ':')
                if not bool(d['codeSystem']): 
                    d['codeSystem'] = name.split('_')[0]
                data.append(d)
    return data
