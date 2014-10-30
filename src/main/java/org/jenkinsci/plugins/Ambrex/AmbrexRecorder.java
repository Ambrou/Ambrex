package org.jenkinsci.plugins.Ambrex;

import hudson.Launcher;
import hudson.model.BuildListener;
import hudson.model.AbstractBuild;
import hudson.tasks.BuildStepMonitor;

public class AmbrexRecorder {
	
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
}
