package com.assir.yassine.lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {

        Person person = new Person();
        assertEquals("Hello world", person.helloWorld());

    }

    @Test
    public void shouldReturnHelloDeveloper() {
        Person person = new Person();
        assertEquals("Hello Developer", person.hello("Developer"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {

        int i = 0;
        Person person1;

        while (i < 4) {
            person1 = new Person();
            i++;
        }
        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void demonstrateBoolean() {

        int i = 4;
        int j = 3;
        boolean areEqual = i == j;

        if (i > j) {
            System.out.println("greater !");
        } else if (j > i) {
            System.out.println("smaller !");
        } else if (areEqual) {
            System.out.println("equal !");
        } else {
            System.out.println("result not known !");
        }

    }
}
