/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jenkinsci.plugins.Ambrex;

//import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class AmbrexRecorderUnitTest {
     
    @Test 
    public void getDisplayName() throws Exception {
    	AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
        assertEquals("Ambrex !!!", ambrexRecorder.getName());
    }
    
    @Test 
    public void getDisplayName2() throws Exception {
    	AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
        assertNotEquals("Ambrex2 !!!", ambrexRecorder.getName());
    }
    
}
