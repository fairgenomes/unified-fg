# Unified schema YAML format

The schema is expressed in a YAML file with a particular structure which is documented below.

## Root-level attributes

| Attribute               | Description                                                                                                    |
|-------------------------|----------------------------------------------------------------------------------------------------------------|
| name                    | Name of this schema.                                                                                           |
| description             | Description of this schema.                                                                                    |
| version                 | Schema version number, in decimal format.                                                                      |
| releaseType             | Type of project release. SNAPSHOT denotes development, Minor (x.x) or Major (x.0) denotes an official release. |
| date                    | Date of a Minor or Major release.                                                                              |
| tags                    | Ontology terms that best describe this schema.                                                                 |
| lookupGlobalOptions     | Special lookups that are added to every other lookup list in the schema, unless specified otherwise.           |
| [authors](#authors)     | A list of contributing schema authors.                                                                         |
| [copyright](#copyright) | A copyright statement about the schema.                                                                        |
| [license](#license)     | The license under which the schema is released.                                                                |
| [technical](#technical) | Specialized options required to generate project artifacts.                                                    |
| [tables](#tables)       | The actual components of the schema, comparable to classes or entities.                                        |

## Authors attributes <a id='authors'></a>

| Attribute | Description                                 |
|-----------|---------------------------------------------|
| name      | Name of this author.                        |
| email     | Email address of this author.               |
| orcid     | [ORCID](https://orcid.org/) of this author. |

## Copyright attributes <a id='copyright'></a>

| Attribute | Description                              |
|-----------|------------------------------------------|
| holder    | Name of the copyright holder.            |
| years     | Year of publication and latest revision. |

## License attributes <a id='license'></a>

| Attribute | Description                     |
|-----------|---------------------------------|
| name      | Name of the active license.     |
| url       | URL where license can be found. |

## Technical attributes <a id='technical'></a>

| Attribute   | Description                                   |
|-------------|-----------------------------------------------|
| artDecorId  | Project identifier in the ART-DECOR platform. |
| ttlLocation | Hosting location of the application ontology. |
| gitLocation | GitHub repository location of the project.    |

## Table attributes <a id='tables'></a>

| Attribute                     | Description                                                                      |
|-------------------------------|----------------------------------------------------------------------------------|
| name                          | Name of this table.                                                              |
| description                   | Description of this table, usually adapted from an ontology.                     |
| tags                          | Ontology terms that best describe this table.                                    |
| [relationWith](#relationWith) | Described the relationship with one or more other tables in the schema.          |
| [columns](#columns)           | The columns contained in this table, comparable to class attributes or features. |

## relationWith attributes <a id='relationWith'></a>

| Attribute | Description                                                        |
|-----------|--------------------------------------------------------------------|
| table     | The table that this table is related to in some way.               |
| relation  | Ontology term that best describes the relation between two tables. |

## Columns attributes <a id='columns'></a>

| Attribute    | Description                                                                                                                                                                                                                                                                               |
|:-------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| name         | Name of this column.                                                                                                                                                                                                                                                                      |
| description  | Description of this column, usually adapted from an ontology.                                                                                                                                                                                                                             |
| tags         | Ontology terms that best describe this column.                                                                                                                                                                                                                                            |
| dataType     | Data type of this column. See [ValueType.java](src/main/java/org/fairgenomes/generator/datastructures/ValueType.java) for all options. When using lookups, the additional `ofType` ontology is used to denote lookup type, e.g. lookup options for `Medication` are of type `ATC codes`.  |
| unit         | Optional ontology term to denote the unit of measurement.                                                                                                                                                                                                                                 |
| broadMatch   | Optional ontology term to denote a broad match. See explanation at [Match.java](src/main/java/org/fairgenomes/generator/datastructures/Match.java).                                                                                                                                       |
| exactMatch   | Optional ontology term to denote an exact match. See explanation at [Match.java](src/main/java/org/fairgenomes/generator/datastructures/Match.java).                                                                                                                                      |
| relatedMatch | Optional ontology term to denote a related match. See explanation at [Match.java](src/main/java/org/fairgenomes/generator/datastructures/Match.java).                                                                                                                                     |
| closeMatch   | Optional ontology term to denote a close match. See explanation at [Match.java](src/main/java/org/fairgenomes/generator/datastructures/Match.java).                                                                                                                                       |
| narrowMatch  | Optional ontology term to denote a narrow match. See explanation at [Match.java](src/main/java/org/fairgenomes/generator/datastructures/Match.java).                                                                                                                                      |
