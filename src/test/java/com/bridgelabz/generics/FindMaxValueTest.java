package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxValueTest {
    FindMaxValue findMaxValue = new FindMaxValue();
    @Test
    public void givenThreeIntegerNumber_shouldReturn_firstNumberIsMaximum(){
        Integer actual = findMaxValue.findMaximumValue(100,20,30);
        Integer expected = 100;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void givenThreeIntegerNumber_shouldReturn_secondNumberIsMaximum(){
        Integer actual = findMaxValue.findMaximumValue(100,20,30);
        Integer expected = 100;
        Assert.assertEquals(expected, actual);
    }
    @Test
   public void givenThreeIntegerNumber_shouldReturn_thirdNumberIsMaximum(){
        Integer actual = findMaxValue.findMaximumValue(100,20,30);
        Integer expected = 100;
        Assert.assertEquals(expected, actual);
    }
}
