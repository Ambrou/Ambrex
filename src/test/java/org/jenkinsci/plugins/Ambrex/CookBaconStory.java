/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jenkinsci.plugins.Ambrex;


import java.util.List;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.StoryControls;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

/**
 *
 * @author apetitgenet
 */
public class CookBaconStory extends JUnitStory  {
    
   @Override public Configuration configuration() {
        return new MostUsefulConfiguration().useStoryControls(new StoryControls().doResetStateBeforeScenario(false));
    }
 
    @Override public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(),
                new BaconCookingSteps());
    }
}
