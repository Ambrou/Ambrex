/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jenkinsci.plugins.Ambrex;

import static java.util.Arrays.asList;
import java.util.List;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.embedder.EmbedderControls;
import org.jbehave.core.failures.SilentlyAbsorbingFailure;
import org.jbehave.core.io.CodeLocations;
import static org.jbehave.core.io.CodeLocations.*;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.MarkUnmatchedStepsAsPending;
import org.jbehave.core.steps.StepFinder;
import org.jbehave.core.steps.StepFinder.ByLevenshteinDistance;
import org.junit.Test;

/**
 *
 * @author apetitgenet
 */
public class jBehaveRunnerTest {
    private Class<?> embedderClass;
    
    @Test
    public void runClasspathLoadedStoriesAsJUnit() {
        // Embedder defines the configuration and candidate steps
        Embedder embedder = new TraderEmbedder();
        String codeLocation = codeLocationFromClass(this.getClass()).getFile();
        System.out.println(codeLocation);
        List<String> storyPaths = new StoryFinder().findPaths(codeLocation, asList("**/basic_arithmetic.story"), asList(""), "file://" + codeLocation);
        
        embedder.runStoriesAsPaths(storyPaths);
        //embedder.runStoriesAsPaths(embedder.storyPaths());
    //    runStories("basic_arithmetic.story");
    }
    
    
         
    
    private void runStories(String... storyPaths) {
        StoryReporterBuilder storyReporterBuilder = new StoryReporterBuilder().withDefaultFormats()
                .withCodeLocation(CodeLocations.codeLocationFromClass(jBehaveRunnerTest.class))
                .withFormats(Format.XML);

        Configuration configuration = new MostUsefulConfiguration()
                .useStoryLoader(new LoadFromClasspath(this.getClass())).useStoryReporterBuilder(storyReporterBuilder)
                .useFailureStrategy(new SilentlyAbsorbingFailure())
                .useStepCollector(new MarkUnmatchedStepsAsPending(new StepFinder(new ByLevenshteinDistance())));

        Embedder embedder = new Embedder();
        embedder.useEmbedderControls(new EmbedderControls().doGenerateViewAfterStories(false));
        embedder.useConfiguration(configuration);
        embedder.useCandidateSteps(new InstanceStepsFactory(configuration, new StepjBehave()).createCandidateSteps());
        embedder.useMetaFilters(asList("-skip true"));

        try {
            embedder.runStoriesAsPaths(asList(storyPaths));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
