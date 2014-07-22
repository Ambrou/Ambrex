package org.jenkinsci.plugins.Ambrex;


import java.util.List;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import org.jvnet.hudson.test.JenkinsRule;
import org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

//public class TraderSteps {
public class RpnCalculatorStepTest {
    
    
    @Given("^le fichier amont fichier-ESG\\.agex contenant:$")
    public void le_fichier_amont_fichier_ESG_agex_contenant(List<Requirement> requirement) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        
        //System.out.println("Runs during scenarios !!!");
        //FreeStyleProject project = j.createFreeStyleProject();
        
        //AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
        //assertEquals("Ambrex !!!", ambrexRecorder.getDescriptor().getDisplayName());
        //throw new PendingException();
        
        JenkinsRule j = new JenkinsRule();
        
        AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
        assertEquals("Ambrex !!!", ambrexRecorder.getDescriptor().getDisplayName());
    }

    @Given("^le fichier aval fichier-ESD\\.agex contenant:$")
    public void le_fichier_aval_fichier_ESD_agex_contenant(List<Requirement> requirement) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        //throw new PendingException();
    }

    @When("^le plugin analyse ces deux fichiers$")
    public void le_plugin_analyse_ces_deux_fichiers() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^le build est en erreur$")
    public void le_build_est_en_erreur() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^l'erreur sont:$")
    public void l_erreur_sont(List<Erreur> erreur) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        //throw new PendingException();
    }
    
    
    public class Requirement {
        String reqID;
        String titre;
        Integer ver;
        String exigenceAmont;
        String categorie;
        String criticite;
        String impact;
        String stabilite;
        String verif;
        String texte;
        String commentaire;
        String statut;
        String dateStatut;
    }
    
    public class Erreur {
        String erreur;
    }
}
/*
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



import org.jvnet.hudson.test.JenkinsRule;
import org.apache.commons.io.FileUtils;
import hudson.model.*;
import hudson.tasks.Shell;
import org.junit.Test;
import org.junit.Rule;
import org.junit.Assert.*;
import static org.junit.Assert.assertThat;

import java.util.List;

import static org.junit.Assert.assertEquals;





public class RpnCalculatorStepTest {
    private RpnCalculator calc;

    @Rule 
    public MyRule j = new MyRule();
    //public JenkinsRule j;
    
    @Before
    public void beforeScenario() throws Throwable {
        //j = new MyRule();
        j.before();
        System.out.println("Runs before scenarios !!! ");
        
    }

    @After
    public void afterScenario() throws Exception {
        j.after();
        System.out.println("Runs after scenarios !!!");
    }


    @Given("^le fichier amont fichier-ESG\\.agex contenant:$")
    public void le_fichier_amont_fichier_ESG_agex_contenant(List<Requirement> requirement) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        
        System.out.println("Runs during scenarios !!!");
        FreeStyleProject project = j.createFreeStyleProject();
        
        //AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
        //assertEquals("Ambrex !!!", ambrexRecorder.getDescriptor().getDisplayName());
        //throw new PendingException();
    }

    @Given("^le fichier aval fichier-ESD\\.agex contenant:$")
    public void le_fichier_aval_fichier_ESD_agex_contenant(List<Requirement> requirement) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        //throw new PendingException();
    }

    @When("^le plugin analyse ces deux fichiers$")
    public void le_plugin_analyse_ces_deux_fichiers() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^le build est en erreur$")
    public void le_build_est_en_erreur() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^l'erreur sont:$")
    public void l_erreur_sont(List<Erreur> erreur) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        //throw new PendingException();
    }




    @Given("^a calculator I just turned on$")
    public void a_calculator_I_just_turned_on() {
        calc = new RpnCalculator();
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void adding(int arg1, int arg2) {
        calc.push(arg1);
        calc.push(arg2);
        calc.push("+");
    }

    @Given("^I press (.+)$")
    public void I_press(String what) {
        calc.push(what);
    }

    @Then("^the result is (\\d+)$")
    public void the_result_is(double expected) {
        assertEquals(expected, calc.value());
    }

    @Given("^the previous entries:$")
    public void thePreviousEntries(List<Entry> entries) {
        for (Entry entry : entries) {
            calc.push(entry.first);
            calc.push(entry.second);
            calc.push(entry.operation);
        }
    }

    public class Entry {
        Integer first;
        Integer second;
        String operation;
    }
    
    public class Requirement {
        String reqID;
        String titre;
        Integer ver;
        String exigenceAmont;
        String categorie;
        String criticite;
        String impact;
        String stabilite;
        String verif;
        String texte;
        String commentaire;
        String statut;
        String dateStatut;
    }
    
    public class Erreur {
        String erreur;
    }
}
*/