# Unified metadata schema

The unified semantic metadata schema to power reuse of NGS data in research and healthcare. Version 0.1-SNAPSHOT, 2022-02-23. This model consists of __22 modules__ that contain __314 metadata elements__ and __121140 lookups__ in total (excluding null flavors).

## Module overview

| Name | Description | Ontology | Nr. of elements |
|---|---|---|---|
| [Studies](#module-studies) | A detailed examination, analysis, or critical inspection of one or multiple subjects designed to discover facts. | [NCIT:C63536](http://purl.obolibrary.org/obo/NCIT_C63536)  | 14 |
| [Person](#module-person) | researcher or contactperson involved in the study and/or affliated with organisation | [NCIT:C25461](http://purl.obolibrary.org/obo/NCIT_C25461), [NCIT:C25936](http://purl.obolibrary.org/obo/NCIT_C25936)  | 7 |
| [Data releases](#module-data-releases) | The act of making data or other structured information accessible to the public or to the user group of a database. | [NCIT:C172217](http://purl.obolibrary.org/obo/NCIT_C172217), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 8 |
| [Subjects](#module-subjects) | Persons who are observed, analyzed, examined, investigated, experimented upon, or/and treated in the course of a particular study. | [NCIT:C90492](http://purl.obolibrary.org/obo/NCIT_C90492), [ExO:0000127](http://purl.obolibrary.org/obo/ExO_0000127), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 28 |
| [Clinical](#module-clinical) | Findings and circumstances relating to the examination and treatment of a patient. | [NCIT:C25398](http://purl.obolibrary.org/obo/NCIT_C25398), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 25 |
| [Materials](#module-materials) | A natural substance derived from living organisms such as cells, tissues, proteins, and DNA. | [NCIT:C43376](http://purl.obolibrary.org/obo/NCIT_C43376), [SCDO:0002829](http://purl.obolibrary.org/obo/SCDO_0002829), [NCIT:C13236](http://purl.obolibrary.org/obo/NCIT_C13236), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 25 |
| [Sampling protocols](#module-sampling-protocols) | Describes the procedure whereby biological samples for an experiment are sourced. | [EFO:0005518](http://www.ebi.ac.uk/efo/EFO_0005518), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 5 |
| [NGS sample preparations](#module-ngs-sample-preparations) | A sample preparation for a nucleic acids sequencing assay. | [OBI:0001902](http://purl.obolibrary.org/obo/OBI_0001902), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 14 |
| [Laboratory Procedures](#module-laboratory-procedures) | Any procedure that involves testing or manipulating a sample of blood, urine, or other body substance in a laboratory setting. | [NCIT:C25294](http://purl.obolibrary.org/obo/NCIT_C25294), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 6 |
| [Sequencing runs](#module-sequencing-runs) | The determination of complete (typically nucleotide) sequences, including those of genomes (full genome sequencing, de novo sequencing and resequencing), amplicons and transcriptomes. | [EDAM:topic_3168](http://edamontology.org/topic_3168), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 16 |
| [Files](#module-files) | A set of related records (either written or electronic) kept together. | [NCIT:C42883](http://purl.obolibrary.org/obo/NCIT_C42883), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 14 |
| [Cohorts](#module-cohorts) | A group of individuals, identified by a common characteristic. | [NCIT:C61512](http://purl.obolibrary.org/obo/NCIT_C61512), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 7 |
| [Signed consent](#module-signed-consent) | Consent given by a patient to a surgical or medical procedure or participation in a study, examination or analysis after achieving an understanding of the relevant medical facts and the risks involved. | [NCIT:C16735](http://purl.obolibrary.org/obo/NCIT_C16735), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 15 |
| [Leaflet and consent form](#module-leaflet-and-consent-form) | A document explaining all the relevant information to assist an individual in understanding the expectations and risks in making a decision about a procedure. This document is presented to and signed by the individual or guardian. | [NCIT:C16468](http://purl.obolibrary.org/obo/NCIT_C16468)  | 9 |
| [NGS analysis](#module-ngs-analysis) | An analysis applies analytical (often computational) methods to existing data of a specific type to produce some desired output. | [EDAM:operation_2945](http://edamontology.org/operation_2945)  | 11 |
| [Metabolomic material processing](#module-metabolomic-material-processing) | A metabolomics material processing is a protocol application including material enrollments and biomaterial transformations. | [OBI:0000073](http://purl.obolibrary.org/obo/OBI_0000073)  | 8 |
| [Metabolomic mass spec assays](#module-metabolomic-mass-spec-assays) | A qualitative or quantitative analysis performed to determine the amount of a particular constituent in a sample or the biological or pharmacological properties of a drug. | [NCIT:C60819](http://purl.obolibrary.org/obo/NCIT_C60819)  | 9 |
| [Metabolomic analyses](#module-metabolomic-analyses) | Basic information, annotation or documentation concerning a metabolomics analysis workflow (but not the workflow itself). | [EDAM:data_0949](http://edamontology.org/data_0949)  | 12 |
| [Genomic variant descriptions](#module-genomic-variant-descriptions) | Description of difference(s) in the nucleotide sequence of a biologic entity relative to a reference sequence. | [NCIT:C17248](http://purl.obolibrary.org/obo/NCIT_C17248), [GENO:0000476](http://purl.obolibrary.org/obo/GENO_0000476)  | 23 |
| [Genomic variant observations](#module-genomic-variant-observations) | Observations of genomic variants in subjects and their relatives within the context of a given study that represents a genetic assessment. | [NCIT:C164404](http://purl.obolibrary.org/obo/NCIT_C164404)  | 19 |
| [Genomic variant annotations](#module-genomic-variant-annotations) | In-context information that has been associated with genomic variants. | [NCIT:C44272](http://purl.obolibrary.org/obo/NCIT_C44272)  | 21 |
| [Genomic variant interpretations](#module-genomic-variant-interpretations) | The determination of the meaning of a variant in clinical context. | [NCIT:C125009](http://purl.obolibrary.org/obo/NCIT_C125009)  | 18 |

## Module: Studies
A detailed examination, analysis, or critical inspection of one or multiple subjects designed to discover facts. Ontology: [NCIT:C63536](http://purl.obolibrary.org/obo/NCIT_C63536) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Identifier | A unique proper name or character sequence that identifies this particular study. | [OMIABIS:0000006](http://purl.obolibrary.org/obo/OMIABIS_0000006)  | identifier |
| Name | A name that designates this study. | [OMIABIS:0000037](http://purl.obolibrary.org/obo/OMIABIS_0000037)  | string |
| Acronym | The non-unique initials or abbreviated name used for identification. | [NCIT:C93495](http://purl.obolibrary.org/obo/NCIT_C93495)  | string |
| Description | A statement or piece of writing that provides details on this study. | [OMIABIS:0000036](http://purl.obolibrary.org/obo/OMIABIS_0000036), [NCIT:C142704](http://purl.obolibrary.org/obo/NCIT_C142704)  | text |
| Inclusion criteria | The conditions which, if met, make an person eligible for participation in this study. | [OBI:0500027](http://purl.obolibrary.org/obo/OBI_0500027)  | [InclusionCriteria.tsv](../../lookups/InclusionCriteria.tsv) lookup (14 choices [of type](http://purl.obolibrary.org/obo/OBI_0500027)) |
| Principal investigator | An investigator who is responsible for all aspects of the conduct of a study. | [OMIABIS:0000100](http://purl.obolibrary.org/obo/OMIABIS_0000100), [NCIT:C19924](http://purl.obolibrary.org/obo/NCIT_C19924)  | Reference to instances of Person |
| Contact person | Name of study contact. | [NCIT:C176373](http://purl.obolibrary.org/obo/NCIT_C176373)  | Reference to instances of Person |
| Study design | A plan specification comprised of protocols (which may specify how and what kinds of data will be gathered) that are executed as part of this study. | [OBI:0500000](http://purl.obolibrary.org/obo/OBI_0500000)  | text |
| Start date | The date on which this study began. | [NCIT:C69208](http://purl.obolibrary.org/obo/NCIT_C69208)  | date |
| Completion date | The date on which the concluding information for this study is completed. Usually, this is when the last subject has a final visit, or the main analysis has finished, or any other protocol-defined completion date. | [NCIT:C142702](http://purl.obolibrary.org/obo/NCIT_C142702)  | date |
| Current study status | The status of a study or trial. | [NCIT:C171103](http://purl.obolibrary.org/obo/NCIT_C171103)  | [StudyStatus.tsv](../../lookups/StudyStatus.tsv) lookup (21 choices [of type](http://purl.obolibrary.org/obo/NCIT_C171103)) |
| Number of subjects enrolled | An integer specifying the quantity of study subjects enrolled in the study at the current time. | [NCIT:C153145](http://purl.obolibrary.org/obo/NCIT_C153145)  | integer |
| Numer of samples collected | An integer specifying the quantity of samples collected at the current time. | [KISAO:0000326](http://www.biomodels.net/kisao/KISAO#KISAO_0000326)  | integer |
| belongsToDataRelease | The act of making data or other structured information accessible to the public or to the user group of a database. | [NCIT:C172217](http://purl.obolibrary.org/obo/NCIT_C172217)  | Reference to instances of Data releases |

## Module: Person
researcher or contactperson involved in the study and/or affliated with organisation Ontology: [NCIT:C25461](http://purl.obolibrary.org/obo/NCIT_C25461), [NCIT:C25936](http://purl.obolibrary.org/obo/NCIT_C25936) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| identifier | identifier | [NCIT:C25364](http://purl.obolibrary.org/obo/NCIT_C25364)  | identifier |
| Full Name | full name. E.g. Morris Swertz | [GSSO:001755](http://purl.obolibrary.org/obo/GSSO_001755)  | string |
| Alternative identifier | alternative identifier. E.g. ORCID:1234 | [NCIT:C90353](http://purl.obolibrary.org/obo/NCIT_C90353)  | string |
| firstName | A word or group of words indicating a person's first (personal or given) name | [NCIT:C40974](http://purl.obolibrary.org/obo/NCIT_C40974)  | string |
| Middle initials | middle initiatials. E.g. A. | [NCIT:C166237](http://purl.obolibrary.org/obo/NCIT_C166237)  | string |
| Last name | last name. E.g. Swertz | [NCIT:C40975](http://purl.obolibrary.org/obo/NCIT_C40975)  | string |
| Email | email address. E.g. m.a.swertz@rug.nl | [NCIT:C42775](http://purl.obolibrary.org/obo/NCIT_C42775)  | string |

## Module: Data releases
The act of making data or other structured information accessible to the public or to the user group of a database. Ontology: [NCIT:C172217](http://purl.obolibrary.org/obo/NCIT_C172217), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| id | One or more characters used to identify, name, or characterize the nature, properties, or contents of a thing. | [NCIT:C25364](http://purl.obolibrary.org/obo/NCIT_C25364)  | identifier |
| name | The words or language units by which a thing is known. | [NCIT:C42614](http://purl.obolibrary.org/obo/NCIT_C42614)  | string |
| description | A written or verbal account, representation, statement, or explanation of something. | [NCIT:C25365](http://purl.obolibrary.org/obo/NCIT_C25365)  | text |
| date | A date of database submission refers to the moment in time in which some information was submitted/received to a database system. | [SIO:001083](http://semanticscience.org/resource/SIO_001083)  | date |
| createdBy | Indicates the person or authoritative body who brought the item into existence. | [NCIT:C42628](http://purl.obolibrary.org/obo/NCIT_C42628)  | Reference to instances of Person |
| numberOfEntriesAdded | Combined or joined to increase in size or quantity or scope. | [NCIT:C45330](http://purl.obolibrary.org/obo/NCIT_C45330)  | integer |
| dataSource | The person or authoritative body who provided the information. | [NCIT:C16493](http://purl.obolibrary.org/obo/NCIT_C16493)  | string |
| releaseComments | A notation regarding the decisions, and/or clarification of any information pertaining to data management. | [NCIT:C115505](http://purl.obolibrary.org/obo/NCIT_C115505)  | text |

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
| Affiliated institute contact person | A person acting as a channel for communication between groups or on behalf of a group. | [NCIT:C25461](http://purl.obolibrary.org/obo/NCIT_C25461)  | Reference to instances of Person |
| Resources in other institutes | Material or data related to this person that is not captured by this system though known to be available in other institutes such as biobanks or hospitals. | [NCIT:C19012](http://purl.obolibrary.org/obo/NCIT_C19012)  | [Institutes.tsv](../../lookups/Institutes.tsv) lookup (218 choices [of type](http://semanticscience.org/resource/SIO_000688)) |
| Participates in study | Reference to the study or studies in which this person participates. | [RO:0000056](http://purl.obolibrary.org/obo/RO_0000056)  | Reference to instances of Studies |
| Belongs to family | A domestic group, or a number of domestic groups linked through descent (demonstrated or stipulated) from a common ancestor, marriage, or adoption. | [NCIT:C25173](http://purl.obolibrary.org/obo/NCIT_C25173)  | string |
| Belongs to mother | A designation that has some relationship to motherhood. | [NCIT:C89336](http://purl.obolibrary.org/obo/NCIT_C89336)  | Reference to instances of Subjects |
| Belongs to father | Having to do with the father, coming from the father, or related through the father. | [NCIT:C94324](http://purl.obolibrary.org/obo/NCIT_C94324)  | Reference to instances of Subjects |
| Belongs with family members | Any individual related biologically or legally to another individual. | [NCIT:C21480](http://purl.obolibrary.org/obo/NCIT_C21480)  | Reference to instances of Subjects |
| Belongs with twin | Either of two offspring born from the same pregnancy. | [NCIT:C73427](http://purl.obolibrary.org/obo/NCIT_C73427)  | bool |
| First visit date | The date for the first patient visit. | [NCIT:C164021](http://purl.obolibrary.org/obo/NCIT_C164021)  | date |
| Fetal status | Any tissue from a fetus. | [NCIT:C17730](http://purl.obolibrary.org/obo/NCIT_C17730)  | bool |
| Consanguinity | Information on whether the patient is a child from two family members who are second cousins or closer. | [OMIT:0004546](http://purl.obolibrary.org/obo/OMIT_0004546), [SNOMED:842009](http://snomed.info/id/842009)  | bool |
| Part of data release | The act of making data or other structured information accessible to the public or to the user group of a database. | [NCIT:C172217](http://purl.obolibrary.org/obo/NCIT_C172217)  | Reference to instances of Data releases |
| Belongs to cohort | A group of individuals, identified by a common characteristic. | [NCIT:C61512](http://purl.obolibrary.org/obo/NCIT_C61512)  | Reference to instances of Cohorts |

## Module: Clinical
Findings and circumstances relating to the examination and treatment of a patient. Ontology: [NCIT:C25398](http://purl.obolibrary.org/obo/NCIT_C25398), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Identifier | A unique proper name or character sequence that identifies this particular clinical examination. | [NCIT:C87853](http://purl.obolibrary.org/obo/NCIT_C87853)  | identifier |
| Belongs to subject | An individual who is the subject of personal data, persons to whom data refers, and from whom data are collected, processed, and stored. | [NCIT:C142495](http://purl.obolibrary.org/obo/NCIT_C142495), [IAO:0000136](http://purl.obolibrary.org/obo/IAO_0000136)  | Reference to instances of Subjects |
| Affected status | Individuals in a pedigree who exhibit the specific phenotype under study. | [NCIT:C64917](http://purl.obolibrary.org/obo/NCIT_C64917)  | bool |
| Date of diagnosis | The date on which a diagnosis of disease was made. | [NCIT:C164339](http://purl.obolibrary.org/obo/NCIT_C164339)  | date |
| Age at diagnosis | The age (in years), measured from some defined time point (e.g. birth) at which a patient is diagnosed with a disease. | [SNOMEDCT:423493009](http://purl.bioontology.org/ontology/SNOMEDCT/423493009)  | integer |
| Age of onset | Age (in years) of onset of clinical manifestations related to the disease of the patient. | [Orphanet:C023](http://www.orpha.net/ORDO/Orphanet_C023)  | integer |
| Age at last screening | Age of the patient at the moment of the most recent screening. | [NCIT:C81258](http://purl.obolibrary.org/obo/NCIT_C81258)  | integer |
| Observed phenotype | The outward appearance of the individual. In medical context, these are often the symptoms caused by a disease. | [NCIT:C16977](http://purl.obolibrary.org/obo/NCIT_C16977)  | [Phenotypes.tsv](../../lookups/Phenotypes.tsv) lookup (15802 choices [of type](https://www.wikidata.org/wiki/Property:P3841)) |
| Unobserved phenotype | Phenotypes or symptoms that were looked for but not observed, which may help in differential diagnosis or establish incomplete penetrance. | [HL7:C0442737](http://purl.bioontology.org/ontology/HL7/C0442737)  | [Phenotypes.tsv](../../lookups/Phenotypes.tsv) lookup (15802 choices [of type](https://www.wikidata.org/wiki/Property:P3841)) |
| Provisional phenotype | The test or procedure was successfully performed, but the results are borderline and can neither be declared positive / negative nor detected / not detected according to the current established criteria. | [HL7:C0332241](http://purl.bioontology.org/ontology/HL7/C0332241)  | [Phenotypes.tsv](../../lookups/Phenotypes.tsv) lookup (15802 choices [of type](https://www.wikidata.org/wiki/Property:P3841)) |
| Clinical diagnosis | A diagnosis made from a study of the signs and symptoms of a disease. | [NCIT:C15607](http://purl.obolibrary.org/obo/NCIT_C15607)  | [Diseases.tsv](../../lookups/Diseases.tsv) lookup (9700 choices [of type](http://edamontology.org/data_3667)) |
| Molecular diagnosis gene | Gene affected by pathogenic variation that is causal for disease of the patient. | [NCIT:C20826](http://purl.obolibrary.org/obo/NCIT_C20826)  | [Genes.tsv](../../lookups/Genes.tsv) lookup (19202 choices [of type](http://purl.obolibrary.org/obo/NCIT_C16612)) |
| Molecular diagnosis other | Causal variant in HGVS notation with optional classification or free text explaining any other molecular mechanisms involved. | [NCIT:C20826](http://purl.obolibrary.org/obo/NCIT_C20826)  | text |
| Medication | A drug product that contains one or more active and/or inactive ingredients used by the patient intended to treat, prevent or alleviate the symptoms of disease. Any hormone therapies, gender-related or otherwise, should also be recorded here. | [NCIT:C459](http://purl.obolibrary.org/obo/NCIT_C459)  | [Drugs.tsv](../../lookups/Drugs.tsv) lookup (5632 choices [of type](http://edamontology.org/data_3103)) |
| Drug regimen | The specific way a therapeutic drug is to be taken, including formulation, route of administration, dose, dosing interval, and treatment duration. | [NCIT:C142516](http://purl.obolibrary.org/obo/NCIT_C142516)  | text |
| Medical history | A record of a person's background regarding health, occurrence of disease events and surgical procedures. | [NCIT:C18772](http://purl.obolibrary.org/obo/NCIT_C18772)  | [MedicalHistory.tsv](../../lookups/MedicalHistory.tsv) lookup (1154 choices [of type](http://scdontology.h3abionet.org/ontology/SCDO_1000093)) |
| Phenotypic data available | Types of phenotypic data collected in a clinical setting that is potentially available upon request. | [NCIT:C15783](http://purl.obolibrary.org/obo/NCIT_C15783)  | [DCMITypes.tsv](../../lookups/DCMITypes.tsv) lookup (6 choices [of type](http://purl.org/dc/terms/DCMIType)) |
| Status of diagnosis | A condition or state at a particular time. | [NCIT:C25688](http://purl.obolibrary.org/obo/NCIT_C25688)  | [DiagnosisConfirmationStatus.tsv](../../lookups/DiagnosisConfirmationStatus.tsv) lookup (20 choices [of type](http://purl.obolibrary.org/obo/NCIT_C48655)) |
| First contact | First contact of the patient with a specialised center in context of disease or study inclusion. | [LOINC:MTHU048806](http://purl.bioontology.org/ontology/LNC/MTHU048806)  | date |
| Date diagnosis confirmed | The particular day, month and year an event has happened or will happen. | [NCIT:C25164](http://purl.obolibrary.org/obo/NCIT_C25164)  | date |
| Family members affected | Family members related by descent rather than by marriage or law who were diagnosed with the same condition as the individual who is the primary focus of investigation (i.e. the proband). | [HP:0032320](http://purl.obolibrary.org/obo/HP_0032320)  | [FamilyMembers.tsv](../../lookups/FamilyMembers.tsv) lookup (41 choices [of type](http://purl.obolibrary.org/obo/NCIT_C71384)) |
| Family members sequenced | Family members related by descent rather than by marriage or law who were also tested by next-generation sequencing. | [NCIT:C79916](http://purl.obolibrary.org/obo/NCIT_C79916)  | [FamilyMembers.tsv](../../lookups/FamilyMembers.tsv) lookup (41 choices [of type](http://purl.obolibrary.org/obo/NCIT_C71384)) |
| Functioning | Patient's classification of functioning i.e. disability profile according to International Classification of Functioning and Disability (ICF). | [NCIT:C21007](http://purl.obolibrary.org/obo/NCIT_C21007)  | text |
| Material used in diagnosis | This diagnosis c.q. clinical examination is based on one or more sampled materials. | [SIO:000641](http://semanticscience.org/resource/SIO_000641)  | string |
| Part of data release | The act of making data or other structured information accessible to the public or to the user group of a database. | [NCIT:C172217](http://purl.obolibrary.org/obo/NCIT_C172217)  | Reference to instances of Data releases |

## Module: Materials
A natural substance derived from living organisms such as cells, tissues, proteins, and DNA. Ontology: [NCIT:C43376](http://purl.obolibrary.org/obo/NCIT_C43376), [SCDO:0002829](http://purl.obolibrary.org/obo/SCDO_0002829), [NCIT:C13236](http://purl.obolibrary.org/obo/NCIT_C13236), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Identifier | Name or other identifier of an entry from a biosample database. | [EDAM:data_3273](http://edamontology.org/data_3273), [NCIT:C93400](http://purl.obolibrary.org/obo/NCIT_C93400)  | identifier |
| Alternative identifiers | A backup sequence of characters used to identify an entity. | [NCIT:C90353](http://purl.obolibrary.org/obo/NCIT_C90353)  | string |
| Collected from subject | Reference to the subject from whom this material was collected. | [SIO:000244](http://semanticscience.org/resource/SIO_000244), [NCIT:C142495](http://purl.obolibrary.org/obo/NCIT_C142495)  | Reference to instances of Subjects |
| Belongs to request | A sequence of letters, numbers, or other characters that specifically identifies a particular order. | [NCIT:C164567](http://purl.obolibrary.org/obo/NCIT_C164567)  | string |
| Belongs to diagnosis | Reference to a diagnosis c.q. clinical examination of which this material may be a part of. There can be multiple diagnoses when a non-tumor material is reused as reference. | [SIO:000068](http://semanticscience.org/resource/SIO_000068)  | Reference to instances of Clinical |
| Date of request | The date on which the activity or entity was ordered. | [NCIT:C164566](http://purl.obolibrary.org/obo/NCIT_C164566)  | date |
| Reason for sampling | The explanation for why a test, measurement, or assessment is executed. | [NCIT:C171003](http://purl.obolibrary.org/obo/NCIT_C171003)  | [samplingReason.tsv](../../lookups/samplingReason.tsv) lookup (10 choices [of type](http://purl.obolibrary.org/obo/NCIT_C171003)) |
| Sampling date | The date that a sample was collected or obtained. | [NCIT:C164024](http://purl.obolibrary.org/obo/NCIT_C164024)  | date |
| Sampling timestamp | Date and time at which this material was collected. | [EFO:0000689](http://www.ebi.ac.uk/efo/EFO_0000689)  | datetime |
| Registration timestamp | Date and time at which this material was listed or recorded officially, i.e. officially qualified or enrolled. | [NCIT:C25646](http://purl.obolibrary.org/obo/NCIT_C25646)  | datetime |
| Sampling protocol text | The procedure whereby this material was sampled for an analysis. | [EFO:0005518](http://www.ebi.ac.uk/efo/EFO_0005518)  | text |
| Sampling protocol reference | The procedure whereby this material was sampled for an analysis. | [EFO:0005518](http://www.ebi.ac.uk/efo/EFO_0005518)  | Reference to instances of Sampling protocols |
| Sampling protocol deviation | A variation from processes or procedures defined in the sampling protocol. Deviations usually do not preclude the overall evaluability of subject data for either efficacy or safety, and are often acknowledged and accepted in advance by the sponsor. | [NCIT:C50996](http://purl.obolibrary.org/obo/NCIT_C50996)  | text |
| Reason for sampling protocol deviation | The rationale for why a deviation from the sampling protocol has occurred. | [NCIT:C93529](http://purl.obolibrary.org/obo/NCIT_C93529)  | text |
| Biospecimen type | The type of material taken from a biological entity for testing, diagnostic, propagation, treatment or research purposes. | [NCIT:C70713](http://purl.obolibrary.org/obo/NCIT_C70713)  | [BiospecimenTypes.tsv](../../lookups/BiospecimenTypes.tsv) lookup (408 choices [of type](http://purl.obolibrary.org/obo/NCIT_C70699)) |
| Anatomical source | Biological entity that constitutes the structural organization of an individual member of a biological species from which this material was taken. | [NCIT:C103264](http://purl.obolibrary.org/obo/NCIT_C103264)  | [AnatomicalSources.tsv](../../lookups/AnatomicalSources.tsv) lookup (13827 choices [of type](http://purl.obolibrary.org/obo/UBERON_0001062)) |
| Pathological state | The pathological state of the tissue from which this material was derived. | [GO:0001894](http://purl.obolibrary.org/obo/GO_0001894)  | [PathologicalState.tsv](../../lookups/PathologicalState.tsv) lookup (4 choices [of type](http://purl.obolibrary.org/obo/NCIT_C164617)) |
| Biospecimen usability | An indication as to whether a biospecimen is suitable for testing purposes. | [NCIT:C171004](http://purl.obolibrary.org/obo/NCIT_C171004)  | bool |
| Storage conditions | The conditions under which this biological material was stored. | [NCIT:C96145](http://purl.obolibrary.org/obo/NCIT_C96145)  | [StorageConditions.tsv](../../lookups/StorageConditions.tsv) lookup (26 choices [of type](http://purl.obolibrary.org/obo/NCIT_C96145)) |
| Expiration date | The date beyond which this material is no longer regarded as fit for use. | [NCIT:C164516](http://purl.obolibrary.org/obo/NCIT_C164516)  | date |
| Percentage tumor cells | The percentage of tumor cells compared to total cells present in this material. | [NCIT:C127771](http://purl.obolibrary.org/obo/NCIT_C127771)  | decimal |
| Physical location | A place on the Earth where this material is located, by its name or by its geographical location. This definition is intentionally vague to allow reuse locally (e.g. which freezer), for contacting (e.g. which institute), broadly for logistical or legal reasons (e.g. city, country or continent). | [GAZ:00000448](http://purl.obolibrary.org/obo/GAZ_00000448)  | string |
| Analyses performed | Reports the existence of any analyses performed on this material other than genomics (e.g. transcriptomics, metabolomics, proteomics). | [IAO:0000702](http://purl.obolibrary.org/obo/IAO_0000702)  | [AnalysesPerformed.tsv](../../lookups/AnalysesPerformed.tsv) lookup (20 choices [of type](http://edamontology.org/topic_3391)) |
| Derived from | Indicate if this material was produced from or related to another. | [NCIT:C28355](http://purl.obolibrary.org/obo/NCIT_C28355)  | string |
| Part of data release | The act of making data or other structured information accessible to the public or to the user group of a database. | [NCIT:C172217](http://purl.obolibrary.org/obo/NCIT_C172217)  | Reference to instances of Data releases |

## Module: Sampling protocols
Describes the procedure whereby biological samples for an experiment are sourced. Ontology: [EFO:0005518](http://www.ebi.ac.uk/efo/EFO_0005518), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Identifier | One or more characters used to identify, name, or characterize the nature, properties, or contents of a thing. | [NCIT:C25364](http://purl.obolibrary.org/obo/NCIT_C25364)  | identifier |
| Name | The words or language units by which a thing is known. | [NCIT:C42614](http://purl.obolibrary.org/obo/NCIT_C42614)  | string |
| Description | A written or verbal account, representation, statement, or explanation of something. | [NCIT:C25365](http://purl.obolibrary.org/obo/NCIT_C25365)  | text |
| Version | A form or variant of a type or original; one of a sequence of copies of a program, each incorporating new modifications. | [NCIT:C25714](http://purl.obolibrary.org/obo/NCIT_C25714)  | string |
| IRI | A unique symbol that establishes identity of the resource. | [NCIT:C165071](http://purl.obolibrary.org/obo/NCIT_C165071)  | hyperlink |

## Module: NGS sample preparations
A sample preparation for a nucleic acids sequencing assay. Ontology: [OBI:0001902](http://purl.obolibrary.org/obo/OBI_0001902), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Identifier | A unique proper name or character sequence that identifies this particular sample preparation. | [NCIT:C132299](http://purl.obolibrary.org/obo/NCIT_C132299)  | identifier |
| Belongs to materials | Reference to the source material from which this sample was prepared. | [NCIT:C93400](http://purl.obolibrary.org/obo/NCIT_C93400), [NCIT:C25683](http://purl.obolibrary.org/obo/NCIT_C25683)  | Reference to instances of Materials |
| Belongs to lab procedure | Any procedure that involves testing or manipulating a sample of blood, urine, or other body substance in a laboratory setting. | [NCIT:C25294](http://purl.obolibrary.org/obo/NCIT_C25294)  | Reference to instances of Laboratory Procedures |
| Belongs to request | A sequence of letters, numbers, or other characters that specifically identifies a particular order. | [NCIT:C164567](http://purl.obolibrary.org/obo/NCIT_C164567)  | string |
| Input amount | Amount of input material in nanogram (ng). | [AFRL:0000010](http://purl.allotrope.org/ontologies/role#AFRL_0000010)  | integer |
| Library preparation kit | Pre-filled, ready-to-use reagent cartridges intented to improve chemistry, cluster density and read length as well as improve quality (Q) scores for this sample. Reagent components are encoded to interact with the sequencing system to validate compatibility with user-defined applications. | [GENEPIO:0000085](http://purl.obolibrary.org/obo/GENEPIO_0000085)  | [NGSKits.tsv](../../lookups/NGSKits.tsv) lookup (616 choices [of type](http://purl.obolibrary.org/obo/GENEPIO_0000081)) |
| PCR free | Indicates whether a polymerase chain reaction (PCR) was used to prepare this sample. PCR is a method for amplifying a DNA base sequence using multiple rounds of heat denaturation of the DNA and annealing of oligonucleotide primers complementary to flanking regions in the presence of a heat-stable polymerase. | [NCIT:C17003](http://purl.obolibrary.org/obo/NCIT_C17003)  | bool |
| Target enrichment kit | Indicates which target enrichment kit was used to prepare this sample. Target enrichment is a pre-sequencing DNA preparation step where DNA sequences are either directly amplified (amplicon or multiplex PCR-based) or captured (hybrid capture-based) in order to only focus on specific regions of a genome or DNA sample. | [NCIT:C154307](http://purl.obolibrary.org/obo/NCIT_C154307)  | [NGSKits.tsv](../../lookups/NGSKits.tsv) lookup (616 choices [of type](http://purl.obolibrary.org/obo/GENEPIO_0000081)) |
| UMIs present | Indicates whether any unique molecular identifiers (UMIs) are present. An UMI barcode is a short nucleotide sequence that is used to identify reads originating from an individual mRNA molecule. | [EFO:0010199](http://www.ebi.ac.uk/efo/EFO_0010199)  | bool |
| Intended insert size | In paired-end sequencing, the DNA between the adapter sequences is the insert. The length of this sequence is known as the insert size, not to be confused with the inner distance between reads. So, fragment length equals read adapter length (2x) plus insert size, and insert size equals read lenght (2x) plus inner distance. | [FG:0000001](https://w3id.org/fair-genomes/resource/FG_0000001)  | integer |
| Intended read length | The number of nucleotides intended to be ordered from each side of a nucleic acid fragment obtained after the completion of a sequencing process. | [NCIT:C153362](http://purl.obolibrary.org/obo/NCIT_C153362)  | integer |
| Barcode | A machine-readable representation of information in a visual format on a surface. | [NCIT:C43361](http://purl.obolibrary.org/obo/NCIT_C43361)  | string |
| Belongs to batch | A quantity of people or things treated or regarded as a group, especially when subdivided from a larger group. | [NCIT:C67073](http://purl.obolibrary.org/obo/NCIT_C67073)  | string |
| Part of data release | The act of making data or other structured information accessible to the public or to the user group of a database. | [NCIT:C172217](http://purl.obolibrary.org/obo/NCIT_C172217)  | Reference to instances of Data releases |

## Module: Laboratory Procedures
Any procedure that involves testing or manipulating a sample of blood, urine, or other body substance in a laboratory setting. Ontology: [NCIT:C25294](http://purl.obolibrary.org/obo/NCIT_C25294), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Code | A character or string that represents the short code name of the laboratory test. | [NCIT:C83322](http://purl.obolibrary.org/obo/NCIT_C83322)  | identifier |
| Test | A character or string that represents the full name of the laboratory assessment. | [NCIT:C117142](http://purl.obolibrary.org/obo/NCIT_C117142)  | string |
| Description | A written or verbal account, representation, statement, or explanation of something | [NCIT:C25365](http://purl.obolibrary.org/obo/NCIT_C25365)  | text |
| Category | A classification of the laboratory test. | [NCIT:C83017](http://purl.obolibrary.org/obo/NCIT_C83017)  | string |
| Subcategory | A sub-division of the laboratory test classification. | [NCIT:C83142](http://purl.obolibrary.org/obo/NCIT_C83142)  | string |
| Gene list | A data set of the names or identifiers of genes that are the outcome of an analysis or have been put together for the purpose of an analysis. | [OBI:0000118](http://purl.obolibrary.org/obo/OBI_0000118)  | text |

## Module: Sequencing runs
The determination of complete (typically nucleotide) sequences, including those of genomes (full genome sequencing, de novo sequencing and resequencing), amplicons and transcriptomes. Ontology: [EDAM:topic_3168](http://edamontology.org/topic_3168), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Identifier | A unique proper name or character sequence that identifies this particular nucleic acid sequencing assay. | [NCIT:C171337](http://purl.obolibrary.org/obo/NCIT_C171337)  | identifier |
| Belongs to lab procedure | Any procedure that involves testing or manipulating a sample of blood, urine, or other body substance in a laboratory setting. | [NCIT:C25294](http://purl.obolibrary.org/obo/NCIT_C25294)  | Reference to instances of Laboratory Procedures |
| Belongs to sample preparation | Reference to the prepared sample, i.e. the source that was sequenced. | [NCIT:C132299](http://purl.obolibrary.org/obo/NCIT_C132299), [NCIT:C25683](http://purl.obolibrary.org/obo/NCIT_C25683)  | Reference to instances of NGS sample preparations |
| Reason for sequencing | A rationale for executing a plan of action. | [NCIT:C69216](http://purl.obolibrary.org/obo/NCIT_C69216)  | [SamplingReason.tsv](../../lookups/SamplingReason.tsv) lookup (10 choices [of type](http://purl.obolibrary.org/obo/NCIT_C171003)) |
| Sequencing date | Date on which this sequencing assay was performed. | [GENEPIO:0000069](http://purl.obolibrary.org/obo/GENEPIO_0000069)  | date |
| Sequencing facility organization | An organization that provides sequence determination service. | [OBI:0001891](http://purl.obolibrary.org/obo/OBI_0001891)  | [Institutes.tsv](../../lookups/Institutes.tsv) lookup (218 choices [of type](http://semanticscience.org/resource/SIO_000688)) |
| Sequencing platform | The used sequencing platform (i.e. brand, name of a company that produces sequencer equipment). | [GENEPIO:0000071](http://purl.obolibrary.org/obo/GENEPIO_0000071)  | [SequencingPlatform.tsv](../../lookups/SequencingPlatform.tsv) lookup (7 choices [of type](http://purl.obolibrary.org/obo/GENEPIO_0000071)) |
| Sequencing instrument model | The used product name and model number of a manufacturer's genomic (dna) sequencer. | [GENEPIO:0001921](http://purl.obolibrary.org/obo/GENEPIO_0001921)  | [SequencingInstrumentModels.tsv](../../lookups/SequencingInstrumentModels.tsv) lookup (39 choices [of type](http://purl.obolibrary.org/obo/GENEPIO_0001921)) |
| Sequencing method | Method used to determine the order of bases in a nucleic acid sequence. | [FIX:0000704](http://purl.obolibrary.org/obo/FIX_0000704)  | [SequencingMethods.tsv](../../lookups/SequencingMethods.tsv) lookup (35 choices [of type](http://purl.obolibrary.org/obo/NCIT_C17565)) |
| Median read depth | The median number of times a particular locus (site, nucleotide, amplicon, region) was sequenced. | [NCIT:C155320](http://purl.obolibrary.org/obo/NCIT_C155320)  | integer |
| Observed read length | The number of nucleotides successfully ordered from each side of a nucleic acid fragment obtained after the completion of a sequencing process. | [NCIT:C153362](http://purl.obolibrary.org/obo/NCIT_C153362)  | integer |
| Observed insert size | In paired-end sequencing, the DNA between the adapter sequences is the insert. The length of this sequence is known as the insert size, not to be confused with the inner distance between reads. So, fragment length equals read adapter length (2x) plus insert size, and insert size equals read lenght (2x) plus inner distance. | [FG:0000002](https://w3id.org/fair-genomes/resource/FG_0000002)  | integer |
| Percentage Q30 | Percentage of reads with a Phred quality score over 30, which indicates less than a 1/1000 chance that the base was called incorrectly. | [GENEPIO:0000089](http://purl.obolibrary.org/obo/GENEPIO_0000089)  | decimal |
| Percentage TR20 | Percentage of the target sequence on which 20 or more unique reads were successfully mapped. | [FG:0000003](https://w3id.org/fair-genomes/resource/FG_0000003)  | decimal |
| Other quality metrics | Other NGS quality control metrics, including but not limited to (i) sequencer metrics such as yield, error rate, density (K/mm2), cluster PF (%) and phas/prephas (%), (ii) alignment metrics such as QM insert size, GC content, QM duplicated reads (%), QM error rate, uniformity/evenness of coverage and maternal cell contamination, and (iii) variant call metrics such as number of SNVs/CNVs/SVs called, number of missense/nonsense variants, common variants (%), unique variants (%), gender match and trio inheritance check. | [EDAM:data_3914](http://edamontology.org/data_3914)  | text |
| Part of data release | The act of making data or other structured information accessible to the public or to the user group of a database. | [NCIT:C172217](http://purl.obolibrary.org/obo/NCIT_C172217)  | Reference to instances of Data releases |

## Module: Files
A set of related records (either written or electronic) kept together. Ontology: [NCIT:C42883](http://purl.obolibrary.org/obo/NCIT_C42883), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Filename | The literal identifier for an electronic file. | [NCIT:C171191](http://purl.obolibrary.org/obo/NCIT_C171191)  | identifier |
| Produced by sequencing | A unique proper name or character sequence that identifies this particular nucleic acid sequencing assay. | [NCIT:C171337](http://purl.obolibrary.org/obo/NCIT_C171337)  | Reference to instances of Sequencing runs |
| Belongs to subject | An individual who is the subject of personal data, persons to whom data refers, and from whom data are collected, processed, and stored. | [NCIT:C142495](http://purl.obolibrary.org/obo/NCIT_C142495), [IAO:0000136](http://purl.obolibrary.org/obo/IAO_0000136)  | Reference to instances of Subjects |
| Belongs to study | Reference to the study or studies to which this file belongs. | [BFO:0000050](http://purl.obolibrary.org/obo/BFO_0000050)  | Reference to instances of Studies |
| Belongs to cohort | A group of individuals, identified by a common characteristic. | [NCIT:C61512](http://purl.obolibrary.org/obo/NCIT_C61512)  | Reference to instances of Cohorts |
| Server | A computer which provides some service for other computers connected to it via a network. | [NCIT:C48297](http://purl.obolibrary.org/obo/NCIT_C48297)  | string |
| File path | The specification of a node (file or directory) in a hierarchical file system, usually specified by listing the nodes top-down. | [NCIT:C47922](http://purl.obolibrary.org/obo/NCIT_C47922)  | string |
| File format | The format of an electronic file. | [NCIT:C171252](http://purl.obolibrary.org/obo/NCIT_C171252)  | string |
| File size | The size of an electronic file in bytes. | [NCIT:C171192](http://purl.obolibrary.org/obo/NCIT_C171192)  | integer |
| MD5 checksum | A 32-character hexadecimal number that is computed on a file. | [NCIT:C171276](http://purl.obolibrary.org/obo/NCIT_C171276)  | string |
| File status | The condition for an electronic file relative to the current data or file processing step. | [NCIT:C171193](http://purl.obolibrary.org/obo/NCIT_C171193)  | [FileStatus.tsv](../../lookups/FileStatus.tsv) lookup (7 choices [of type](http://purl.obolibrary.org/obo/NCIT_C171193)) |
| Creation date | The date a digital resource was created. | [NCIT:C69199](http://purl.obolibrary.org/obo/NCIT_C69199)  | date |
| Alternative identifiers | A backup sequence of characters used to identify an entity. | [NCIT:C90353](http://purl.obolibrary.org/obo/NCIT_C90353)  | string |
| Part of data release | The act of making data or other structured information accessible to the public or to the user group of a database. | [NCIT:C172217](http://purl.obolibrary.org/obo/NCIT_C172217)  | Reference to instances of Data releases |

## Module: Cohorts
A group of individuals, identified by a common characteristic. Ontology: [NCIT:C61512](http://purl.obolibrary.org/obo/NCIT_C61512), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Identifier | One or more characters used to identify, name, or characterize the nature, properties, or contents of a thing. | [NCIT:C25364](http://purl.obolibrary.org/obo/NCIT_C25364)  | identifier |
| Acronym | The non-unique initials or abbreviated name used for identification. | [NCIT:C93495](http://purl.obolibrary.org/obo/NCIT_C93495)  | string |
| Name | The words or language units by which a thing is known. | [NCIT:C42614](http://purl.obolibrary.org/obo/NCIT_C42614)  | string |
| Description | The description of the characteristics that define a cohort. | [NCIT:C166209](http://purl.obolibrary.org/obo/NCIT_C166209)  | text |
| Principle investigator | The principle investigator or responsible person for this study. | [OMIABIS:0000100](http://purl.obolibrary.org/obo/OMIABIS_0000100)  | string |
| Contact person | A person acting as a channel for communication between groups or on behalf of a group. | [NCIT:C25461](http://purl.obolibrary.org/obo/NCIT_C25461)  | Reference to instances of Person |
| Size of cohort | A subset of a larger population, selected for investigation to draw conclusions or make estimates about the larger population. | [NCIT:C53190](http://purl.obolibrary.org/obo/NCIT_C53190)  | integer |

## Module: Signed consent
Consent given by a patient to a surgical or medical procedure or participation in a study, examination or analysis after achieving an understanding of the relevant medical facts and the risks involved. Ontology: [NCIT:C16735](http://purl.obolibrary.org/obo/NCIT_C16735), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Identifier | A unique proper name or character sequence that identifies this particular signed individual consent. | [ICO:0000044](http://purl.obolibrary.org/obo/ICO_0000044)  | identifier |
| Belongs to subject | Reference to the subject to whom this individual consent applies. | [IAO:0000136](http://purl.obolibrary.org/obo/IAO_0000136), [NCIT:C142495](http://purl.obolibrary.org/obo/NCIT_C142495)  | Reference to instances of Subjects |
| Consent form used | Reference to the informed consent form that was signed. Points to a particular instance of leaflet and consent form that usually exists as a record (i.e. a row) within the same database as this individual consent. | [IAO:0000136](http://purl.obolibrary.org/obo/IAO_0000136)  | Reference to instances of Leaflet and consent form |
| Collected by | Indicates the person, group, or institution who performed the collection act. | [NCIT:C45262](http://purl.obolibrary.org/obo/NCIT_C45262)  | string |
| Signing date | A date specification that designates when this individual consent form was signed. | [ICO:0000036](http://purl.obolibrary.org/obo/ICO_0000036)  | date |
| Valid from | Starting date of the validity of this individual consent. | [DC:valid](http://purl.org/dc/terms/valid)  | date |
| Valid until | End date of the validity of this individual consent. | [DC:valid](http://purl.org/dc/terms/valid)  | date |
| Represented by | An individual who is authorized under applicable State or local law to consent on behalf of a child or incapable person to general medical care including participation in clinical research. | [NCIT:C142600](http://purl.obolibrary.org/obo/NCIT_C142600)  | [RepresentedBy.tsv](../../lookups/RepresentedBy.tsv) lookup (3 choices [of type](http://purl.obolibrary.org/obo/BFO_0000023)) |
| Consent withdrawn | An indication that the consent to participate in the study or one or more segments of the study has been revoked. | [NCIT:C176342](http://purl.obolibrary.org/obo/NCIT_C176342)  | bool |
| Data use permissions | A data item that is used to indicate consent permissions for datasets and/or materials, and relates to the purposes for which datasets and/or material might be used. | [DUO:0000001](http://purl.obolibrary.org/obo/DUO_0000001)  | [DataUsePermissions.tsv](../../lookups/DataUsePermissions.tsv) lookup (5 choices [of type](http://purl.obolibrary.org/obo/DUO_0000001)) |
| Data use modifiers | Data use modifiers indicate additional conditions for use. For instance, a dataset is restricted to investigations into specific diseases or performed at specific geographical locations. | [DUO:0000017](http://purl.obolibrary.org/obo/DUO_0000017)  | [DataUseModifiers.tsv](../../lookups/DataUseModifiers.tsv) lookup (23 choices [of type](http://purl.obolibrary.org/obo/DUO_0000017)) |
| Data use specification | Further specification of applied data use permissions and modifiers. For example, a list of countries in case of geographic restrictions or a list of diseases when restricted to disease-specific research. | [SIO:000090](http://semanticscience.org/resource/SIO_000090)  | text |
| Allow matchmaker | Permission is given for MatchMaking | [NCIT:C54116](http://purl.obolibrary.org/obo/NCIT_C54116)  | bool |
| Allow recontacting | The procedure of recontacting the patient for specified reasons. This means the patient agrees to be re-identifiable under those circumstances. | [NCIT:C25737](http://purl.obolibrary.org/obo/NCIT_C25737)  | [Recontacting.tsv](../../lookups/Recontacting.tsv) lookup (3 choices [of type](http://purl.obolibrary.org/obo/NCIT_C176244)) |
| Part of data release | The act of making data or other structured information accessible to the public or to the user group of a database. | [NCIT:C172217](http://purl.obolibrary.org/obo/NCIT_C172217)  | Reference to instances of Data releases |

## Module: Leaflet and consent form
A document explaining all the relevant information to assist an individual in understanding the expectations and risks in making a decision about a procedure. This document is presented to and signed by the individual or guardian. Ontology: [NCIT:C16468](http://purl.obolibrary.org/obo/NCIT_C16468) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Leaflet title | A title or name given to the leaflet that belongs to this consent form. | [DC:title](http://purl.org/dc/terms/title)  | string |
| Leaflet date | A point or period of time associated with the publication of this leaflet that belongs to this consent form. | [DC:date](http://purl.org/dc/terms/date)  | date |
| Leaflet version | The version, edition, or adaptation of this leaflet that belongs to this consent form. | [DC:hasVersion](http://purl.org/dc/terms/hasVersion)  | string |
| Consent form identifier | A unique proper name or character sequence that identifies this particular leaflet and consent form combination used in signing individual consent. Using a DOI would be optimal. Using any resolvable URL is suboptimal but still preferable over using a plain text value. | [DC:identifier](http://purl.org/dc/terms/identifier)  | identifier |
| Consent form title | A title or name given to this consent form. | [DC:title](http://purl.org/dc/terms/title)  | string |
| Consent form accepted date | Date of acceptance of this consent form. | [DC:dateAccepted](http://purl.org/dc/terms/dateAccepted)  | date |
| Consent form valid until | End date of the validity of this consent form. | [DC:valid](http://purl.org/dc/terms/valid)  | date |
| Consent form creator | Indicates the authoritative body who brought this consent form into existence. | [DC:creator](http://purl.org/dc/terms/creator)  | [Institutes.tsv](../../lookups/Institutes.tsv) lookup (218 choices [of type](http://semanticscience.org/resource/SIO_000688)) |
| Consent form version | The version, edition, or adaptation of this consent form. | [DC:hasVersion](http://purl.org/dc/terms/hasVersion)  | string |

## Module: NGS analysis
An analysis applies analytical (often computational) methods to existing data of a specific type to produce some desired output. Ontology: [EDAM:operation_2945](http://edamontology.org/operation_2945) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Identifier | A unique proper name or character sequence that identifies this particular analysis. | [AFR:0001979](http://purl.allotrope.org/ontologies/result#AFR_0001979)  | identifier |
| Belongs to sequencing | Reference to the sequencing that was performed, i.e. the source on which this analysis was based. | [NCIT:C25683](http://purl.obolibrary.org/obo/NCIT_C25683)  | Reference to instances of Sequencing runs |
| Physical data location | A place on the Earth where the data is located, by its name or by its geographical location. This definition is intentionally vague to allow reuse locally (e.g. which computer), for contacting (e.g. which institute), broadly for logistical or legal reasons (e.g. city, country or continent). | [GAZ:00000448](http://purl.obolibrary.org/obo/GAZ_00000448)  | string |
| Abstract data location | The file location of the data, or a copy of the data, on an electronically accessible device for preservation (either in plain-text or encrypted format). | [NCIT:C142494](http://purl.obolibrary.org/obo/NCIT_C142494)  | string |
| Data formats stored | Which data file formats (i.e. defined ways or layouts of representing and structuring data in a computer file, blob, string, message, or elsewhere) are stored and potentially available. | [NCIT:C142494](http://purl.obolibrary.org/obo/NCIT_C142494)  | [DataFormats.tsv](../../lookups/DataFormats.tsv) lookup (582 choices [of type](http://edamontology.org/format_1915)) |
| Algorithms used | Any used problem-solving procedures implemented in software to be executed by a computer. | [NCIT:C16275](http://purl.obolibrary.org/obo/NCIT_C16275)  | text |
| Reference genome used | The specific build of the human genome used as reference for sequence alignment and variant calling. | [EDAM:data_2340](http://edamontology.org/data_2340)  | [GenomeAccessions.tsv](../../lookups/GenomeAccessions.tsv) lookup (29 choices [of type](http://edamontology.org/data_2787)) |
| Bioinformatic protocol used | A human-readable collection of information about about how a scientific experiment or analysis was carried out that results in a specific set of data or results used for further analysis or to test a specific hypothesis. | [EDAM:data_2531](http://edamontology.org/data_2531)  | text |
| Bioinformatic protocol deviation | A variation from processes or procedures defined in the bioinformatic protocol. Deviations usually do not preclude the overall evaluability of subject data for either efficacy or safety, and are often acknowledged and accepted in advance by the sponsor. | [NCIT:C50996](http://purl.obolibrary.org/obo/NCIT_C50996)  | string |
| Reason for bioinformatic protocol deviation | The rationale for why a deviation from the bioinformatic protocol has occurred. | [NCIT:C93529](http://purl.obolibrary.org/obo/NCIT_C93529)  | string |
| WGS guideline followed | Any followed systematic statement of policy rules or principles. Guidelines may be developed by government agencies at any level, institutions, professional societies, governing boards, or by convening expert panels. | [NCIT:C17564](http://purl.obolibrary.org/obo/NCIT_C17564)  | string |

## Module: Metabolomic material processing
A metabolomics material processing is a protocol application including material enrollments and biomaterial transformations. Ontology: [OBI:0000073](http://purl.obolibrary.org/obo/OBI_0000073) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Identifier | A unique proper name or character sequence that identifies this particular metabolomics material processing. | [NCIT:C132299](http://purl.obolibrary.org/obo/NCIT_C132299)  | identifier |
| Belongs to materials | Reference to the source material from which this sample was prepared. | [NCIT:C93400](http://purl.obolibrary.org/obo/NCIT_C93400), [NCIT:C25683](http://purl.obolibrary.org/obo/NCIT_C25683)  | Reference to instances of Materials |
| Processing type | A planned process which results in physical changes in a specified input material. | [OBI:0000094](http://purl.obolibrary.org/obo/OBI_0000094)  | [MtbxMaterialProcessing.tsv](../../lookups/MtbxMaterialProcessing.tsv) lookup (4 choices [of type](http://purl.obolibrary.org/obo/OBI_0000094)) |
| Sample extraction | The transfer of a solute from a liquid phase to another immiscible or partially-miscible liquid phase in contact with it. | [CHMO:0001577](http://purl.obolibrary.org/obo/CHMO_0001577)  | string |
| Filter used | The filter used in separating of suspended solids from a liquid or gas, usually by forcing a carrier gas or liquid through a porous medium. | [CHMO:0001640](http://purl.obolibrary.org/obo/CHMO_0001640)  | string |
| Passing rate | The volume of carrier gas passing through a chromatography column in unit time. | [CHMO:0002751](http://purl.obolibrary.org/obo/CHMO_0002751)  | integer |
| SPE cartridge | A sample preparation technique using a solid adsorbent contained most commonly in a cartridge device, or on a disk to adsorb select species from solution. | [OMIT:0025161](http://purl.obolibrary.org/obo/OMIT_0025161)  | string |
| Washing protocol | Washing is a process by which a material entity acting as contaminant (e.g. excess staining reagent) is removed by application of one or more cycles of solution in flow. | [OBI:0302888](http://purl.obolibrary.org/obo/OBI_0302888)  | text |

## Module: Metabolomic mass spec assays
A qualitative or quantitative analysis performed to determine the amount of a particular constituent in a sample or the biological or pharmacological properties of a drug. Ontology: [NCIT:C60819](http://purl.obolibrary.org/obo/NCIT_C60819) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Identifier | A unique proper name or character sequence that identifies this particular metabolomics assay. | [NCIT:C171266](http://purl.obolibrary.org/obo/NCIT_C171266)  | identifier |
| Belongs metabolomic material processing | This metabolomic assay is part of a metabolomic material processing. | [SIO:000068](http://semanticscience.org/resource/SIO_000068)  | Reference to instances of Metabolomic material processing |
| Assay type | Spectrometry where the sample is converted into gaseous ions which are characterised by their mass-to-charge ratio and relative abundance. | [CHMO:0000470](http://purl.obolibrary.org/obo/CHMO_0000470)  | [MtbxMassSpecAssays.tsv](../../lookups/MtbxMassSpecAssays.tsv) lookup (3 choices [of type](http://purl.obolibrary.org/obo/CHMO_0000470)) |
| Inlet | A valve that controls the flow of fluids in through the wall of a chamber. | [NCIT:C50251](http://purl.obolibrary.org/obo/NCIT_C50251)  | string |
| Mass spectrometer | A piece of apparatus that consists of at least an ion source, a mass-to-charge analyser, a detector and a vacuum system and is used to measure mass spectra. | [CHMO:0000982](http://purl.obolibrary.org/obo/CHMO_0000982)  | string |
| Ionization source | A piece of apparatus that takes an analyte and generates ions which are passed to the rest of a mass spectrometer for analysis. | [CHMO:0000960](http://purl.obolibrary.org/obo/CHMO_0000960)  | string |
| Chromatography column | A piece of apparatus that has the form of a tube with a diameter between 5 to 50 mm and hosts the stationary bed in chromatography. | [CHMO:0000997](http://purl.obolibrary.org/obo/CHMO_0000997)  | string |
| Phase separation protocol | Any method for the synthesis of polymer membranes that involves the polymer transforming from the liquid phase of the cast solution to the solid phase. | [CHMO:0002214](http://purl.obolibrary.org/obo/CHMO_0002214)  | text |
| Mass spec source conditions | Condition in which variables of the experiment are manipulated to determine the variables effect by comparing to a control condition. | [ZECO:0000104](http://purl.obolibrary.org/obo/ZECO_0000104)  | string |

## Module: Metabolomic analyses
Basic information, annotation or documentation concerning a metabolomics analysis workflow (but not the workflow itself). Ontology: [EDAM:data_0949](http://edamontology.org/data_0949) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Identifier | A unique proper name or character sequence that identifies this particular metabolomics assay. | [EDAM:data_1083](http://edamontology.org/data_1083)  | identifier |
| Belongs metabolomic mass spec assay | This metabolomic analysis is part of a metabolomic assay. | [SIO:000068](http://semanticscience.org/resource/SIO_000068)  | Reference to instances of Metabolomic mass spec assays |
| Analysis type | Apply analytical methods to existing data of a specific type. | [EDAM:operation_2945](http://edamontology.org/operation_2945)  | [MtbxAnalyses.tsv](../../lookups/MtbxAnalyses.tsv) lookup (3 choices [of type](http://edamontology.org/operation_2945)) |
| Workflow definition | File content or location that encapsulates the analysis workflow, i.e. a sequence of operations to achieve one or more objectives. | [SIO:000127](http://semanticscience.org/resource/SIO_000127)  | text |
| Workflow engine | The engine used to execute the workflow such as Papermill, Jupyter, Galaxy or Nextflow. | [NCIT:C48293](http://purl.obolibrary.org/obo/NCIT_C48293)  | string |
| Workflow published | A printed or electronic work offered for distribution. | [NCIT:C48471](http://purl.obolibrary.org/obo/NCIT_C48471)  | string |
| Containerized by | The analysis has been boxed by a container engine such as Singularity or Docker. | [NCIT:C43186](http://purl.obolibrary.org/obo/NCIT_C43186)  | string |
| Software tools | A general term primarily used for digitally stored data such as computer programs and other kinds of information read and written by computers. | [ERO:0000071](http://purl.obolibrary.org/obo/ERO_0000071)  | string |
| Parameters | Any factor that defines a system and determines (or limits) its performance. | [NCIT:C44175](http://purl.obolibrary.org/obo/NCIT_C44175)  | string |
| Data formats stored | Which data file formats (i.e. defined ways or layouts of representing and structuring data in a computer file, blob, string, message, or elsewhere) are stored and potentially available. | [NCIT:C142494](http://purl.obolibrary.org/obo/NCIT_C142494)  | [DataFormats.tsv](../../lookups/DataFormats.tsv) lookup (582 choices [of type](http://edamontology.org/format_1915)) |
| Standards used | Any socially-agreed upon specifications used such as Common Workflow Language, mzML, ISA-TAB, FAIR Genomes, etc. | [SIO:000618](http://semanticscience.org/resource/SIO_000618)  | string |
| Statistical methods applied | A method of analyzing or representing statistical data or a procedure for calculating a statistic, such as principal component analysis, affinity propagation clustering, T-test, etc. | [NCIT:C19044](http://purl.obolibrary.org/obo/NCIT_C19044)  | string |

## Module: Genomic variant descriptions
Description of difference(s) in the nucleotide sequence of a biologic entity relative to a reference sequence. Ontology: [NCIT:C17248](http://purl.obolibrary.org/obo/NCIT_C17248), [GENO:0000476](http://purl.obolibrary.org/obo/GENO_0000476) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| variantInternalId | A unique proper name or character sequence that identifies this particular variation. | [NCIT:C164813](http://purl.obolibrary.org/obo/NCIT_C164813)  | identifier |
| Belongs to subject | An individual who is the subject of personal data, persons to whom data refers, and from whom data are collected, processed, and stored. | [NCIT:C142495](http://purl.obolibrary.org/obo/NCIT_C142495), [IAO:0000136](http://purl.obolibrary.org/obo/IAO_0000136)  | Reference to instances of Subjects |
| Belongs to material | Reference to the source material from which this sample was prepared. | [NCIT:C93400](http://purl.obolibrary.org/obo/NCIT_C93400), [NCIT:C25683](http://purl.obolibrary.org/obo/NCIT_C25683)  | Reference to instances of Materials |
| Produced by sequencing run | A unique proper name or character sequence that identifies this particular nucleic acid sequencing assay. | [NCIT:C171337](http://purl.obolibrary.org/obo/NCIT_C171337)  | Reference to instances of Sequencing runs |
| alternateBases | An allele that varies in it sequence from what is considered the reference or canonical sequence at that location. | [GENO:0000002](http://purl.obolibrary.org/obo/GENO_0000002), [ENSGLOSSARY:0000109](http://ensembl.org/glossary/ENSGLOSSARY_0000109)  | string |
| referenceBases | An attribute inhering in a feature that is designated to serve as a standard against which 'variant' versions of the same location are compared. | [GENO:0000036](http://purl.obolibrary.org/obo/GENO_0000036)  | string |
| Human chromosome | A structure found in the nucleus of human cells that is comprised of a strand of linearized double-stranded DNA plus proteins that package the DNA in a condensed coil form and regulate chromosomal function. | [NCIT:C13203](http://purl.obolibrary.org/obo/NCIT_C13203)  | [HumanChromosomes.tsv](../../lookups/HumanChromosomes.tsv) lookup (24 choices [of type](http://purl.obolibrary.org/obo/NCIT_C13203)) |
| variantType | An attribute describing a type of variation inhering in a sequence feature or collection. | [GENO:0000773](http://purl.obolibrary.org/obo/GENO_0000773)  | string |
| position_start | The starting position of a sequence feature or interval. | [GENO:0000894](http://purl.obolibrary.org/obo/GENO_0000894)  | integer |
| position_end | The ending position of a sequence feature or interval. | [GENO:0000895](http://purl.obolibrary.org/obo/GENO_0000895)  | integer |
| position_assemblyId | The specific build of the human genome used as reference for this variant. | [EDAM:data_2340](http://edamontology.org/data_2340), [NCIT:C164388](http://purl.obolibrary.org/obo/NCIT_C164388)  | [GenomeAccessions.tsv](../../lookups/GenomeAccessions.tsv) lookup (29 choices [of type](http://edamontology.org/data_2787)) |
| position_refseqId | TODO unsure what is ment here - Refseq accession number of a transcript? | [NCIT:C45335](http://purl.obolibrary.org/obo/NCIT_C45335)  | string |
| identifiers_clinVarIds | NCBI resource that aggregates information about genomic variation and its relationship to human health. | [ENSGLOSSARY:0000242](http://ensembl.org/glossary/ENSGLOSSARY_0000242)  | string |
| identifiers_genomicHGVSId | HGVS genomic sequence variant nomenclature | [ENSGLOSSARY:0000274](http://ensembl.org/glossary/ENSGLOSSARY_0000274)  | string |
| identifiers_proteinHGVSIds | HGVS protein sequence variant nomenclature | [ENSGLOSSARY:0000274](http://ensembl.org/glossary/ENSGLOSSARY_0000274)  | string |
| identifiers_transcriptHGVSIds | HGVS transcript sequence variant nomenclature | [ENSGLOSSARY:0000274](http://ensembl.org/glossary/ENSGLOSSARY_0000274)  | string |
| identifiers_variantAlternativeIds | A backup sequence of characters used to identify an entity. | [NCIT:C90353](http://purl.obolibrary.org/obo/NCIT_C90353)  | string |
| molecularAttributes_aminoacidChanges | A variation in the amino acid sequence of a specific gene product. | [NCIT:C97928](http://purl.obolibrary.org/obo/NCIT_C97928)  | string |
| molecularAttributes_geneIds | A unique gene name within a specific repository, database, or collection. | [NCIT:C48664](http://purl.obolibrary.org/obo/NCIT_C48664)  | string |
| molecularAttributes_genomicFeatures | A sequence feature (continuous extent of biological sequence) that is of genomic origin (i.e. carries sequence from the genome of a cell or organism) | [GENO:0000481](http://purl.obolibrary.org/obo/GENO_0000481)  | string |
| molecularAttributes_molecularEffects | The effect that the variant has on each feature that it overlaps. A variant will have a consequence for each feature that it overlaps. | [ENSGLOSSARY:0000134](http://ensembl.org/glossary/ENSGLOSSARY_0000134)  | string |
| variantLevelData_clinicalInterpretations | The determination of the meaning of a clinical result. | [NCIT:C125009](http://purl.obolibrary.org/obo/NCIT_C125009)  | string |
| variantLevelData_phenotypicEffects | The likelihood of an entity to produce pathologic changes or disease. | [NCIT:C168796](http://purl.obolibrary.org/obo/NCIT_C168796)  | string |

## Module: Genomic variant observations
Observations of genomic variants in subjects and their relatives within the context of a given study that represents a genetic assessment. Ontology: [NCIT:C164404](http://purl.obolibrary.org/obo/NCIT_C164404) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Belongs to genomic variant description | Belongs to genomic variant description | [SIO:000628](http://semanticscience.org/resource/SIO_000628), [NCIT:C17248](http://purl.obolibrary.org/obo/NCIT_C17248)  | Reference to instances of Genomic variant descriptions |
| Allele 1 | One of a set of sequence features known to exist at a particular genomic location. | [GENO:0000512](http://purl.obolibrary.org/obo/GENO_0000512)  | string |
| Allele 2 | One of a set of sequence features known to exist at a particular genomic location. | [GENO:0000512](http://purl.obolibrary.org/obo/GENO_0000512)  | string |
| Zygosity | The genetic condition of a zygote, especially with respect to its being a homozygote or a heterozygote. | [NCIT:C45824](http://purl.obolibrary.org/obo/NCIT_C45824), [GENO:0000133](http://purl.obolibrary.org/obo/GENO_0000133)  | [Zygosity.tsv](../../lookups/Zygosity.tsv) lookup (14 choices [of type](http://purl.obolibrary.org/obo/GENO_0000133)) |
| Maternal allele 1 | One of a set of sequence features known to exist at a particular genomic location. | [GENO:0000878](http://purl.obolibrary.org/obo/GENO_0000878), [GENO:0000512](http://purl.obolibrary.org/obo/GENO_0000512)  | string |
| Maternal allele 2 | One of a set of sequence features known to exist at a particular genomic location. | [GENO:0000878](http://purl.obolibrary.org/obo/GENO_0000878), [GENO:0000512](http://purl.obolibrary.org/obo/GENO_0000512)  | string |
| Mother Read Depth | Read depth of maternal allele | [GENO:0000878](http://purl.obolibrary.org/obo/GENO_0000878), [NCIT:C155320](http://purl.obolibrary.org/obo/NCIT_C155320)  | integer |
| Mother Allele Frequency Allele 1 | Frequency of maternal allele 1 | [GENO:0000878](http://purl.obolibrary.org/obo/GENO_0000878), [NCIT:C173545](http://purl.obolibrary.org/obo/NCIT_C173545)  | decimal |
| Mother Allele Frequency Allele 2 | Frequency of maternal allele 2 | [GENO:0000878](http://purl.obolibrary.org/obo/GENO_0000878), [NCIT:C173545](http://purl.obolibrary.org/obo/NCIT_C173545)  | decimal |
| Mother Allelic Depth Allele 1 | Mother Allelic Depth Allele 1 | [GENO:0000878](http://purl.obolibrary.org/obo/GENO_0000878), [NCIT:C155320](http://purl.obolibrary.org/obo/NCIT_C155320)  | integer |
| Mother Allelic Depth Allele 2 | Mother Allelic Depth Allele 2 | [GENO:0000878](http://purl.obolibrary.org/obo/GENO_0000878), [NCIT:C155320](http://purl.obolibrary.org/obo/NCIT_C155320)  | integer |
| Paternal allele 1 | One of a set of sequence features known to exist at a particular genomic location. | [GENO:0000879](http://purl.obolibrary.org/obo/GENO_0000879), [GENO:0000512](http://purl.obolibrary.org/obo/GENO_0000512)  | string |
| Paternal allele 2 | One of a set of sequence features known to exist at a particular genomic location. | [GENO:0000879](http://purl.obolibrary.org/obo/GENO_0000879), [GENO:0000512](http://purl.obolibrary.org/obo/GENO_0000512)  | string |
| Father Read Depth | Father Read Depth | [GENO:0000879](http://purl.obolibrary.org/obo/GENO_0000879), [NCIT:C155320](http://purl.obolibrary.org/obo/NCIT_C155320)  | integer |
| Father Allele Frequency Allele 1 | Father Allele Frequency Allele 1 | [GENO:0000879](http://purl.obolibrary.org/obo/GENO_0000879), [NCIT:C173545](http://purl.obolibrary.org/obo/NCIT_C173545)  | decimal |
| Father Allele Frequency Allele 2 | Father Allele Frequency Allele 2 | [GENO:0000879](http://purl.obolibrary.org/obo/GENO_0000879), [NCIT:C173545](http://purl.obolibrary.org/obo/NCIT_C173545)  | decimal |
| Father Allelic Depth Allele 1 | Father Allelic Depth Allele 1 | [GENO:0000879](http://purl.obolibrary.org/obo/GENO_0000879), [NCIT:C155320](http://purl.obolibrary.org/obo/NCIT_C155320)  | integer |
| Father Allelic Depth Allele 2 | Father Allelic Depth Allele 2 | [GENO:0000879](http://purl.obolibrary.org/obo/GENO_0000879), [NCIT:C155320](http://purl.obolibrary.org/obo/NCIT_C155320)  | integer |
| Allele origin | A quality inhering in an allele that describes its genetic origin (how it came to be part of a cell's genome), i.e. whether it occurred de novo through some spontaneous mutation event, or was inherited from a parent. | [GENO:0000877](http://purl.obolibrary.org/obo/GENO_0000877)  | [AlleleOrigin.tsv](../../lookups/AlleleOrigin.tsv) lookup (5 choices [of type](http://purl.obolibrary.org/obo/GENO_0000877)) |

## Module: Genomic variant annotations
In-context information that has been associated with genomic variants. Ontology: [NCIT:C44272](http://purl.obolibrary.org/obo/NCIT_C44272) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Belongs to genomic variant description | Belongs to genomic variant description | [SIO:000628](http://semanticscience.org/resource/SIO_000628), [NCIT:C17248](http://purl.obolibrary.org/obo/NCIT_C17248)  | Reference to instances of Genomic variant descriptions |
| Transcript | The initial RNA molecule produced by transcription. | [NCIT:C1936](http://purl.obolibrary.org/obo/NCIT_C1936)  | string |
| Cdna | Single-stranded DNA that is complementary to messenger RNA or DNA that has been synthesized from messenger RNA by reverse transcriptase. | [NCIT:C324](http://purl.obolibrary.org/obo/NCIT_C324)  | string |
| Protein | A group of complex organic macromolecules composed of one or more chains (linear polymers) of alpha-L-amino acids linked by peptide bonds and ranging in size from a few thousand to over 1 million Daltons. Proteins are fundamental genetically encoded components of living cells with specific structures and functions dictated by amino acid sequence. | [NCIT:C17021](http://purl.obolibrary.org/obo/NCIT_C17021)  | string |
| Gene | A unique gene name within a specific repository, database, or collection. | [NCIT:C16612](http://purl.obolibrary.org/obo/NCIT_C16612)  | [Genes.tsv](../../lookups/Genes.tsv) lookup (19202 choices [of type](http://edamontology.org/data_2298)) |
| Exon | The sequences of a gene that are present in the final, mature, spliced messenger RNA molecule from that gene. | [NCIT:C13231](http://purl.obolibrary.org/obo/NCIT_C13231)  | integer |
| Variant comment | A written explanation, observation or criticism added to textual material. | [NCIT:C25393](http://purl.obolibrary.org/obo/NCIT_C25393)  | text |
| CADD score | CADD score | [ENSGLOSSARY:0000360](http://ensembl.org/glossary/ENSGLOSSARY_0000360)  | decimal |
| Gnomad | An aggregation of publicly available whole genome and whole exome variant calling experiments in human. GnomAD was previously known as ExAC, when it contained only exome data. Ensembl display population frequencies from gnomAD. | [ENSGLOSSARY:0000238](http://ensembl.org/glossary/ENSGLOSSARY_0000238)  | string |
| Gnomad link | Gnomad link | [ENSGLOSSARY:0000238](http://ensembl.org/glossary/ENSGLOSSARY_0000238)  | string |
| HGMD | HGMD | [ENSGLOSSARY:0000250](http://ensembl.org/glossary/ENSGLOSSARY_0000250)  | [HGMDOptions.tsv](../../lookups/HGMDOptions.tsv) lookup (3 choices [of type](http://purl.obolibrary.org/obo/NCIT_C25755)) |
| HGMD link | HGMD link | [ENSGLOSSARY:0000250](http://ensembl.org/glossary/ENSGLOSSARY_0000250)  | string |
| Phylop score | Phylop score | [VariO:0229](http://purl.obolibrary.org/obo/VariO_0229)  | decimal |
| Omim Inheritance | Omim Inheritance | [ENSGLOSSARY:0000244](http://ensembl.org/glossary/ENSGLOSSARY_0000244)  | [Inheritance.tsv](../../lookups/Inheritance.tsv) lookup (33 choices [of type](http://purl.obolibrary.org/obo/NCIT_C45827)) |
| OMIM morbid | OMIM morbid | [ENSGLOSSARY:0000244](http://ensembl.org/glossary/ENSGLOSSARY_0000244)  | string |
| Clinvar | NCBI resource that aggregates information about genomic variation and its relationship to human health. Ensembl display clinical significance and phenotypes from ClinVar. https://www.ncbi.nlm.nih.gov/clinvar/ | [ENSGLOSSARY:0000242](http://ensembl.org/glossary/ENSGLOSSARY_0000242)  | string |
| Pubmed | A web application from the National Library of Medicine (NLM). It provides a single query interface to over 15 million citations for biomedical articles back to the 1950's. These citations are from MEDLINE and additional life science journals. PubMed includes links to many sites providing full text articles and other related resources. | [NCIT:C42881](http://purl.obolibrary.org/obo/NCIT_C42881)  | string |
| VKGL | VKGL | [MAXO:0000698](http://purl.obolibrary.org/obo/MAXO_0000698)  | string |
| dbSNP | dbSNP | [ENSGLOSSARY:0000233](http://ensembl.org/glossary/ENSGLOSSARY_0000233)  | string |
| Polyphen 2 prediction | Polyphen 2 prediction | [VariO:0229](http://purl.obolibrary.org/obo/VariO_0229)  | [PolyPhen2Classifications.tsv](../../lookups/PolyPhen2Classifications.tsv) lookup (3 choices [of type](http://purl.obolibrary.org/obo/TXPO_0002566)) |
| Mutation taster | Mutation taster | [VariO:0229](http://purl.obolibrary.org/obo/VariO_0229)  | string |

## Module: Genomic variant interpretations
The determination of the meaning of a variant in clinical context. Ontology: [NCIT:C125009](http://purl.obolibrary.org/obo/NCIT_C125009) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Belongs to genomic variant annotation | Belongs to genomic variant annotation | [SIO:000628](http://semanticscience.org/resource/SIO_000628), [NCIT:C44272](http://purl.obolibrary.org/obo/NCIT_C44272)  | Reference to instances of Genomic variant annotations |
| Belongs to genomic variant observation | Belongs to genomic variant observation | [SIO:000628](http://semanticscience.org/resource/SIO_000628), [NCIT:C164404](http://purl.obolibrary.org/obo/NCIT_C164404)  | Reference to instances of Genomic variant descriptions |
| Panel | Gene panel | [NCIT:C173599](http://purl.obolibrary.org/obo/NCIT_C173599)  | string |
| Pipeline version | Pipeline version | [GENEPIO:0000152](http://purl.obolibrary.org/obo/GENEPIO_0000152)  | string |
| Date of analysis | The particular day, month and year an event has happened or will happen. | [NCIT:C25164](http://purl.obolibrary.org/obo/NCIT_C25164)  | date |
| Pipeline name | Pipeline name | [GENEPIO:0000151](http://purl.obolibrary.org/obo/GENEPIO_0000151)  | string |
| Assessment | The final result of a determination of the value, significance, or extent of. | [NCIT:C25217](http://purl.obolibrary.org/obo/NCIT_C25217)  | string |
| Date of Assessment | The date (and time) on which an assessment is completed. | [NCIT:C93511](http://purl.obolibrary.org/obo/NCIT_C93511)  | date |
| Reviewed by | Indicates the person or authoritative body who appraised, evaluated, or analyzed the item. | [NCIT:C42728](http://purl.obolibrary.org/obo/NCIT_C42728)  | Reference to instances of Person |
| assesmentLab | assesmentLab | [NCIT:C37984](http://purl.obolibrary.org/obo/NCIT_C37984)  | string |
| Curated text | Curated text | [NCIT:C48292](http://purl.obolibrary.org/obo/NCIT_C48292)  | text |
| Date of curation | A classification datum is a facet that classifies some entity. | [AFR:0001277](http://purl.allotrope.org/ontologies/result#AFR_0001277)  | date |
| Curator | The person in charge of the care and superintendence of something, especially a collection. | [NCIT:C69141](http://purl.obolibrary.org/obo/NCIT_C69141)  | Reference to instances of Person |
| Clinical variant classification | Classify variants based on their potential effect on genes, especially functional effects on the expressed proteins. | [operation:3225](http://edamontology.org/operation_3225), [NCIT:C118969](http://purl.obolibrary.org/obo/NCIT_C118969)  | [VariantClassification.tsv](../../lookups/VariantClassification.tsv) lookup (9 choices [of type](http://purl.obolibrary.org/obo/NCIT_C17248)) |
| VUS plus | VUS plus | [NCIT:C94187](http://purl.obolibrary.org/obo/NCIT_C94187)  | bool |
| Classification changed | Classification changed | [EDAM:operation_3225](http://edamontology.org/operation_3225), [DC:modified](http://purl.org/dc/terms/modified)  | bool |
| Modular pipeline | Modular pipeline | [OBI:0001943](http://purl.obolibrary.org/obo/OBI_0001943)  | string |
| Url to report | A Uniform Resource Locator (URL) | [data:1052](http://edamontology.org/data_1052)  | hyperlink |

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

