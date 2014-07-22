/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jenkinsci.plugins.Ambrex;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author apetitgenet
 */
public class StepjBehave {
    @Given("^le fichier amont fichier-ESG\\.agex contenant:$")
    public void le_fichier_amont_fichier_ESG_agex_contenant(ExamplesTable requirement) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        
        //System.out.println("Runs during scenarios !!!");
        //FreeStyleProject project = j.createFreeStyleProject();
        
        //AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
        //assertEquals("Ambrex !!!", ambrexRecorder.getDescriptor().getDisplayName());
        //throw new PendingException();
        
        
        AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
        assertEquals("Ambrex22 !!!", ambrexRecorder.getDescriptor().getDisplayName());
    }

    @Given("^le fichier aval fichier-ESD\\.agex contenant:$")
    @Pending
    public void le_fichier_aval_fichier_ESD_agex_contenant(ExamplesTable requirement) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        
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
    public void l_erreur_sont(ExamplesTable erreur) throws Throwable {
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
