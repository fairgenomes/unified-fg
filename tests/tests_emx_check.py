#'////////////////////////////////////////////////////////////////////////////
#' FILE: tests_emx_check.py
#' AUTHOR: David Ruvolo
#' CREATED: 2021-11-25
#' MODIFIED: 2021-11-25
#' PURPOSE: class for unit testing
#' STATUS: stable
#' PACKAGES: NA
#' COMMENTS: NA
#'////////////////////////////////////////////////////////////////////////////

import yaml

def __keyCheck__(keysToCheck: list, knownKeys: list, emxObject: str, emxObjectName = None):
    """Run Key Check
    Check input keys against a know key set
    
    @param keysToCheck (list) : list of keys to check
    @param knownKeys (list) : list of known keys (i.e., valid)
    @param emxObject (str) : name of the EMX object (packages, entities, attributes, tags)
    """
    
    if not (emxObject in ['packages','entities', 'attributes', 'tags']):
        raise ValueError(f'{emxObject} is unknown.')
    
    errorCount = 0
    for key in keysToCheck:
        if not key in knownKeys:
            errorCount += 1
            msg = f'Key "{key}" is not a valid {emxObject} property'
            if emxObjectName: msg = f'{emxObjectName}: {msg}'
            print(f'\033[91m x {msg} \033[0m')
    
    if errorCount == 0:
        msg = f'all properties are valid'
        if emxObjectName: msg = f'{emxObjectName}: {msg}'
        print(f'\033[92m ✓ \033[0m {msg}')


def __checkEmxPackages__(emx: list = None):
    """Check package level attributes
    Validate all package-level attributes
    
    @param emx (list) : raw contents of an YAML-EMX data model
    """
    keys = emx.keys()
    knownEmxPackageAttribs = [
        'name', 'label', 'description', 'parent', 'tags', # proper EMX attribs
        'version', 'date', 'defaults', 'tagDefinitions', 'entities'  # yamlemxconvert options
    ]
    
    __keyCheck__(
        keysToCheck = keys,
        knownKeys = knownEmxPackageAttribs,
        emxObject = 'packages'
    )


def __checkEmxEntities__(emx: list = None):
    knownEmxEntityProps = [
        # proper emx
        'name', 'label', 'extends', 'package', 'abstract',
        'description', 'backend', 'tags',
        # yamlemxconvert options
        'attributes'
    ]
    
    if not 'entities' in emx:
        print(f'\033[93m ! \033[0m No entities were defined in the YAML')

    if 'entities' in emx:
        for entity in emx['entities']:
            __keyCheck__(
                keysToCheck = entity.keys(),
                knownKeys = knownEmxEntityProps,
                emxObject = 'entities',
                emxObjectName = entity['name']
            )
                

def __checkEmxAttributes__(emx):
    knownEmxAttribProps = [
        'entity', 'name', 'dataType', 'refEntity', 'nillable',
        'idAttribute', 'auto', 'description', 'rangeMin', 'rangeMax',
        'lookupAttribute', 'label', 'aggregateable', 'labelAttribute', 'readOnly',
        'tags', 'validationExpression', 'visible', 'defaultValue', 'partOfAttribute',
        'expression', 'enumOptions'
    ]
    
    knownEmxDataTypes = [
        'bool', 'categorical', 'categorical_mref', 'compound', 'date', 'datetime',
        'decimal', 'email', 'enum', 'file', 'hyperlink', 'int', 'long', 'mref',
        'one_to_many', 'string', 'text', 'xref'
    ]
    
    if 'entities' in emx:
        for entity in emx['entities']:
            if 'attributes' in entity:
                for attr in entity['attributes']:
                    __keyCheck__(
                        keysToCheck = attr.keys(),
                        knownKeys = knownEmxAttribProps,
                        emxObject = 'attributes',
                        emxObjectName = f"{entity['name']}_{attr['name']}"
                    )
                    
                    if 'dataType' in attr.keys():
                        if not (attr['dataType'] in knownEmxDataTypes):
                            msg = f"{entity['name']}_{attr['name']}: dataType \'{attr['dataType']}\' invalid"
                            print(f'\033[91m x {msg} \033[0m')

    
def checkEmxStructure(file: str = None):
    """Check Emx Structure
    Validates all properties and dataTypes
    
    @param file (str) : location to YAML-EMX file
    """
    
    with open(file, 'r') as stream:
        emx = yaml.safe_load(stream)
        stream.close()
    
    print(f'\033[95m -- Checking EMX Package structure ----------- \033[0m')
    __checkEmxPackages__(emx = emx)
    
    print(f'\n\033[95m -- Checking EMX Entities Structure ----------- \033[0m')
    __checkEmxEntities__(emx = emx)
    
    print(f'\n\033[95m -- Checking EMX Attributes structure ----------- \033[0m')
    __checkEmxAttributes__(emx = emx)


#//////////////////////////////////////////////////////////////////////////////

# Test Emx Structure
checkEmxStructure(file = './emx/src/urdm_emx1.yaml')