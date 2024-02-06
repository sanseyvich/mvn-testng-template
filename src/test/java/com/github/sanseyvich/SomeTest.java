package com.github.sanseyvich;

import org.testng.Assert;

import org.testng.annotations.Test;

public class SomeTest {


    @Test
    public void someTest() {
        var actualData = "DATA";
        var expectedData = "DATA";
        System.out.println("test is running!");
        Assert.assertEquals(actualData, expectedData);
    }
}
