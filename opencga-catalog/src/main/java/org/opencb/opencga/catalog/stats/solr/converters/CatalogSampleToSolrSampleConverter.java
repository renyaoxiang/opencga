package org.opencb.opencga.catalog.stats.solr.converters;

import org.opencb.commons.datastore.core.ComplexTypeConverter;
import org.opencb.opencga.catalog.stats.solr.SampleSolrModel;
import org.opencb.opencga.core.models.Sample;

/**
 * Created by wasim on 27/06/18.
 */
public class CatalogSampleToSolrSampleConverter implements ComplexTypeConverter<Sample, SampleSolrModel> {

    // DONT NEED
    @Override
    public Sample convertToDataModelType(SampleSolrModel sampleSolrModel) {
        try {
            throw new Exception("Not supported operation!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public SampleSolrModel convertToStorageType(Sample sample) {

        SampleSolrModel sampleSolrModel = new SampleSolrModel();

        sampleSolrModel.setUid(sample.getUid());
        sampleSolrModel.setSource(sample.getSource());

        if (sample.getIndividual() != null) {
            sampleSolrModel.setIndividualUuid(sample.getIndividual().getUuid());
            sampleSolrModel.setIndividualEthnicity(sample.getIndividual().getEthnicity());
            if (sample.getIndividual().getKaryotypicSex() != null) {
                sampleSolrModel.setIndividualKaryotypicSex(sample.getIndividual().getKaryotypicSex().name());
            }
            if (sample.getIndividual().getPopulation() != null) {
                sampleSolrModel.setIndividualPopulation(sample.getIndividual().getPopulation().getName());
            }
        }
        sampleSolrModel.setRelease(sample.getRelease());
        sampleSolrModel.setVersion(sample.getVersion());
        sampleSolrModel.setCreationDate(sample.getCreationDate());
        sampleSolrModel.setStatus(sample.getStatus().getName());
        sampleSolrModel.setType(sample.getType());
        sampleSolrModel.setSomatic(sample.isSomatic());

        if (sample.getPhenotypes() != null) {
            sampleSolrModel.setPhenotypes(SolrConverterUtil.populatePhenotypes(sample.getPhenotypes()));
        }
        if (sample.getAnnotationSets() != null) {
            sampleSolrModel.setAnnotations(SolrConverterUtil.populateAnnotations(sample.getAnnotationSets()));
        }

        return sampleSolrModel;
    }

    public CatalogSampleToSolrSampleConverter() {
    }
}
