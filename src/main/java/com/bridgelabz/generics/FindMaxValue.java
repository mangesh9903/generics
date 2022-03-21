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

    public static <E extends Comparable<E>> E findMoreMaximum(E... args) {
        List<E> list = Arrays.asList(args);
        Collections.sort(list);
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        System.out.println(FindMaxValue.findMoreMaximum(12, 12, 31, 432, 134, 43234, 543234));
        System.out.println(FindMaxValue.findMoreMaximum('A', 'C', 'M', 'B', 'Z', 'J'));
        System.out.println(FindMaxValue.findMoreMaximum("Mangesh", "Avinash", "Rajesh", "Ram", "Prakash"));
        System.out.println(FindMaxValue.findMoreMaximum(1.05f, 10.2f, 300.0f, 1.0f, 100.0f, 200.0f));
    }

    public E findMaximumValue() {
        return findMaximumValue(value1, value2, value3);
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
}
