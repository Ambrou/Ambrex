package org.jenkinsci.plugins.Ambrex;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.jvnet.hudson.test.JenkinsRule;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mar_B_000
 */

public class DepositStepDefinitions {
 
    
    
    @Given("^a User has no money in their account$")
    public void a_User_has_no_money_in_their_current_account() {

        //AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
        //assertEquals("Ambrex !!!", ambrexRecorder.getDescriptor().getDisplayName());
// Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^(\\d+) is deposited in to the account$")
    public void is_deposited_in_to_the_account(int arg1) {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
 
    @Then("^the balance should be (\\d+)$")
    public void the_balance_should_be_(int arg1) {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}