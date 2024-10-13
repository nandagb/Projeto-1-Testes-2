package com.example;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTestSuiteConta3 {

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
        com.example.Conta conta0 = new com.example.Conta();
        boolean boolean2 = conta0.equals((java.lang.Object) (-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Boolean boolean4 = conta0.debitar((double) (byte) 100);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.example.Conta conta0 = new com.example.Conta();
        boolean boolean2 = conta0.equals((java.lang.Object) 100.0f);
        int int3 = conta0.getNumeroConta();
        char char4 = conta0.getDigitoVerificador();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Boolean boolean6 = conta0.debitar((double) 10.0f);
    }
}

