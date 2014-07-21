/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jenkinsci.plugins.Ambrex;
/*
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 *
 * @author apetitgenet
 *//*
@RunWith(Cucumber.class)
@CucumberOptions(format = "json:target/cucumber-report.json", dotcucumber = ".cucumber")
public class RunCukesTest {
}

*/


import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;
import java.text.SimpleDateFormat;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.Properties;
import org.jbehave.core.Embeddable;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.StoryControls;
import org.jbehave.core.failures.FailingUponPendingStep;
import org.jbehave.core.failures.PendingStepStrategy;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.io.CodeLocations;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.model.ExamplesTableFactory;
import org.jbehave.core.parsers.RegexPrefixCapturingPatternParser;
import org.jbehave.core.parsers.RegexStoryParser;
import org.jbehave.core.reporters.CrossReference;
import org.jbehave.core.reporters.Format;
import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.core.reporters.Format.HTML_TEMPLATE;
import static org.jbehave.core.reporters.Format.TXT;
import static org.jbehave.core.reporters.Format.XML_TEMPLATE;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.ParameterConverters;
import org.jbehave.core.steps.ParameterConverters.DateConverter;
import org.jbehave.core.steps.ParameterConverters.ExamplesTableConverter;
import org.junit.runner.RunWith;

//@RunWith(JUnitReportingRunner.class)
//public class AllStoriesTest extends JUnitStories {
@RunWith(JUnitReportingRunner.class)
public class RunCukesTest extends JUnitStories {
 
     private final CrossReference xref = new CrossReference();
 
    public void TraderStories() {
        configuredEmbedder().embedderControls().doGenerateViewAfterStories(true).doIgnoreFailureInStories(false)
                .doIgnoreFailureInView(true).doVerboseFailures(true).useThreads(2).useStoryTimeoutInSecs(60);
        //configuredEmbedder().useEmbedderControls(new PropertyBasedEmbedderControls());
    }
 
    @Override
    public Configuration configuration() {
        Class<? extends Embeddable> embeddableClass = this.getClass();
        Properties viewResources = new Properties();
        viewResources.put("decorateNonHtml", "true");
        viewResources.put("reports", "ftl/jbehave-reports-with-totals.ftl");
        // Start from default ParameterConverters instance
        ParameterConverters parameterConverters = new ParameterConverters();
        // factory to allow parameter conversion and loading from external resources (used by StoryParser too)
        ExamplesTableFactory examplesTableFactory = new ExamplesTableFactory(new LocalizedKeywords(), new LoadFromClasspath(embeddableClass), parameterConverters);
        // add custom converters
        parameterConverters.addConverters(new DateConverter(new SimpleDateFormat("yyyy-MM-dd")),
                new ExamplesTableConverter(examplesTableFactory));
        return new MostUsefulConfiguration()
            .useStoryLoader(new LoadFromClasspath(embeddableClass))
            .useStoryParser(new RegexStoryParser(examplesTableFactory))
            .useStoryReporterBuilder(new StoryReporterBuilder()
                .withCodeLocation(CodeLocations.codeLocationFromClass(embeddableClass))
                .withDefaultFormats()
                .withViewResources(viewResources)
                .withFormats(CONSOLE, TXT, HTML_TEMPLATE, XML_TEMPLATE)
                .withFailureTrace(true)
                .withFailureTraceCompression(true)               
                .withCrossReference(xref))
            .useParameterConverters(parameterConverters)                    
            // use '%' instead of '$' to identify parameters
            .useStepPatternParser(new RegexPrefixCapturingPatternParser(
                            "%"))
            .useStepMonitor(xref.getStepMonitor());                              
    }
 
    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new RpnCalculatorStepTest());
    }
     
    @Override
    protected List<String> storyPaths() {
        // Specify story paths as URLs
        String codeLocation = codeLocationFromClass(this.getClass()).getFile();
        return new StoryFinder().findPaths(codeLocation, asList("**/trader_is_alerted_of_status.story",
                "**/traders_can_be_subset.story"), asList(""), "file:" + codeLocation);
    }
    
}