package com.bridgelabz.generics;

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
