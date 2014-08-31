/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jenkinsci.plugins.Ambrex;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.jvnet.hudson.test.JenkinsRule;
 
@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty", "html:target/cucumber"})
public class RunTests {
    @Rule
    public JenkinsRule j = new JenkinsRule();
}
