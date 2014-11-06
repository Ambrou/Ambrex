package org.jenkinsci.plugins.Ambrex;

import java.util.List;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.fr.Soit;
import static org.junit.Assert.assertEquals;

public class Suivi_des_fonctionnalites_de_mon_application {

	AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
	
	@Soit("^les exigences amonts:$")
	public void les_exigences_amonts(final List<String> AmontRequirement) throws Throwable {
		ambrexRecorder.setAmont(AmontRequirement);
	}

	@Soit("^les exigences avals:$")
	public void les_exigences_avals(final List<List<String>> AvalRequirement) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		ambrexRecorder.setAval(AvalRequirement);
	}

	@Quand("^je compare ces deux listes$")
	public void je_compare_ces_deux_listes() throws Throwable {
		ambrexRecorder.checkCoverage();
	}

	@Alors("^les exigences amonts sont correctement couvertes$")
	public void les_exigences_amonts_sont_correctement_couvertes()
			throws Throwable {
		assertEquals(true, ambrexRecorder.isCorrectlyCovered());
	}
	
	@Alors("^les exigences amonts ne sont pas correctement couvertes$")
	public void les_exigences_amonts_ne_sont_pas_correctement_couvertes() throws Throwable {
		assertEquals(false, ambrexRecorder.isCorrectlyCovered());
	}
}
