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
        Comparable actual = findMaxValue.findMaximumValue(100, 20, 30);
        Integer expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenThreeIntegerNumber_shouldReturn_secondNumberIsMaximum() {
        Comparable actual = findMaxValue.findMaximumValue(100, 20, 30);
        Integer expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenThreeIntegerNumber_shouldReturn_thirdNumberIsMaximum() {
        Comparable actual = findMaxValue.findMaximumValue(100, 20, 30);
        Integer expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenThreeFloatNumber_shouldReturn_firstNumberIsMaximum() {
        Comparable actual = findMaxValue.findMaximumValue(10.0F, 5.0F, 3.0F);
        Float expected = 10.0F;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenThreeFloatNumber_shouldReturn_secondNumberIsMaximum() {
        Comparable actual = findMaxValue.findMaximumValue(5.0F, 10.0F, 3.0F);
        Float expected = 10.0F;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenThreeFloatNumber_shouldReturn_thirdNumberIsMaximum() {
        Comparable actual = findMaxValue.findMaximumValue(3.0F, 5.0F, 10.0F);
        Float expected = 10.0F;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenThreeCharacter_shouldReturn_firstCharacterIsMaximum() {
        Comparable actual = findMaxValue.findMaximumValue('Z', 'B', 'A');
        Character expected = 'Z';
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenThreeCharacter_shouldReturn_secondCharacterIsMaximum() {
        Comparable actual = findMaxValue.findMaximumValue('B', 'Z', 'A');
        Character expected = 'Z';
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenThreeCharacter_shouldReturn_thirdCharacterIsMaximum() {
        Comparable actual = findMaxValue.findMaximumValue('M', 'B', 'Z');
        Character expected = 'Z';
        Assert.assertEquals(expected, actual);
    }

}
