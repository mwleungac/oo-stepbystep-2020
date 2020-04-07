package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void display_line() {
        Person person = new Person();
        person.setName("Tom");
        person.setAge(18);

        System.out.println(person.introduce());
        Assert.assertEquals("My name is Tom. I am 18 years old.\n", person.introduce());

    }
}