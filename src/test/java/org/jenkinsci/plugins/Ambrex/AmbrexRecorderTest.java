/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jenkinsci.plugins.Ambrex;

import org.jvnet.hudson.test.JenkinsRule;
import org.apache.commons.io.FileUtils;
import hudson.model.*;
import hudson.tasks.Shell;
import org.junit.Test;
import org.junit.Rule;
import org.junit.Assert.*;
import static org.junit.Assert.assertThat;
/**
 *
 * @author apetitgenet
 */
public class AmbrexRecorderTest {
    
    @Rule 
    public JenkinsRule j = new JenkinsRule();
    
    @Test 
    public void first() throws Exception {
        FreeStyleProject project = j.createFreeStyleProject();
        project.getBuildersList().add(new Shell("echo hello"));
        FreeStyleBuild build = project.scheduleBuild2(0).get();
        System.out.println(build.getDisplayName() + " completed!!!");
        
        // TODO: change this to use HtmlUnit
        String s = FileUtils.readFileToString(build.getLogFile());
        
        System.out.println(s);
        //assertThat(s, containsString("+ echo hello"));
    }
    
}
