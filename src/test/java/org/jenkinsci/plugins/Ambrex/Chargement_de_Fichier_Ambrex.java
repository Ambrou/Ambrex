package org.jenkinsci.plugins.Ambrex;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.fr.Soit;

public class Chargement_de_Fichier_Ambrex {

	@Soit("^le fichier ESG\\.agex contenant les exigences amonts$")
	public void le_fichier_ESG_agex_contenant_les_exigences_amonts()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quand("^je charge le fichier d'exigence amont en mémoire$")
	public void je_charge_le_fichier_d_exigence_amont_en_mémoire()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Alors("^la liste des exigences amonts est:$")
	public void la_liste_des_exigences_amonts_est(DataTable arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@Soit("^le fichier ESD\\.agex contenant les exigences avales$")
	public void le_fichier_ESD_agex_contenant_les_exigences_avales()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quand("^je charge le fichier d'exigence aval en mémoire$")
	public void je_charge_le_fichier_d_exigence_aval_en_mémoire()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Alors("^la liste des exigences avales est:$")
	public void la_liste_des_exigences_avales_est(DataTable arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}
}
