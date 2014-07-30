/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jenkinsci.plugins.Ambrex;

import java.text.SimpleDateFormat;
import static java.util.Arrays.asList;
import java.util.List;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.embedder.EmbedderControls;
import org.jbehave.core.io.CodeLocations;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.parsers.RegexPrefixCapturingPatternParser;
import org.jbehave.core.reporters.CrossReference;
import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.core.reporters.Format.HTML;
import static org.jbehave.core.reporters.Format.TXT;
import static org.jbehave.core.reporters.Format.XML;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.ParameterConverters;
import org.jbehave.core.steps.ParameterConverters.DateConverter;
import org.jbehave.core.steps.SilentStepMonitor;

/**
 *
 * @author apetitgenet
 */
public class TraderEmbedder extends Embedder {
   /* 
    @Override
    public EmbedderControls embedderControls() {
        return new EmbedderControls().doIgnoreFailureInStories(true).doIgnoreFailureInView(true);
    }
 
    @Override
    public Configuration configuration() {
        Class<? extends TraderEmbedder> embedderClass = this.getClass();
        return new MostUsefulConfiguration()
            .useStoryLoader(new LoadFromClasspath(embedderClass.getClassLoader()))
            .useStoryReporterBuilder(new StoryReporterBuilder()
                .withCodeLocation(CodeLocations.codeLocationFromClass(embedderClass))
                .withDefaultFormats()
                .withFormats(CONSOLE, TXT, HTML, XML)
                .withCrossReference(new CrossReference()))
            .useParameterConverters(new ParameterConverters()
                    .addConverters(new DateConverter(new SimpleDateFormat("yyyy-MM-dd")))) // use custom date pattern
            .useStepPatternParser(new RegexPrefixCapturingPatternParser(
                            "%")) // use '%' instead of '$' to identify parameters
            .useStepMonitor(new SilentStepMonitor());                              
    }
 
    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new StepjBehave());
    }*/
    
    
    @Override  public Configuration configuration() {
        return new MostUsefulConfiguration();
    }
    
    @Override public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(),
                new BaconCookingSteps());
    }
}
