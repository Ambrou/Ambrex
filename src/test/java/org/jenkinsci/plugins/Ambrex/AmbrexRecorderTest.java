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

/**
 *
 * @author apetitgenet
 */
public class AmbrexRecorderTest {
    
    public AmbrexRecorderTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void getDisplayName() {
        AmbrexRecorder.DescriptorImpl descriptor = new AmbrexRecorder.DescriptorImpl();
        AmbrexRecorder ambrexRecorder = new AmbrexRecorder();
        
        assertEquals("Ambrex !!!", ambrexRecorder.getDescriptor().getDisplayName());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
