/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jenkinsci.plugins.Ambrex;

import org.jvnet.hudson.test.JenkinsRule;

/**
 *
 * @author Mar_B_000
 */
public class MyRule extends JenkinsRule {
    public void before() throws Throwable {
        System.out.println("Runs before MyRule !!! ");
        super.before();
    }
    
    public void after() throws Exception {
        System.out.println("Runs before MyRule !!! ");
        super.after();
    }
}
