/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jenkinsci.plugins.Ambrex;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import org.jbehave.core.Embeddable;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
/**
 *
 * @author apetitgenet
 */
public abstract class ConfigurableEmbedder implements Embeddable {

    private Embedder embedder = new Embedder();
    private Configuration configuration;
    private InjectableStepsFactory stepsFactory;
    private List<CandidateSteps> candidateSteps;

    public void useEmbedder(Embedder embedder) {
        this.embedder = embedder;
    }
/*
    public void useConfiguration(Configuration configuration) {
            this.configuration = configuration;
    }

    public Configuration configuration() {
        return configuration;
    }

    public boolean hasConfiguration() {
        return configuration != null;
    }
*/
    	/**
    * @deprecated Use {@link #stepsFactory()}
    */
    public List<CandidateSteps> candidateSteps() {
        return candidateSteps;
    }
/*
    public void useStepsFactory(InjectableStepsFactory stepsFactory) {
        this.stepsFactory = stepsFactory;
    }

    public InjectableStepsFactory stepsFactory() {
        return stepsFactory;
    }
*/
    public boolean hasStepsFactory() {
        return stepsFactory != null;
    }

    public Embedder configuredEmbedder() {
        if (configuration == null) {
            configuration = configuration();
        }
        embedder.useConfiguration(configuration);
        if (candidateSteps == null) {
            candidateSteps = candidateSteps();
        }
        embedder.useCandidateSteps(candidateSteps);
        if (stepsFactory == null) {
            stepsFactory = stepsFactory();
        }
        embedder.useStepsFactory(stepsFactory);
        return embedder;
    }
    
    
    public Configuration configuration() {
        return new MostUsefulConfiguration();
    }
 
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(),
                new BaconCookingSteps());
    }

}

