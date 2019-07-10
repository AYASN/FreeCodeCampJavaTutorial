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
}
