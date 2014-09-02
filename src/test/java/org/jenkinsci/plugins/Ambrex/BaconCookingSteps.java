/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jenkinsci.plugins.Ambrex;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.jvnet.hudson.test.JenkinsRule;

/**
 *
 * @author apetitgenet
 */
public class BaconCookingSteps {
    
    @Rule 
    public JenkinsRule j = new JenkinsRule();
    
    @Given("12 strips of bacon")
    public void howManyStripsOfBacon() {
        System.out.println(">>>> you're making how many pieces of bacon?");
    }
 
    @Given("a frypan on a medium heat")
    public void heatTheFrypan() {
        System.out.println(">>>> how hot did you want that?");
    }
 
    @When("I put the bacon into the frypan")
    public void startCooking() {
        //AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
        //assertEquals("Ambrex !!!", ambrexRecorder.getDescriptor().getDisplayName());
        System.out.println(">>>> Yeah - put that stuff there");
    }
 
    @When("wait for 10 minutes or until the bacon sizzles")
    public void cookUntilSatisifed() {
        System.out.println(">>>> I'm hungry! Why are we waiting?");
    }
 
    @When("flip the bacon")
    public void flipBacon() {
        System.out.println(">>>> These aren't panckes!");
    }
 
    @When("wait for 5 minutes")
    public void cookSomeMore() {
        System.out.println(">>>> More waiting?");
    }
 
    @Then("I get perfectly cooked crispy bacon")
    public void nomNomNom() {
        //AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
        //("Ambrex 22 !!!", ambrexRecorder.getDescriptor().getDisplayName());
        System.out.println(">>>> Finally! Nom nom nom nom");
    }
    
    
 
    @Then("I test")
    public void test() {
        //AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
        //("Ambrex 22 !!!", ambrexRecorder.getDescriptor().getDisplayName());
        
        AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
        
        assertEquals("Ambrex !!!", ambrexRecorder.getDescriptor().getDisplayName());
        System.out.println(">>>> Finally! Test Test Test");
    }
}
