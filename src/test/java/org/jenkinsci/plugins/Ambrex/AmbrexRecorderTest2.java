/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jenkinsci.plugins.Ambrex;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import org.jvnet.hudson.test.JenkinsRule;
import org.apache.commons.io.FileUtils;
import hudson.model.*;
import hudson.tasks.Shell;


/**
 *
 * @author apetitgenet
 */
public class AmbrexRecorderTest2 {
    
    
    
    public AmbrexRecorderTest2() {
    }
    
    public JenkinsRule jenkinsRule;

    @Test public void first() throws Exception {
        FreeStyleProject project = jenkinsRule.createFreeStyleProject();
        project.getBuildersList().add(new Shell("echo hello"));
        FreeStyleBuild build = project.scheduleBuild2(0).get();

  }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   /* @Test
    public void getDisplayName() throws Exception {
        //AmbrexRecorder.DescriptorImpl descriptor = new AmbrexRecorder.DescriptorImpl();
       //  AmbrexRecorder.DescriptorImpl descriptor = AmbrexRecorder.DescriptorImpl;

        //AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
        //assertNotEquals(0, ambrexRecorder.getDescriptor());
       // assertEquals("Ambrex !!!", ambrexRecorder.DescriptorImpl.getDisplayName());
        
        
        
                FreeStyleProject project = j.createFreeStyleProject();
    project.getBuildersList().add(new Shell("echo hello"));
    FreeStyleBuild build = project.scheduleBuild2(0).get();
    System.out.println(build.getDisplayName() + " completed");
    // TODO: change this to use HtmlUnit
    String s = FileUtils.readFileToString(build.getLogFile());
    assertThat(s, contains("+ echo hello"));
                
    }*/

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception, Throwable {
        jenkinsRule = new JenkinsRule();
        jenkinsRule.before();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        jenkinsRule.after();
    }
}
