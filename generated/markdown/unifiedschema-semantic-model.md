# Unified metadata schema

The unified semantic metadata schema to power reuse of NGS data in research and healthcare. Version 0.1-SNAPSHOT, 2022-02-23. This model consists of __8 modules__ that contain __121 metadata elements__ and __100042 lookups__ in total (excluding null flavors).

## Module overview

| Name | Description | Ontology | Nr. of elements |
|---|---|---|---|
| [Studies](#module-studies) | A detailed examination, analysis, or critical inspection of one or multiple subjects designed to discover facts. | [NCIT:C63536](http://purl.obolibrary.org/obo/NCIT_C63536)  | 15 |
| [Data releases](#module-data-releases) | The act of making data or other structured information accessible to the public or to the user group of a database. | [NCIT:C172217](http://purl.obolibrary.org/obo/NCIT_C172217), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 2 |
| [Subjects](#module-subjects) | Persons who are observed, analyzed, examined, investigated, experimented upon, or/and treated in the course of a particular study. | [NCIT:C90492](http://purl.obolibrary.org/obo/NCIT_C90492), [ExO:0000127](http://purl.obolibrary.org/obo/ExO_0000127), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 29 |
| [Clinical](#module-clinical) | Findings and circumstances relating to the examination and treatment of a patient. | [NCIT:C25398](http://purl.obolibrary.org/obo/NCIT_C25398), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 25 |
| [Materials](#module-materials) | A natural substance derived from living organisms such as cells, tissues, proteins, and DNA. | [NCIT:C43376](http://purl.obolibrary.org/obo/NCIT_C43376), [SCDO:0002829](http://purl.obolibrary.org/obo/SCDO_0002829), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 25 |
| [Sampling protocols](#module-sampling-protocols) | Describes the procedure whereby biological samples for an experiment are sourced. | [EFO:0005518](http://www.ebi.ac.uk/efo/EFO_0005518), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 5 |
| [NGS sample preparation](#module-ngs-sample-preparation) | A sample preparation for a nucleic acids sequencing assay. | [OBI:0001902](http://purl.obolibrary.org/obo/OBI_0001902), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 14 |
| [Laboratory Procedures](#module-laboratory-procedures) | Any procedure that involves testing or manipulating a sample of blood, urine, or other body substance in a laboratory setting. | [NCIT:C25294](http://purl.obolibrary.org/obo/NCIT_C25294), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset)  | 6 |

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
| Consanguinity | Information on whether the patient is a child from two family members who are second cousins or closer. | [OMIT:0004546](http://purl.obolibrary.org/obo/OMIT_0004546), [SNOMED:842009](http://snomed.info/id/842009)  | bool |
| Belongs to study | Reference to the study or studies in which this person participates. | [RO:0000056](http://purl.obolibrary.org/obo/RO_0000056)  | Reference to instances of Studies |
| Belongs to data release | The act of making data or other structured information accessible to the public or to the user group of a database. | [NCIT:C172217](http://purl.obolibrary.org/obo/NCIT_C172217)  | Reference to instances of Data releases |

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
| Belongs to data release | The act of making data or other structured information accessible to the public or to the user group of a database. | [NCIT:C172217](http://purl.obolibrary.org/obo/NCIT_C172217)  | Reference to instances of Data releases |
| Family members affected | Family members related by descent rather than by marriage or law who were diagnosed with the same condition as the individual who is the primary focus of investigation (i.e. the proband). | [HP:0032320](http://purl.obolibrary.org/obo/HP_0032320)  | [FamilyMembers.tsv](../../lookups/FamilyMembers.tsv) lookup (41 choices [of type](http://purl.obolibrary.org/obo/NCIT_C71384)) |
| Family members sequenced | Family members related by descent rather than by marriage or law who were also tested by next-generation sequencing. | [NCIT:C79916](http://purl.obolibrary.org/obo/NCIT_C79916)  | [FamilyMembers.tsv](../../lookups/FamilyMembers.tsv) lookup (41 choices [of type](http://purl.obolibrary.org/obo/NCIT_C71384)) |
| Functioning | Patient's classification of functioning i.e. disability profile according to International Classification of Functioning and Disability (ICF). | [NCIT:C21007](http://purl.obolibrary.org/obo/NCIT_C21007)  | text |
| Material used in diagnosis | This diagnosis c.q. clinical examination is based on one or more sampled materials. | [SIO:000641](http://semanticscience.org/resource/SIO_000641)  | string |

## Module: Materials
A natural substance derived from living organisms such as cells, tissues, proteins, and DNA. Ontology: [NCIT:C43376](http://purl.obolibrary.org/obo/NCIT_C43376), [SCDO:0002829](http://purl.obolibrary.org/obo/SCDO_0002829), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Identifier | Name or other identifier of an entry from a biosample database. | [EDAM:data_3273](http://edamontology.org/data_3273), [NCIT:C93400](http://purl.obolibrary.org/obo/NCIT_C93400)  | identifier |
| Alternative identifiers | A backup sequence of characters used to identify an entity. | [NCIT:C90353](http://purl.obolibrary.org/obo/NCIT_C90353)  | string |
| Collected from person | Reference to the subject from whom this material was collected. | [SIO:000244](http://semanticscience.org/resource/SIO_000244), [NCIT:C142495](http://purl.obolibrary.org/obo/NCIT_C142495)  | Reference to instances of Subjects |
| Belongs to request | A sequence of letters, numbers, or other characters that specifically identifies a particular order. | [NCIT:C164567](http://purl.obolibrary.org/obo/NCIT_C164567)  | string |
| Belongs to data release | The act of making data or other structured information accessible to the public or to the user group of a database. | [NCIT:C172217](http://purl.obolibrary.org/obo/NCIT_C172217)  | Reference to instances of Data releases |
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
| Biospecimen type | The type of material taken from a biological entity for testing, diagnostic, propagation, treatment or research purposes. | [NCIT:C70713](http://purl.obolibrary.org/obo/NCIT_C70713)  | [BiospecimenTypes.tsv](../../lookups/BiospecimenTypes.tsv) lookup (403 choices [of type](http://purl.obolibrary.org/obo/NCIT_C70699)) |
| Anatomical source | Biological entity that constitutes the structural organization of an individual member of a biological species from which this material was taken. | [NCIT:C103264](http://purl.obolibrary.org/obo/NCIT_C103264)  | [AnatomicalSources.tsv](../../lookups/AnatomicalSources.tsv) lookup (13827 choices [of type](http://purl.obolibrary.org/obo/UBERON_0001062)) |
| Pathological state | The pathological state of the tissue from which this material was derived. | [GO:0001894](http://purl.obolibrary.org/obo/GO_0001894)  | [PathologicalState.tsv](../../lookups/PathologicalState.tsv) lookup (4 choices [of type](http://purl.obolibrary.org/obo/NCIT_C164617)) |
| Biospecimen usability | An indication as to whether a biospecimen is suitable for testing purposes. | [NCIT:C171004](http://purl.obolibrary.org/obo/NCIT_C171004)  | bool |
| Storage conditions | The conditions under which this biological material was stored. | [NCIT:C96145](http://purl.obolibrary.org/obo/NCIT_C96145)  | [StorageConditions.tsv](../../lookups/StorageConditions.tsv) lookup (26 choices [of type](http://purl.obolibrary.org/obo/NCIT_C96145)) |
| Expiration date | The date beyond which this material is no longer regarded as fit for use. | [NCIT:C164516](http://purl.obolibrary.org/obo/NCIT_C164516)  | date |
| Percentage tumor cells | The percentage of tumor cells compared to total cells present in this material. | [NCIT:C127771](http://purl.obolibrary.org/obo/NCIT_C127771)  | decimal |
| Physical location | A place on the Earth where this material is located, by its name or by its geographical location. This definition is intentionally vague to allow reuse locally (e.g. which freezer), for contacting (e.g. which institute), broadly for logistical or legal reasons (e.g. city, country or continent). | [GAZ:00000448](http://purl.obolibrary.org/obo/GAZ_00000448)  | string |
| Analyses performed | Reports the existence of any analyses performed on this material other than genomics (e.g. transcriptomics, metabolomics, proteomics). | [IAO:0000702](http://purl.obolibrary.org/obo/IAO_0000702)  | [AnalysesPerformed.tsv](../../lookups/AnalysesPerformed.tsv) lookup (20 choices [of type](http://edamontology.org/topic_3391)) |
| Derived from | Indicate if this material was produced from or related to another. | [NCIT:C28355](http://purl.obolibrary.org/obo/NCIT_C28355)  | string |

## Module: Sampling protocols
Describes the procedure whereby biological samples for an experiment are sourced. Ontology: [EFO:0005518](http://www.ebi.ac.uk/efo/EFO_0005518), [dcat:Dataset](https://www.w3.org/TR/vocab-dcat-3/#Property:catalog_dataset) .

| Element | Description | Ontology | Values |
|---|---|---|---|
| Identifier | One or more characters used to identify, name, or characterize the nature, properties, or contents of a thing. | [NCIT:C25364](http://purl.obolibrary.org/obo/NCIT_C25364)  | identifier |
| Name | The words or language units by which a thing is known. | [NCIT:C42614](http://purl.obolibrary.org/obo/NCIT_C42614)  | string |
| Description | A written or verbal account, representation, statement, or explanation of something. | [NCIT:C25365](http://purl.obolibrary.org/obo/NCIT_C25365)  | text |
| Version | A form or variant of a type or original; one of a sequence of copies of a program, each incorporating new modifications. | [NCIT:C25714](http://purl.obolibrary.org/obo/NCIT_C25714)  | string |
| IRI | A unique symbol that establishes identity of the resource. | [NCIT:C165071](http://purl.obolibrary.org/obo/NCIT_C165071)  | hyperlink |

## Module: NGS sample preparation
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
| Belongs to data release | The act of making data or other structured information accessible to the public or to the user group of a database. | [NCIT:C172217](http://purl.obolibrary.org/obo/NCIT_C172217)  | Reference to instances of Data releases |

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

