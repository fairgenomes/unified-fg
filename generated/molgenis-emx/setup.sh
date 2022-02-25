mcmd import -p sys_md_Package.tsv
mcmd import -p studies_inclusioncriteria_attributes.tsv --as attributes --in unified-schema
mcmd import -p studies_currentstudystatus_attributes.tsv --as attributes --in unified-schema
mcmd import -p subjects_genderidentity_attributes.tsv --as attributes --in unified-schema
mcmd import -p subjects_genderatbirth_attributes.tsv --as attributes --in unified-schema
mcmd import -p subjects_genotypicsex_attributes.tsv --as attributes --in unified-schema
mcmd import -p subjects_countryofresidence_attributes.tsv --as attributes --in unified-schema
mcmd import -p subjects_ancestry_attributes.tsv --as attributes --in unified-schema
mcmd import -p subjects_countryofbirth_attributes.tsv --as attributes --in unified-schema
mcmd import -p subjects_inclusionstatus_attributes.tsv --as attributes --in unified-schema
mcmd import -p subjects_primaryaffiliatedinstitute_attributes.tsv --as attributes --in unified-schema
mcmd import -p subjects_resourcesinotherinstitutes_attributes.tsv --as attributes --in unified-schema
mcmd import -p studies_inclusioncriteria.tsv --as fair-genomes_studies_inclusioncriteria --in unified-schema
mcmd import -p studies_currentstudystatus.tsv --as fair-genomes_studies_currentstudystatus --in unified-schema
mcmd import -p subjects_genderidentity.tsv --as fair-genomes_subjects_genderidentity --in unified-schema
mcmd import -p subjects_genderatbirth.tsv --as fair-genomes_subjects_genderatbirth --in unified-schema
mcmd import -p subjects_genotypicsex.tsv --as fair-genomes_subjects_genotypicsex --in unified-schema
mcmd import -p subjects_countryofresidence.tsv --as fair-genomes_subjects_countryofresidence --in unified-schema
mcmd import -p subjects_ancestry.tsv --as fair-genomes_subjects_ancestry --in unified-schema
mcmd import -p subjects_countryofbirth.tsv --as fair-genomes_subjects_countryofbirth --in unified-schema
mcmd import -p subjects_inclusionstatus.tsv --as fair-genomes_subjects_inclusionstatus --in unified-schema
mcmd import -p subjects_primaryaffiliatedinstitute.tsv --as fair-genomes_subjects_primaryaffiliatedinstitute --in unified-schema
mcmd import -p subjects_resourcesinotherinstitutes.tsv --as fair-genomes_subjects_resourcesinotherinstitutes --in unified-schema
mcmd import -p studies_attributes.tsv --as attributes --in unified-schema
mcmd import -p datareleases_attributes.tsv --as attributes --in unified-schema
mcmd import -p subjects_attributes.tsv --as attributes --in unified-schema
mcmd import -p ../../misc/molgenis/other/sys_StaticContent.tsv -a add_update_existing
mcmd add logo -p ../../misc/molgenis/img/analysis.png
mcmd add logo -p ../../misc/molgenis/img/lookups.png
mcmd add logo -p ../../misc/molgenis/img/clinical.png
mcmd add logo -p ../../misc/molgenis/img/leafletandconsentform.png
mcmd add logo -p ../../misc/molgenis/img/individualconsent.png
mcmd add logo -p ../../misc/molgenis/img/contribute.png
mcmd add logo -p ../../misc/molgenis/img/info.png
mcmd add logo -p ../../misc/molgenis/img/material.png
mcmd add logo -p ../../misc/molgenis/img/personal.png
mcmd add logo -p ../../misc/molgenis/img/samplepreparation.png
mcmd add logo -p ../../misc/molgenis/img/sequencing.png
mcmd add logo -p ../../misc/molgenis/img/study.png
mcmd add logo -p ../../misc/molgenis/img/fair_genomes_logo_notext.png
mcmd add logo -p ../../misc/molgenis/img/fair_genomes_logo_long.png
mcmd add logo -p ../../misc/molgenis/img/fair_genomes_logo_white.png
mcmd make --role ANONYMOUS fair-genomes_EDITOR
mcmd give anonymous view sys_md
