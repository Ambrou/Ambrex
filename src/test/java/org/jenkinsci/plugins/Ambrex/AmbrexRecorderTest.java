/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jenkinsci.plugins.Ambrex;

//import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;
import hudson.model.*;
import hudson.tasks.Shell;
import org.apache.commons.io.FileUtils;
import org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.runners.JUnit4;
import org.jvnet.hudson.test.JenkinsRule;

/**
 *
 * @author apetitgenet
 */

@RunWith(JUnit4.class)
public class AmbrexRecorderTest {
    
    @Rule 
    public JenkinsRule j = new JenkinsRule();
   /* 
    @Test 
    public void first() throws Exception {
      //  FreeStyleProject project = j.createFreeStyleProject();
      //  project.getBuildersList().add(new Shell("echo hello"));
       /* FreeStyleBuild build = project.scheduleBuild2(0).get();
        System.out.println(build.getDisplayName() + " completed!!!");
        
        // TODO: change this to use HtmlUnit
        String s = FileUtils.readFileToString(build.getLogFile());*/
        
        //assertThat(s, containsString("+ echo hello"));
   /* }
    
    @Test 
    public void second() throws Exception {
      //  FreeStyleProject project = j.createFreeStyleProject();
      //  project.getPublishersList().add(new AmbrexRecorder());
    }
    */
    @Test 
    public void getDisplayName() throws Exception {
        AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
        assertEquals("Ambrex !!!", ambrexRecorder.getDescriptor().getDisplayName());
    }
    
}
