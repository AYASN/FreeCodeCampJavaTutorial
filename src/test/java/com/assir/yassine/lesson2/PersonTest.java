package com.assir.yassine.lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldRetuenHelloWorld() {

        Person person = new Person();
        assertEquals("Hello world", person.helloWorld());

    }
}
