package org.jenkinsci.plugins.Ambrex;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.fr.Soit;

public class Chargement_de_Fichier_Ambrex {

	AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
	
	@Soit("^le fichier ESG\\.agex contenant les exigences amonts$")
	public void le_fichier_ESG_agex_contenant_les_exigences_amonts()
			throws Throwable {
		ambrexRecorder.setAmontFile("ESG.agex");
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

	@Soit("^le fichier ESD\\.agex contenant les exigences avales$")
	public void le_fichier_ESD_agex_contenant_les_exigences_avales()
			throws Throwable {
		ambrexRecorder.setAvalFile("ESD.agex");
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
