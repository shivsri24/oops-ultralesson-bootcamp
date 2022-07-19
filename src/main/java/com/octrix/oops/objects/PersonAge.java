package com.octrix.oops.objects;

public class PersonAge {
    private static int age = 1;

    public PersonAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void increaseAge(int yearsToAdd) {
        if (yearsToAdd > 0) {
            this.age += yearsToAdd;
        }
    }
}