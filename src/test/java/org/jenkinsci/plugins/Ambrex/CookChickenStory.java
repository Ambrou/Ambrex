/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jenkinsci.plugins.Ambrex;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.Rule;
import org.jvnet.hudson.test.JenkinsRule;

/**
 *
 * @author apetitgenet
 */
public class CookChickenStory extends JUnitStory  {
    
    
   @Rule 
   public JenkinsRule j = new JenkinsRule();
   
   @Override public Configuration configuration() {
        return new MostUsefulConfiguration();
    }
 
    @Override public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(),
                new BaconCookingSteps());
    }
    
}
