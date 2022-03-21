package com.bridgelabz.generics;

public class FindMaxValue {

    public Integer findMaximumValue(Integer number1, Integer number2, Integer number3) {
        Integer maximumValue = number1;
        if (number2.compareTo(maximumValue) > 0) {
            maximumValue = number2;
        }
        if (number3.compareTo(maximumValue) > 0) {
            maximumValue = number3;
        }
        return maximumValue;
    }

    public Float findMaximumFloatValue(Float number1, Float number2, Float number3) {
        Float maximumValue = number1;
        if (number2.compareTo(maximumValue) > 0) {
            maximumValue = number2;
        }
        if (number3.compareTo(maximumValue) > 0) {
            maximumValue = number3;
        }
        return maximumValue;
    }
}
