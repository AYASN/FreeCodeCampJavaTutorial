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
        Person person1 = new Person();
        Person person2 = new Person();
        Person myPerson = new Person();
        Person person4 = new Person();

        assertEquals(4, myPerson.numberOfPersons());
    }
}
