package net.jsenko.hello;

import junit.framework.*;

/**
 * Unit test for the App.
 */
public class AppTest extends TestCase
{

    public AppTest(String testName)
    {
        super(testName);
    }

    public static Test suite()
    {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue(true);
    }

    /**
     * Rigourous Test :-)
     */
    public void testFeature1()
    {
        assertTrue(true);
        System.out.println("Feature 1 test 1.");
    }
}
