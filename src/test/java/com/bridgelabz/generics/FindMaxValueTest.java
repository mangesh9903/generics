package com.bridgelabz.generics;

import org.junit.*;

public class FindMaxValueTest {
    FindMaxValue findMaxValue = new FindMaxValue();

    @BeforeClass
    public static void before() {
        System.out.println("Starting Test Cases.");
    }

    @AfterClass
    public static void after() {
        System.out.println("Ending Test Cases.");
    }

    @Test
    public void givenThreeIntegerNumber_shouldReturn_firstNumberIsMaximum() {
        Integer actual = findMaxValue.findMaximumValue(100, 20, 30);
        Integer expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenThreeIntegerNumber_shouldReturn_secondNumberIsMaximum() {
        Integer actual = findMaxValue.findMaximumValue(100, 20, 30);
        Integer expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenThreeIntegerNumber_shouldReturn_thirdNumberIsMaximum() {
        Integer actual = findMaxValue.findMaximumValue(100, 20, 30);
        Integer expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenThreeFloatNumber_shouldReturn_firstNumberIsMaximum() {
        Float actual = findMaxValue.findMaximumFloatValue(10.0F, 5.0F, 3.0F);
        Float expected = 10.0F;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenThreeFloatNumber_shouldReturn_secondNumberIsMaximum() {
        Float actual = findMaxValue.findMaximumFloatValue(5.0F, 10.0F, 3.0F);
        Float expected = 10.0F;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenThreeFloatNumber_shouldReturn_thirdNumberIsMaximum() {
        Float actual = findMaxValue.findMaximumFloatValue(3.0F, 5.0F, 10.0F);
        Float expected = 10.0F;
        Assert.assertEquals(expected, actual);
    }
}
