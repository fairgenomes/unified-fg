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
mcmd import -p clinical_observedphenotype_attributes.tsv --as attributes --in unified-schema
mcmd import -p clinical_unobservedphenotype_attributes.tsv --as attributes --in unified-schema
mcmd import -p clinical_provisionalphenotype_attributes.tsv --as attributes --in unified-schema
mcmd import -p clinical_clinicaldiagnosis_attributes.tsv --as attributes --in unified-schema
mcmd import -p clinical_moleculardiagnosisgene_attributes.tsv --as attributes --in unified-schema
mcmd import -p clinical_medication_attributes.tsv --as attributes --in unified-schema
mcmd import -p clinical_medicalhistory_attributes.tsv --as attributes --in unified-schema
mcmd import -p clinical_phenotypicdataavailable_attributes.tsv --as attributes --in unified-schema
mcmd import -p clinical_statusofdiagnosis_attributes.tsv --as attributes --in unified-schema
mcmd import -p clinical_familymembersaffected_attributes.tsv --as attributes --in unified-schema
mcmd import -p clinical_familymemberssequenced_attributes.tsv --as attributes --in unified-schema
mcmd import -p materials_reasonforsampling_attributes.tsv --as attributes --in unified-schema
mcmd import -p materials_biospecimentype_attributes.tsv --as attributes --in unified-schema
mcmd import -p materials_anatomicalsource_attributes.tsv --as attributes --in unified-schema
mcmd import -p materials_pathologicalstate_attributes.tsv --as attributes --in unified-schema
mcmd import -p materials_storageconditions_attributes.tsv --as attributes --in unified-schema
mcmd import -p materials_analysesperformed_attributes.tsv --as attributes --in unified-schema
mcmd import -p ngssamplepreparations_librarypreparationkit_attributes.tsv --as attributes --in unified-schema
mcmd import -p ngssamplepreparations_targetenrichmentkit_attributes.tsv --as attributes --in unified-schema
mcmd import -p sequencingruns_reasonforsequencing_attributes.tsv --as attributes --in unified-schema
mcmd import -p sequencingruns_sequencingfacilityorganization_attributes.tsv --as attributes --in unified-schema
mcmd import -p sequencingruns_sequencingplatform_attributes.tsv --as attributes --in unified-schema
mcmd import -p sequencingruns_sequencinginstrumentmodel_attributes.tsv --as attributes --in unified-schema
mcmd import -p sequencingruns_sequencingmethod_attributes.tsv --as attributes --in unified-schema
mcmd import -p files_filestatus_attributes.tsv --as attributes --in unified-schema
mcmd import -p signedconsent_representedby_attributes.tsv --as attributes --in unified-schema
mcmd import -p signedconsent_datausepermissions_attributes.tsv --as attributes --in unified-schema
mcmd import -p signedconsent_datausemodifiers_attributes.tsv --as attributes --in unified-schema
mcmd import -p signedconsent_allowrecontacting_attributes.tsv --as attributes --in unified-schema
mcmd import -p leafletandconsentform_consentformcreator_attributes.tsv --as attributes --in unified-schema
mcmd import -p ngsanalysis_dataformatsstored_attributes.tsv --as attributes --in unified-schema
mcmd import -p ngsanalysis_referencegenomeused_attributes.tsv --as attributes --in unified-schema
mcmd import -p metabolomicmaterialprocessing_processingtype_attributes.tsv --as attributes --in unified-schema
mcmd import -p metabolomicmassspecassays_assaytype_attributes.tsv --as attributes --in unified-schema
mcmd import -p metabolomicanalyses_analysistype_attributes.tsv --as attributes --in unified-schema
mcmd import -p metabolomicanalyses_dataformatsstored_attributes.tsv --as attributes --in unified-schema
mcmd import -p genomicvariantdescriptions_humanchromosome_attributes.tsv --as attributes --in unified-schema
mcmd import -p genomicvariantdescriptions_position_assemblyid_attributes.tsv --as attributes --in unified-schema
mcmd import -p genomicvariantobservations_zygosity_attributes.tsv --as attributes --in unified-schema
mcmd import -p genomicvariantobservations_alleleorigin_attributes.tsv --as attributes --in unified-schema
mcmd import -p genomicvariantannotations_gene_attributes.tsv --as attributes --in unified-schema
mcmd import -p genomicvariantannotations_hgmd_attributes.tsv --as attributes --in unified-schema
mcmd import -p genomicvariantannotations_omiminheritance_attributes.tsv --as attributes --in unified-schema
mcmd import -p genomicvariantannotations_polyphen2prediction_attributes.tsv --as attributes --in unified-schema
mcmd import -p genomicvariantinterpretations_clinicalvariantclassification_attributes.tsv --as attributes --in unified-schema
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
mcmd import -p clinical_observedphenotype.tsv --as fair-genomes_clinical_observedphenotype --in unified-schema
mcmd import -p clinical_unobservedphenotype.tsv --as fair-genomes_clinical_unobservedphenotype --in unified-schema
mcmd import -p clinical_provisionalphenotype.tsv --as fair-genomes_clinical_provisionalphenotype --in unified-schema
mcmd import -p clinical_clinicaldiagnosis.tsv --as fair-genomes_clinical_clinicaldiagnosis --in unified-schema
mcmd import -p clinical_moleculardiagnosisgene.tsv --as fair-genomes_clinical_moleculardiagnosisgene --in unified-schema
mcmd import -p clinical_medication.tsv --as fair-genomes_clinical_medication --in unified-schema
mcmd import -p clinical_medicalhistory.tsv --as fair-genomes_clinical_medicalhistory --in unified-schema
mcmd import -p clinical_phenotypicdataavailable.tsv --as fair-genomes_clinical_phenotypicdataavailable --in unified-schema
mcmd import -p clinical_statusofdiagnosis.tsv --as fair-genomes_clinical_statusofdiagnosis --in unified-schema
mcmd import -p clinical_familymembersaffected.tsv --as fair-genomes_clinical_familymembersaffected --in unified-schema
mcmd import -p clinical_familymemberssequenced.tsv --as fair-genomes_clinical_familymemberssequenced --in unified-schema
mcmd import -p materials_reasonforsampling.tsv --as fair-genomes_materials_reasonforsampling --in unified-schema
mcmd import -p materials_biospecimentype.tsv --as fair-genomes_materials_biospecimentype --in unified-schema
mcmd import -p materials_anatomicalsource.tsv --as fair-genomes_materials_anatomicalsource --in unified-schema
mcmd import -p materials_pathologicalstate.tsv --as fair-genomes_materials_pathologicalstate --in unified-schema
mcmd import -p materials_storageconditions.tsv --as fair-genomes_materials_storageconditions --in unified-schema
mcmd import -p materials_analysesperformed.tsv --as fair-genomes_materials_analysesperformed --in unified-schema
mcmd import -p ngssamplepreparations_librarypreparationkit.tsv --as fair-genomes_ngssamplepreparations_librarypreparationkit --in unified-schema
mcmd import -p ngssamplepreparations_targetenrichmentkit.tsv --as fair-genomes_ngssamplepreparations_targetenrichmentkit --in unified-schema
mcmd import -p sequencingruns_reasonforsequencing.tsv --as fair-genomes_sequencingruns_reasonforsequencing --in unified-schema
mcmd import -p sequencingruns_sequencingfacilityorganization.tsv --as fair-genomes_sequencingruns_sequencingfacilityorganization --in unified-schema
mcmd import -p sequencingruns_sequencingplatform.tsv --as fair-genomes_sequencingruns_sequencingplatform --in unified-schema
mcmd import -p sequencingruns_sequencinginstrumentmodel.tsv --as fair-genomes_sequencingruns_sequencinginstrumentmodel --in unified-schema
mcmd import -p sequencingruns_sequencingmethod.tsv --as fair-genomes_sequencingruns_sequencingmethod --in unified-schema
mcmd import -p files_filestatus.tsv --as fair-genomes_files_filestatus --in unified-schema
mcmd import -p signedconsent_representedby.tsv --as fair-genomes_signedconsent_representedby --in unified-schema
mcmd import -p signedconsent_datausepermissions.tsv --as fair-genomes_signedconsent_datausepermissions --in unified-schema
mcmd import -p signedconsent_datausemodifiers.tsv --as fair-genomes_signedconsent_datausemodifiers --in unified-schema
mcmd import -p signedconsent_allowrecontacting.tsv --as fair-genomes_signedconsent_allowrecontacting --in unified-schema
mcmd import -p leafletandconsentform_consentformcreator.tsv --as fair-genomes_leafletandconsentform_consentformcreator --in unified-schema
mcmd import -p ngsanalysis_dataformatsstored.tsv --as fair-genomes_ngsanalysis_dataformatsstored --in unified-schema
mcmd import -p ngsanalysis_referencegenomeused.tsv --as fair-genomes_ngsanalysis_referencegenomeused --in unified-schema
mcmd import -p metabolomicmaterialprocessing_processingtype.tsv --as fair-genomes_metabolomicmaterialprocessing_processingtype --in unified-schema
mcmd import -p metabolomicmassspecassays_assaytype.tsv --as fair-genomes_metabolomicmassspecassays_assaytype --in unified-schema
mcmd import -p metabolomicanalyses_analysistype.tsv --as fair-genomes_metabolomicanalyses_analysistype --in unified-schema
mcmd import -p metabolomicanalyses_dataformatsstored.tsv --as fair-genomes_metabolomicanalyses_dataformatsstored --in unified-schema
mcmd import -p genomicvariantdescriptions_humanchromosome.tsv --as fair-genomes_genomicvariantdescriptions_humanchromosome --in unified-schema
mcmd import -p genomicvariantdescriptions_position_assemblyid.tsv --as fair-genomes_genomicvariantdescriptions_position_assemblyid --in unified-schema
mcmd import -p genomicvariantobservations_zygosity.tsv --as fair-genomes_genomicvariantobservations_zygosity --in unified-schema
mcmd import -p genomicvariantobservations_alleleorigin.tsv --as fair-genomes_genomicvariantobservations_alleleorigin --in unified-schema
mcmd import -p genomicvariantannotations_gene.tsv --as fair-genomes_genomicvariantannotations_gene --in unified-schema
mcmd import -p genomicvariantannotations_hgmd.tsv --as fair-genomes_genomicvariantannotations_hgmd --in unified-schema
mcmd import -p genomicvariantannotations_omiminheritance.tsv --as fair-genomes_genomicvariantannotations_omiminheritance --in unified-schema
mcmd import -p genomicvariantannotations_polyphen2prediction.tsv --as fair-genomes_genomicvariantannotations_polyphen2prediction --in unified-schema
mcmd import -p genomicvariantinterpretations_clinicalvariantclassification.tsv --as fair-genomes_genomicvariantinterpretations_clinicalvariantclassification --in unified-schema
mcmd import -p studies_attributes.tsv --as attributes --in unified-schema
mcmd import -p person_attributes.tsv --as attributes --in unified-schema
mcmd import -p datareleases_attributes.tsv --as attributes --in unified-schema
mcmd import -p subjects_attributes.tsv --as attributes --in unified-schema
mcmd import -p clinical_attributes.tsv --as attributes --in unified-schema
mcmd import -p materials_attributes.tsv --as attributes --in unified-schema
mcmd import -p samplingprotocols_attributes.tsv --as attributes --in unified-schema
mcmd import -p ngssamplepreparations_attributes.tsv --as attributes --in unified-schema
mcmd import -p laboratoryprocedures_attributes.tsv --as attributes --in unified-schema
mcmd import -p sequencingruns_attributes.tsv --as attributes --in unified-schema
mcmd import -p files_attributes.tsv --as attributes --in unified-schema
mcmd import -p cohorts_attributes.tsv --as attributes --in unified-schema
mcmd import -p signedconsent_attributes.tsv --as attributes --in unified-schema
mcmd import -p leafletandconsentform_attributes.tsv --as attributes --in unified-schema
mcmd import -p ngsanalysis_attributes.tsv --as attributes --in unified-schema
mcmd import -p metabolomicmaterialprocessing_attributes.tsv --as attributes --in unified-schema
mcmd import -p metabolomicmassspecassays_attributes.tsv --as attributes --in unified-schema
mcmd import -p metabolomicanalyses_attributes.tsv --as attributes --in unified-schema
mcmd import -p genomicvariantdescriptions_attributes.tsv --as attributes --in unified-schema
mcmd import -p genomicvariantobservations_attributes.tsv --as attributes --in unified-schema
mcmd import -p genomicvariantannotations_attributes.tsv --as attributes --in unified-schema
mcmd import -p genomicvariantinterpretations_attributes.tsv --as attributes --in unified-schema
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
