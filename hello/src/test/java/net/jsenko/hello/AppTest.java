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
        System.out.println("Change 1.");
    }

    public void testFeature2()
    {
        assertTrue(true);
        System.out.println("Feature 2 Test.");
    }
}
