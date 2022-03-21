package com.bridgelabz.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxValue<E extends Comparable> {

    E value1;
    E value2;
    E value3;

    public FindMaxValue(E value1, E value2, E value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public FindMaxValue() {

    }

    public static void main(String[] args) {
        FindMaxValue findMaxValueForInteger = new FindMaxValue(11, 32, 13);
        findMaxValueForInteger.findMaximumValue();

        FindMaxValue findMaxValueForFloat = new FindMaxValue(11.0f, 32.0f, 13.0f);
        findMaxValueForFloat.findMaximumValue();

        FindMaxValue findMaxValueForCharacter = new FindMaxValue('A', 'Z', 'M');
        findMaxValueForCharacter.findMaximumValue();

        FindMaxValue findMaxValueForString = new FindMaxValue("Ramesh", "Piyush", "Apple");
        findMaxValueForString.findMaximumValue();

        FindMaxValue findMaxValue = new FindMaxValue();
        System.out.println(findMaxValue.findMoreMaximum(11, 32, 43, 56, 23, 67));
    }

    public E findMoreMaximum(E... args) {
        List<E> list = Arrays.asList(args);
        Collections.sort(list);
        return list.get(list.size() - 1);
    }

    public void printMaximum(E max) {
        System.out.println("Maximum value is: " + max);
    }

    public E findMaximumValue(E value1, E value2, E value3) {
        E maximumNumber = value1;
        if (value2.compareTo(maximumNumber) > 0) {
            maximumNumber = value2;
        }
        if (value3.compareTo(maximumNumber) > 0) {
            maximumNumber = value3;
        }
        return maximumNumber;
    }

    public E findMaximumValue() {
        E max = findMaximumValue(value1, value2, value3);
        printMaximum(max);
        return max;
    }
}
