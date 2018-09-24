package jmri.jmrit.throttle;

import org.junit.*;

/**
 * Test simple functioning of FunctionButton
 *
 * @author	Paul Bender Copyright (C) 2016
 */
public class FunctionButtonTest {

    @Test
    public void testCtor() {
        FunctionButton panel = new FunctionButton();
        Assert.assertNotNull("exists", panel );
    }

    @Test
    public void testIsOn() {
        FunctionButton panel = new FunctionButton();
        Assert.assertFalse("function not on", panel.getState() );
    }

    @Test
    public void testGetSelectedIconPath() {
        FunctionButton panel = new FunctionButton();
        Assert.assertEquals("no Icon", "", panel.getSelectedIconPath() );
    }

    @Before
    public void setUp(){
        jmri.util.JUnitUtil.setUp();

    }
    
    @After
    public void tearDown(){
        jmri.util.JUnitUtil.tearDown();

    }
}
