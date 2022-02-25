# Unified metadata schema

The unified semantic metadata schema to power reuse of NGS data in research and healthcare. Version 0.1-SNAPSHOT, 2022-02-23. This model consists of __3 modules__ that contain __46 metadata elements__ and __1318 lookups__ in total (excluding null flavors).

## Module overview

| Name | Description | Ontology | Nr. of elements |
|---|---|---|---|
| [Studies](#module-studies) | A detailed examination, analysis, or critical inspection of one or multiple subjects designed to discover facts. | [NCIT:C63536](http://purl.obolibrary.org/obo/NCIT_C63536)  | 15 |
| [Data releases](#module-data-releases) | The act of making data or other structured information accessible to the public or to the user group of a database. | [NCIT:C172217](http://purl.obolibrary.org/obo/NCIT_C172217), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 2 |
| [Subjects](#module-subjects) | Persons who are observed, analyzed, examined, investigated, experimented upon, or/and treated in the course of a particular study. | [NCIT:C90492](http://purl.obolibrary.org/obo/NCIT_C90492), [ExO:0000127](http://purl.obolibrary.org/obo/ExO_0000127), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 29 |

## Module: Studies
A detailed examination, analysis, or critical inspection of one or multiple subjects designed to discover facts. Ontology: [NCIT:C63536](http://purl.obolibrary.org/obo/NCIT_C63536) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Identifier | A unique proper name or character sequence that identifies this particular study. | [OMIABIS:0000006](http://purl.obolibrary.org/obo/OMIABIS_0000006)  | identifier |
| Name | A name that designates this study. | [OMIABIS:0000037](http://purl.obolibrary.org/obo/OMIABIS_0000037)  | string |
| Acronym | The non-unique initials or abbreviated name used for identification. | [NCIT:C93495](http://purl.obolibrary.org/obo/NCIT_C93495)  | string |
| Description | A statement or piece of writing that provides details on this study. | [OMIABIS:0000036](http://purl.obolibrary.org/obo/OMIABIS_0000036), [NCIT:C142704](http://purl.obolibrary.org/obo/NCIT_C142704)  | text |
| Inclusion criteria | The conditions which, if met, make an person eligible for participation in this study. | [OBI:0500027](http://purl.obolibrary.org/obo/OBI_0500027)  | [InclusionCriteria.tsv](../../lookups/InclusionCriteria.tsv) lookup (14 choices [of type](http://purl.obolibrary.org/obo/OBI_0500027)) |
| Principal investigator | An investigator who is responsible for all aspects of the conduct of a study. | [OMIABIS:0000100](http://purl.obolibrary.org/obo/OMIABIS_0000100), [NCIT:C19924](http://purl.obolibrary.org/obo/NCIT_C19924)  | string |
| Contact person | Name of study contact. | [NCIT:C176373](http://purl.obolibrary.org/obo/NCIT_C176373)  | string |
| Contact email | An email address for the purpose of contacting the study contact person. | [OMIABIS:0000035](http://purl.obolibrary.org/obo/OMIABIS_0000035), [NCIT:C176375](http://purl.obolibrary.org/obo/NCIT_C176375)  | email |
| Study design | A plan specification comprised of protocols (which may specify how and what kinds of data will be gathered) that are executed as part of this study. | [OBI:0500000](http://purl.obolibrary.org/obo/OBI_0500000)  | text |
| Start date | The date on which this study began. | [NCIT:C69208](http://purl.obolibrary.org/obo/NCIT_C69208)  | date |
| Completion date | The date on which the concluding information for this study is completed. Usually, this is when the last subject has a final visit, or the main analysis has finished, or any other protocol-defined completion date. | [NCIT:C142702](http://purl.obolibrary.org/obo/NCIT_C142702)  | date |
| Current study status | The status of a study or trial. | [NCIT:C171103](http://purl.obolibrary.org/obo/NCIT_C171103)  | [StudyStatus.tsv](../../lookups/StudyStatus.tsv) lookup (21 choices [of type](http://purl.obolibrary.org/obo/NCIT_C171103)) |
| Number of subjects enrolled | An integer specifying the quantity of study subjects enrolled in the study at the current time. | [NCIT:C153145](http://purl.obolibrary.org/obo/NCIT_C153145)  | integer |
| Numer of samples collected | An integer specifying the quantity of samples collected at the current time. | [KISAO:0000326](http://www.biomodels.net/kisao/KISAO#KISAO_0000326)  | integer |
| belongsToDataRelease | The act of making data or other structured information accessible to the public or to the user group of a database. | [NCIT:C172217](http://purl.obolibrary.org/obo/NCIT_C172217)  | Reference to instances of Data releases |

## Module: Data releases
The act of making data or other structured information accessible to the public or to the user group of a database. Ontology: [NCIT:C172217](http://purl.obolibrary.org/obo/NCIT_C172217), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| id | One or more characters used to identify, name, or characterize the nature, properties, or contents of a thing. | [NCIT:C25364](http://purl.obolibrary.org/obo/NCIT_C25364)  | identifier |
| name | The words or language units by which a thing is known. | [NCIT:C42614](http://purl.obolibrary.org/obo/NCIT_C42614)  | string |

## Module: Subjects
Persons who are observed, analyzed, examined, investigated, experimented upon, or/and treated in the course of a particular study. Ontology: [NCIT:C90492](http://purl.obolibrary.org/obo/NCIT_C90492), [ExO:0000127](http://purl.obolibrary.org/obo/ExO_0000127), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Identifier | A unique proper name or character sequence that identifies this particular individual who is the subject of personal data, persons to whom data refers, and from whom data are collected, processed, and stored. | [NCIT:C164337](http://purl.obolibrary.org/obo/NCIT_C164337), [NCIT:C142495](http://purl.obolibrary.org/obo/NCIT_C142495)  | identifier |
| Alternative identifiers | A backup sequence of characters used to identify an entity. | [NCIT:C90353](http://purl.obolibrary.org/obo/NCIT_C90353)  | string |
| Gender identity | A person's concept of self as being male and masculine or female and feminine, or ambivalent, based in part on physical characteristics, parental responses, and psychological and social pressures. It is the internal experience of gender role. For practical reasons the lookups are limited to first and second-level entries, but can be expanded when needed. Note that 'Gender at birth', 'Genotypic sex' and any (gender-related) hormone therapies in 'Medication' are usually medically more relevant than this term. | [MESH:D005783](http://purl.bioontology.org/ontology/MESH/D005783)  | [GenderIdentity.tsv](../../lookups/GenderIdentity.tsv) lookup (15 choices [of type](http://purl.bioontology.org/ontology/MESH/D005783)) |
| Gender at birth | Assigned gender is one's gender which was assigned at birth, typically by a medical and/or legal organization, and then later registered with other organizations. Such a designation is typically based off of the superficial appearance of external genitalia present at birth. | [GSSO:009418](http://purl.obolibrary.org/obo/GSSO_009418)  | [GenderAtBirth.tsv](../../lookups/GenderAtBirth.tsv) lookup (13 choices [of type](http://purl.obolibrary.org/obo/GSSO_009418)) |
| Genotypic sex | A biological sex quality inhering in an individual based upon genotypic composition of sex chromosomes. | [PATO:0020000](http://purl.obolibrary.org/obo/PATO_0020000)  | [GenotypicSex.tsv](../../lookups/GenotypicSex.tsv) lookup (12 choices [of type](http://purl.obolibrary.org/obo/NCIT_C168871)) |
| Country of residence | Country of residence at enrollment. | [NCIT:C171105](http://purl.obolibrary.org/obo/NCIT_C171105)  | [Countries.tsv](../../lookups/Countries.tsv) lookup (249 choices [of type](http://purl.obolibrary.org/obo/GENEPIO_0001830)) |
| Ancestry | Population category defined using ancestry informative markers (AIMs) based on genetic/genomic data. | [NCIT:C176763](http://purl.obolibrary.org/obo/NCIT_C176763)  | [Ancestry.tsv](../../lookups/Ancestry.tsv) lookup (305 choices [of type](http://purl.obolibrary.org/obo/HANCESTRO_0004)) |
| Country of birth | The country that this person was born in. | [GENEPIO:0001094](http://purl.obolibrary.org/obo/GENEPIO_0001094)  | [Countries.tsv](../../lookups/Countries.tsv) lookup (249 choices [of type](http://purl.obolibrary.org/obo/GENEPIO_0001830)) |
| Year of birth | The year in which this person was born. | [NCIT:C83164](http://purl.obolibrary.org/obo/NCIT_C83164)  | integer |
| Date of birth | The calendar date on which a person was born. | [NCIT:C68615](http://purl.obolibrary.org/obo/NCIT_C68615)  | date |
| Inclusion status | A findings domain that contains general subject characteristics that are evaluated periodically to determine if they have changed. | [NCIT:C166244](http://purl.obolibrary.org/obo/NCIT_C166244), [NCIT:C117655](http://purl.obolibrary.org/obo/NCIT_C117655)  | [InclusionStatus.tsv](../../lookups/InclusionStatus.tsv) lookup (4 choices [of type](http://purl.obolibrary.org/obo/NCIT_C19332)) |
| Age at death | The age at which death occurred. | [NCIT:C135383](http://purl.obolibrary.org/obo/NCIT_C135383)  | integer |
| Date of death | The calendar date of subject's death. | [NCIT:C70810](http://purl.obolibrary.org/obo/NCIT_C70810)  | date |
| Year of death | The year in which an individual derived. | [NCIT:C156426](http://purl.obolibrary.org/obo/NCIT_C156426)  | integer |
| Primary affiliated institute | The most significant institute for medical consultation and/or study inclusion in context of the genetic disease of this person. | [NCIT:C25412](http://purl.obolibrary.org/obo/NCIT_C25412)  | [Institutes.tsv](../../lookups/Institutes.tsv) lookup (218 choices [of type](http://semanticscience.org/resource/SIO_000688)) |
| Affiliated institute contact person | A person acting as a channel for communication between groups or on behalf of a group. | [NCIT:C25461](http://purl.obolibrary.org/obo/NCIT_C25461)  | string |
| Affiliated institute contact email | Email address of the contact person or organization | [MS:1000589](http://purl.obolibrary.org/obo/MS_1000589)  | email |
| Resources in other institutes | Material or data related to this person that is not captured by this system though known to be available in other institutes such as biobanks or hospitals. | [NCIT:C19012](http://purl.obolibrary.org/obo/NCIT_C19012)  | [Institutes.tsv](../../lookups/Institutes.tsv) lookup (218 choices [of type](http://semanticscience.org/resource/SIO_000688)) |
| Participates in study | Reference to the study or studies in which this person participates. | [RO:0000056](http://purl.obolibrary.org/obo/RO_0000056)  | Reference to instances of Studies |
| Belongs to family | A domestic group, or a number of domestic groups linked through descent (demonstrated or stipulated) from a common ancestor, marriage, or adoption. | [NCIT:C25173](http://purl.obolibrary.org/obo/NCIT_C25173)  | string |
| Belongs to mother | A designation that has some relationship to motherhood. | [NCIT:C89336](http://purl.obolibrary.org/obo/NCIT_C89336)  | Reference to instances of Subjects |
| Belongs to father | Having to do with the father, coming from the father, or related through the father. | [NCIT:C94324](http://purl.obolibrary.org/obo/NCIT_C94324)  | Reference to instances of Subjects |
| Belongs with family members | Any individual related biologically or legally to another individual. | [NCIT:C21480](http://purl.obolibrary.org/obo/NCIT_C21480)  | Reference to instances of Subjects |
| Belongs with twin | Either of two offspring born from the same pregnancy. | [NCIT:C73427](http://purl.obolibrary.org/obo/NCIT_C73427)  | bool |
| First visit date | The date for the first patient visit. | [NCIT:C164021](http://purl.obolibrary.org/obo/NCIT_C164021)  | date |
| Fetal status | Any tissue from a fetus. | [NCIT:C17730](http://purl.obolibrary.org/obo/NCIT_C17730)  | bool |
| Consanguinity | Genetic relatedness between individuals who are descendants of at least one common ancestor. | [NCIT:C71384](http://purl.obolibrary.org/obo/NCIT_C71384)  | bool |
| Belongs to study | Reference to the study or studies in which this person participates. | [RO:0000056](http://purl.obolibrary.org/obo/RO_0000056)  | Reference to instances of Studies |
| Belongs to data release | The act of making data or other structured information accessible to the public or to the user group of a database. | [NCIT:C172217](http://purl.obolibrary.org/obo/NCIT_C172217)  | Reference to instances of Data releases |

## Null flavors
Each lookup is supplemented with so-called 'null flavors' from HL7. These can be used to indicate precisely why a particular value could not be entered into the system, providing substantially more insight than simply leaving a field empty.

| Value | Description | Ontology |
|---|---|---|
| NoInformation | The value is exceptional (missing, omitted, incomplete, improper). No information as to the reason for being an exceptional value is provided. This is the most general exceptional value. It is also the default exceptional value. | [HL7:NI](http://terminology.hl7.org/CodeSystem/v3-NullFlavor#NI) |
| Invalid | The value as represented in the instance is not a member of the set of permitted data values in the constrained value domain of a variable. | [HL7:INV](http://terminology.hl7.org/CodeSystem/v3-NullFlavor#INV) |
| Derived | An actual value may exist, but it must be derived from the provided information (usually an EXPR generic data type extension will be used to convey the derivation expression . | [HL7:DER](http://terminology.hl7.org/CodeSystem/v3-NullFlavor#DER) |
| Other | The actual value is not a member of the set of permitted data values in the constrained value domain of a variable.The actual value is not a member of the set of permitted data values in the constrained value domain of a variable. (e.g., concept not provided by required code system). | [HL7:OTH](http://terminology.hl7.org/CodeSystem/v3-NullFlavor#OTH) |
| Negative infinity | Negative infinity of numbers. | [HL7:NINF](http://terminology.hl7.org/CodeSystem/v3-NullFlavor#NINF) |
| Positive infinity | Positive infinity of numbers. | [HL7:PINF](http://terminology.hl7.org/CodeSystem/v3-NullFlavor#PINF) |
| Un-encoded | The actual value has not yet been encoded within the approved value domain. | [HL7:UNC](http://terminology.hl7.org/CodeSystem/v3-NullFlavor#UNC) |
| Masked | There is information on this item available but it has not been provided by the sender due to security, privacy or other reasons. There may be an alternate mechanism for gaining access to this information. | [HL7:MSK](http://terminology.hl7.org/CodeSystem/v3-NullFlavor#MSK) |
| Not applicable | Known to have no proper value (e.g., last menstrual period for a male). | [HL7:NA](http://terminology.hl7.org/CodeSystem/v3-NullFlavor#NA) |
| Unknown | A proper value is applicable, but not known. | [HL7:UNK](http://terminology.hl7.org/CodeSystem/v3-NullFlavor#UNK) |
| Asked but unknown | Information was sought but not found (e.g., patient was asked but didn't know) | [HL7:ASKU](http://terminology.hl7.org/CodeSystem/v3-NullFlavor#ASKU) |
| Temporarily unavailable | Information is not available at this time but it is expected that it will be available later. | [HL7:NAV](http://terminology.hl7.org/CodeSystem/v3-NullFlavor#NAV) |
| Not asked | This information has not been sought. (e.g., patient was not asked) | [HL7:NASK](http://terminology.hl7.org/CodeSystem/v3-NullFlavor#NASK) |
| Not available | Information is not available at this time (with no expectation regarding whether it will or will not be available in the future). | [HL7:NAVU](http://terminology.hl7.org/CodeSystem/v3-NullFlavor#NAVU) |
| Sufficient quantity | The specific quantity is not known, but is known to be non-zero and is not specified because it makes up the bulk of the material. e.g. 'Add 10mg of ingredient X, 50mg of ingredient Y, and sufficient quantity of water to 100mL.' The null flavor would be used to express the quantity of water. | [HL7:QS](http://terminology.hl7.org/CodeSystem/v3-NullFlavor#QS) |
| Trace | The content is greater than zero, but too small to be quantified. | [HL7:TRC](http://terminology.hl7.org/CodeSystem/v3-NullFlavor#TRC) |

