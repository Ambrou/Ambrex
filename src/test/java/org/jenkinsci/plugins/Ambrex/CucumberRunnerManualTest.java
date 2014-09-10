/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jenkinsci.plugins.Ambrex;


import cucumber.api.junit.Cucumber;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;
import org.jvnet.hudson.test.JenkinsRule;

/**
 *
 * @author Mar_B_000
 */

public class CucumberRunnerManualTest {
    
    
    @Rule 
    public JenkinsRule j = new JenkinsRule();
    
    public CucumberRunnerManualTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() throws InitializationError, IOException {
        Cucumber cucumber;

        cucumber = new Cucumber(RunTestsManual.class);
        cucumber.run(new RunNotifier());

    }
}
