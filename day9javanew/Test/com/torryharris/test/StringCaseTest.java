package com.torryharris.test;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCaseTest {

    StringCase stringcase;
    @Before
    public void setUp() throws Exception {
        System.out.println("Before test case");
        stringcase=new StringCase();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after test case");
    }

    @Test
    public void toCapitalLetters() {
        Assert.assertEquals("ABCD",stringcase.toCapitalLetters("abcd"));
    }

    @Test
    public void toSmalLetters() {
        Assert.assertEquals("abcd",stringcase.toSmalLetters("ABCD"));
    }
}