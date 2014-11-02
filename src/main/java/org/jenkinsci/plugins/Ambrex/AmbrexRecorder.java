package org.jenkinsci.plugins.Ambrex;

import java.util.List;

import hudson.Launcher;
import hudson.model.BuildListener;
import hudson.model.AbstractBuild;
import hudson.tasks.BuildStepMonitor;

public class AmbrexRecorder {
	
	List<String> amontRequirement;
	List<List<String>> avalRequirement;
	private boolean coverageSucced;
	
	public AmbrexRecorder(){
		coverageSucced = true;
	}
	
	public String getName() {
		return "Ambrex !!!";
	}

	public BuildStepMonitor getRequiredMonitorService() {
		return BuildStepMonitor.BUILD;
	}

	public boolean perform(AbstractBuild<?, ?> build, Launcher launcher,
			BuildListener listener) {
		return false;
	}

	public Boolean isCorrectlyCovered() {
		return coverageSucced;
	}

	public void setAmont(final List<String> amontRequirement) {
		this.amontRequirement = amontRequirement;
	}

	public void setAval(final List<List<String>> avalRequirement) {
		this.avalRequirement = avalRequirement;
	}

	public void checkCoverage() {
		checkCoverageDownToUp();
		checkCoverageUpToDown();
	}

	private void checkCoverageUpToDown() {
		for(String temp : amontRequirement){
			boolean bFound = false;
			for (List<String> temp2 : avalRequirement) {
				String amontListStringRequirement = temp2.get(1);
				String[] t = amontListStringRequirement.split(" ");
				for(int iLoop = 0; iLoop < t.length; ++iLoop){
					if(t[iLoop].equals(temp)){
						bFound = true;
					}
				}
			}
			if(bFound == false)
			{
				coverageSucced = false;
			}
		}
	}

	private void checkCoverageDownToUp() {
		for (List<String> temp : avalRequirement) {
			String amontListStringRequirement = temp.get(1);
			String[] t = amontListStringRequirement.split(" ");
			for(int iLoop = 0; iLoop < t.length; ++iLoop){
				if(amontRequirement.contains(t[iLoop]) == false){
					coverageSucced = false;
				}
			}
		}
	}
}
