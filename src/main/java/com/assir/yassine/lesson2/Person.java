package com.assir.yassine.lesson2;

import com.assir.yassine.lesson3.Name;

public class Person {

    private Name personName;

    public Person(Name personName) {
        this.personName = personName;
    }

    public Person() {
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
}
