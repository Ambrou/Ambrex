/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jenkinsci.plugins.Ambrex;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 *
 * @author apetitgenet
 */
@CucumberOptions(format = "json:target/cucumber-report.json")
public class RunCukesTest extends AbstractTestNGCucumberTests {
    
}
