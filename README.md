<<<<<<< HEAD
# FAIR Genomes semantic schema

![FAIR Genomes NGS FAIRification flow](misc/fg-ngs-fairification-flow.png)

## Explore

Discover the full schema at the [interactive overview](generated/markdown/fairgenomes-semantic-model.md). 

## Source

The source of the schema is located at [fair-genomes.yml](fair-genomes.yml). The reference lookup lists are available at [lookups](lookups).

## Outputs

Representations of the schema for specific systems/users are generated from the schema. The following outputs are available:

#### Electronic Data Capture (EDC) systems

- MOLGENIS EMX1 database setup at [molgenis-emx](generated/molgenis-emx).
- PALGA Codebook at [palga-codebook](generated/palga-codebook).
- ART-DECOR at [art-decor](generated/art-decor). The ART-DECOR XML is uploaded to [NICTIZ](https://decor.nictiz.nl/art-decor/decor-datasets--fairgenomes) made available for [iCRF Generator](https://github.com/aderidder/iCRFGenerator). FAIR Genomes interoperable case report forms can be created by iCRF Generator in these EDC formats:
  - Castor - Step
  - Castor - Report
  - Castor - Survey
  - REDCap
  - OpenClinica 3

#### Resource Description Framework (RDF)

- Application ontology at [ontology](generated/ontology).
- Resources for new terms at [resource](generated/resource).

#### Documentation

- Interactive overview at [markdown](generated/markdown). View it [here](generated/markdown/fairgenomes-semantic-model.md).
- Typesetted LaTeX/PDF at [latex](generated/latex) and [pdf](derived/pdf). View it [here](derived/pdf/fair-genomes.pdf).
- LODE page at [lode](derived/ontology/lode). View it [here](https://w3id.org/fair-genomes/ontology).

## Demo
Please try the [public demo](https://fairgenomes-acc.gcc.rug.nl) at give us feedback.

## Other links
- Persistent [namespace](https://w3id.org/fair-genomes) is provided by W3ID, linking to [ontology](https://w3id.org/fair-genomes/ontology) and [resources](https://w3id.org/fair-genomes/resource/FG_0000001).
- Find us on [FAIRSharing](https://fairsharing.org/bsg-s001533/).
- Available on [BioPortal](https://bioportal.bioontology.org/ontologies/FG).

## Technical notes

#### Using an international list of institutes

The Research Organization Registry (https://ror.org/) provides a unique identifier for every research organization in the world.
The 2021-09-23 ROR Data release (see https://zenodo.org/communities/ror-data) has been transformed in a FAIR Genomes compatible lookup list.
This list, available at [InstitutesROR.txt](lookups/InstitutesROR.txt), can be used to supplement or replace the default [Institutes.txt](lookups/Institutes.txt).
The ROR institute data is currently not generated into apps because everything would become much bigger and slower than necessary under most circumstances.

#### FAIR Genomes YAML format

The YAML format used to contain the FAIR Genomes schema is documented at [YamlFormat.md](YamlFormat.md).

#### RDF formats

The FAIR Genomes application ontology [TTL files](generated/ontology) can be converted to other RDF serialization formats including OWL-XML, RDF-XML, RDF-JSON, JSON-LD, N-Triples, TriG, TriX, Thrift, Manchester syntax and Functional syntax using [Ontology Converter](https://github.com/sszuev/ont-converter/releases/tag/v1.0).

For example, conversion to OWL-XML can be accomplished by running: 
```
java -jar ont-converter.jar -i /path/to/fairgenomes-semantic-model/generated/ontology/fair-genomes.ttl -if TURTLE -o fair-genomes.owl -of OWL_XML
```

Please be aware that the original TTL format is highly efficient. Other RDF formats typically consume more disk space. Conversions using the FAIR Genomes TTL of 25-02-2021 as a reference results in the following relative file size differences:

| Format | Difference |
|---|---|
| TTL | 0% (reference) |
| OWL-XML | +660% |
| RDF-XML | +107% |
| RDF-JSON | +176% |
| JSON-LD | +13% |
| N-Triples | +357% |
| TriG | -1% |
| TriX | +696% |
| Thrift | +284% |
| Manchester | +435% |
| Functional | +300% |

#### ART-DECOR validation

The ART-DECOR XML is validated using [Saxon](http://saxon.sourceforge.net), requiring these resources:
```
http://art-decor.org/ADAR/rv/DECOR.sch
https://github.com/Schematron/stf/blob/master/iso-schematron-xslt2/iso_svrl_for_xslt2.xsl
https://github.com/Schematron/stf/blob/master/iso-schematron-xslt2/iso_schematron_skeleton_for_saxon.xsl
```
The Schematron must first be converted to XSLT:
```
java -jar saxon-he-10.3.jar -o:DECOR.xsl -s:DECOR.sch iso_svrl_for_xslt2.xsl
```
The XML can then be validated as follows:
```
java -jar saxon-he-10.3.jar -o:warnings.xml -s:/path/to/fairgenomes-semantic-model/generated/art-decor/fair-genomes_en-US.xml DECOR.xsl
```
Finally, `warnings.xml` is inspected for any errors or warnings.

#### Release SOP

1. Set correct date, version number and release type in YAML file.
2. Generate outputs (by running Main.java).
3. Validate implementations:
    - Run ART-DECOR XML validation
    - Run MOLGENIS setup script
    - Import application ontology into GraphDB
    - Check Markdown rendering
4. Update PDF (run toPDF.sh in generated/latex).
5. Update version in [sys_StaticContent.tsv](misc/molgenis/other/sys_StaticContent.tsv).
6. Update version in [pom.xml](pom.xml).
7. Update Docker prepare at [misc/molgenis/docker](misc/molgenis/docker) based on [setup.sh](generated/molgenis-emx/setup.sh).
8. Create a new Excel file at [misc/excel](misc/excel).
9. Make commits and push to fork.
10. Pull request and merge with main (i.e. _fairgenomes_ organization).
11. Create updated LODE page by following the [link](http://150.146.207.114/lode/extract?url=https%3A%2F%2Fraw.githubusercontent.com%2Ffairgenomes%2Ffairgenomes-semantic-model%2Fmain%2Fgenerated%2Fontology%2Ffair-genomes.ttl&owlapi=true&lang=en) to TTL file in main repo.
12. Commit LODE page to fork, then again PR and merge with main.
13. Create Github release on main.
14. Prepare for further development: increment version in [fair-genomes.yml](fair-genomes.yml) and set to SNAPSHOT. Also update [pom.xml](pom.xml) and [sys_StaticContent.tsv](misc/molgenis/other/sys_StaticContent.tsv).
15. Use [Ontology Converter](https://github.com/sszuev/ont-converter/releases/tag/v1.0) to convert to OWL and publish new version on [BioPortal](https://bioportal.bioontology.org/ontologies/FG).
16. Reset [demo server](https://fairgenomes-acc.gcc.rug.nl/) and import new app.

#### MOLGENIS-EMX2

To upload to molgenis-emx2, make a zip of the generated/molgenis-emx2 and upload.
=======
# Unified Molgenis Data Model

Welcome! The Unified Molgenis Data Model &mdash;or UMDM&mdash; is a *plug and play* [Molgenis EMX](https://molgenis.gitbook.io/molgenis/data-management/guide-emx) model for collating metadata on patients and samples, analyses that were performed on the samples, and files that were generated. The model comprises several modules built on the [FAIR data principles](https://www.go-fair.org/fair-principles/) and the [FAIR Genomes Semantic Model](https://github.com/fairgenomes/fairgenomes-semantic-model). The module system enables the model to be adapted for research or care contexts.

Download the [latest version of the model](https://github.com/molgenis/rd-datamodel/blob/main/dist/umdm-emx1/umdm.xlsx) or [view the model schema](https://github.com/molgenis/rd-datamodel/blob/main/dist/umdm_schema.md) to see what's in the model.

## Features

Here is what is included.

- :package: **Unified Model**: a *plug and play* FAIR data model for Molgenis databases on rare diseases. The model contains modules for patients, studies, consent, clinical events, biomaterials collected, preparation of samples, sample sequencing, and metadata from generated files.
- :books: **Reference Datasets**: an extensive library of reference datasets standardized to ontologies, international standards, and field specific standards.
- :busts_in_silhouette: **User Module**: table structure and script tracking users, registrations, and authorization levels. Ideal for auditing and database management!
- :wrench: **Jobs**: table structure for logging custom jobs and results. This is an extension of the existing jobs entity, but geared towards database management.

For more information on Molgenis, visit [molgenis.org](https://www.molgenis.org/).

## Getting Started

This repository includes scripts for building the model and collating lookup datasets, but you only need the model and a few other things to get started with building your own database. See the steps below.

1. **Install Molgenis**: you will need a server running the latest version of Molgenis. See the [Molgenis Documentation](https://molgenis.gitbook.io/molgenis/) for more information about setting up Molgenis. Alternatively, you can use the [latest Molgenis Docker container](https://github.com/molgenis/docker) to create an instance on your local machine.
2. **Install the Molgenis Commander**: Install the latest version of [Molgenis commander](https://github.com/molgenis/molgenis-tools-commander)
3. **Run the setup script**: Run the [UMDM Setup script](https://github.com/molgenis/rd-datamodel/blob/main/emx/dist/umdm-emx1/umdm_setup.sh). This will import the model and all datasets into your Molgenis instance.

### Updating, building and deploying the UMDM

To update the UMDM, follow the steps below.

#### 1 Make changes to the model

Make all of the changes that are requested. For new entities (i.e., tables), open the YAML file and scroll to the `entities` section and enter the following information.

```yaml
entities:
    ...
    - name: myNewTable
      label: My New Table
      description: some description about my new table will go here
      tags: https://url.to.some/ontology/code/that/describes/my_table
      attributes:
        ...
```

If you are adding a new lookup, use one of the predefined attribute templates.

- `attributeTemplateDefault`: the recommended attribute template where the column `value` is the primary key. The value, which is a label, will be displayed when referenced in another table
- `attributeTemplateCode`: an alternative template where the column `code` is the primary key. This is useful for lookups where the code should be displayed instead of the label

To add new attributes, locate the appropriate table in the yaml script and create a new block under `attributes`.

```yaml
entities:
    ...
    - name: myTableThatIWantToEdit
      label: My table that I want to edit
      description: The table that I want to edit
      tags: https://url.to.some/ontology/code/that/describes/my_table
      attributes:
        ...
        
        - name: myNewAttribute
          description: a description about my new attribute
          dataType: ...
        # refEntity: ... # if type is a ref
          tags: https://url.to.some/ontology/code/that/describes/my_attribute
```

#### 2 Building

Test the model once all changes have been made.

```shell
yarn test
```

This test runs some basic error checking to make sure the model contains valid EMX markup. At the end of test, a print summary of the errors will be provided (if errors were detected). Scroll through the report to see find the errors.

When all of the changes have been made, build the model. Make sure the python library [yamlemxconvert](https://pypi.org/project/yamlemxconvert/) is installed and run the following yarn script.

```shell
yarn emx:build
```

Make sure all tag errors have been resolved (`Unable to process tag: None`).

#### 3 Deploying

When built, deploy to the server. **NOTE**: make sure you export all data before importing the new model.

```shell
yarn m:config
yarn m:predeploy
yarn m:deploy
yarn m:postdeploy

yarn m:demo # if setting up a demo database
```

If you have added a new lookup table, you will need to update the `setup.sh` script.

```shell
yarn m:refresh-setup
```
>>>>>>> umdm/main
