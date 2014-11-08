package org.jenkinsci.plugins.Ambrex;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Et;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.fr.Soit;

public class Chargement_de_Fichier_Ambrex {

	AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
	
	@Soit("^le fichier ESG\\.agex bien formé, contenant les exigences amonts$")
	public void le_fichier_ESG_agex_bien_formé_contenant_les_exigences_amonts() throws Throwable {
		ambrexRecorder.setAmontFile("ESG.agex");
	}
	
	@Et("^il contient les lignes suivantes, chacune une fois seulement$")
	public void il_contient_les_lignes_suivantes_chacune_une_fois_seulement(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
	}

	@Et("^il ne contient pas d'autre ligne commençant par \"(.*?)\"$")
	public void il_ne_contient_pas_d_autre_ligne_commençant_par(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	

	@Quand("^je charge le fichier d'exigence amont en mémoire$")
	public void je_charge_le_fichier_d_exigence_amont_en_mémoire()
			throws Throwable {
		ambrexRecorder.loadAmontRequirement();
	}

	@Alors("^la liste des exigences amonts est:$")
	public void la_liste_des_exigences_amonts_est(final List<String> AmontRequirement)
			throws Throwable {
		assertEquals(AmontRequirement, ambrexRecorder.getAmont());
	}

	@Soit("^le fichier ESD\\.agex bien formé, contenant les exigences avales$")
	public void le_fichier_ESD_agex_bien_formé_contenant_les_exigences_avales() throws Throwable {
		ambrexRecorder.setAvalFile("ESD.agex");
	}
	

	@Et("^il contient les informations suivantes, chacune étant une ligne présente une fois seulement au sein d'un bloc \"(.*?)\":$")
	public void il_contient_les_informations_suivantes_chacune_étant_une_ligne_présente_une_fois_seulement_au_sein_d_un_bloc(
			String arg1, DataTable arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		
	}


	@Quand("^je charge le fichier d'exigence aval en mémoire$")
	public void je_charge_le_fichier_d_exigence_aval_en_mémoire()
			throws Throwable {
		ambrexRecorder.loadAvalRequirement();
	}

	@Alors("^la liste des exigences avales est:$")
	public void la_liste_des_exigences_avales_est(List<List<String>> arg1)
			throws Throwable {
		assertEquals(arg1, ambrexRecorder.getAval());
	}
}
