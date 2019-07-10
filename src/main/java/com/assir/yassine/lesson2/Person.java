package com.assir.yassine.lesson2;

import com.assir.yassine.lesson3.Name;

public class Person {

    private static int personCounter;
    private Name personName;

    public Person(Name personName) {
        this.personName = personName;
    }

    public Person() {
        personCounter++;

        /*
        empty on purpose - default constructor
         */
    }

    public Name getPersonName() {
        return personName;
    }

    public String helloWorld() {
        return "Hello world";
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public int numberOfPersons() {
        return personCounter;
    }
}
