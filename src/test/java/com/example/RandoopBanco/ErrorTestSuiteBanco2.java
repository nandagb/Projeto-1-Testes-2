package com.example;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTestSuiteBanco2 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.Long long2 = banco1.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        banco1.addContaById((java.lang.Long) 0L);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        java.lang.String str3 = banco1.toString();
        banco1.setId((java.lang.Long) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        banco1.addContaById((java.lang.Long) 10L);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.example.Banco banco1 = new com.example.Banco("Banco(id=null, nome=null, contas=null)");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        banco1.addContaById((java.lang.Long) 100L);
    }
}

