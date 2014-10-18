/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jenkinsci.plugins.Ambrex;

//import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;

/**
 *
 * @author apetitgenet
 */

public class AmbrexRecorderUnitTest {
    
    @Rule 
    public JenkinsRule j = new MyJenkinsRule();
   
    @Test 
    public void getDisplayName() throws Exception {
        AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
        assertEquals("Ambrex !!!", ambrexRecorder.getDescriptor().getDisplayName());
    }
    
    @Test 
    public void getDisplayName2() throws Exception {
        AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
        assertNotEquals("Ambrex2 !!!", ambrexRecorder.getDescriptor().getDisplayName());
    }
    
}
