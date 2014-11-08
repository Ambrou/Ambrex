package org.jenkinsci.plugins.Ambrex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import hudson.Launcher;
import hudson.model.BuildListener;
import hudson.model.AbstractBuild;
import hudson.tasks.BuildStepMonitor;

public class AmbrexRecorder {
	
	private List<String> amontRequirement;
	private List<List<String>> avalRequirement;
	private boolean coverageSucced;
	private String amontRequirementFile;
	private String avalRequirementFile;
	
	public AmbrexRecorder(){
		coverageSucced = true;
		amontRequirement = new ArrayList<String>();
		avalRequirement = new ArrayList<List<String>>();
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
		for(String temp : getAmont()){
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
				if(getAmont().contains(t[iLoop]) == false){
					coverageSucced = false;
				}
			}
		}
	}

	public List<String> getAmont() {
		return amontRequirement;
	}

	public void setAmontFile(final String amontRequirementFile) {
		this.amontRequirementFile = amontRequirementFile;
	}

	public void loadAmontRequirement() {
		try{
			BufferedReader fichier = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\org\\jenkinsci\\plugins\\Ambrex\\" + amontRequirementFile));
			try
			{
				String line;
				while ((line = fichier.readLine()) != null) {
					if(line.startsWith("ReqID= ")){
						getAmont().add(line.substring(line.indexOf(" ") + 1));
					}
				}
			} finally {
				fichier.close();
			}
		} catch (IOException ioe){
			System.out.println("Erreur --" + ioe.toString());
		}
	}

	public void setAvalFile(String string) {
		avalRequirementFile = string;
	}
	
	public void loadAvalRequirement() {
		try{
			BufferedReader fichier = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\org\\jenkinsci\\plugins\\Ambrex\\" + avalRequirementFile));
			try
			{
				String line;
				String requirementAval = null;
				String requirementAmont = null;
				String strRequirementAmontToAdd = null;
				while ((line = fichier.readLine()) != null) {
					if(line.startsWith("ReqID= ")){
						requirementAval = line.substring(line.indexOf(" ") + 1);
					}
					if(line.startsWith("Exigence(s)-Amont= ")){
						requirementAmont = line.substring(line.indexOf(" ") + 1);
					}
					if(requirementAval != null && requirementAmont != null)
					{
						strRequirementAmontToAdd = new String();
						System.out.println(requirementAval + " " + requirementAmont);
						List<String> lineRequirement = new ArrayList<String>();
						lineRequirement.add(requirementAval);
						String str[] = requirementAmont.split(" ");
						;
						for(int iLoop = 0; iLoop < str.length; ++iLoop){
							if(str[iLoop].startsWith("(") == false){
								if(iLoop != 0)
								{
									strRequirementAmontToAdd += " ";
								}
								strRequirementAmontToAdd += str[iLoop]; 
							}
						}
						lineRequirement.add(strRequirementAmontToAdd);
						getAval().add(lineRequirement);
						requirementAval = null;
						requirementAmont = null;
					}
				}
			} finally {
				fichier.close();
			}
		} catch (IOException ioe){
			System.out.println("Erreur --" + ioe.toString());
		}
	}

	public List<List<String>> getAval() {
		return avalRequirement;
	}
}
