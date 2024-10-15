package com.example;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        com.example.Conta conta4 = null;
        banco1.addConta(conta4);
        java.lang.String str6 = banco1.getNome();
        java.lang.Long long7 = banco1.getId();
        boolean boolean9 = banco1.canEqual((java.lang.Object) (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        banco1.addContaById((java.lang.Long) 0L);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        java.lang.String str3 = banco1.toString();
        banco1.setNome("Banco(id=10, nome=hi!, contas=[])");
        com.example.Conta conta6 = null;
        com.example.Conta conta7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = banco1.transferencia(conta6, conta7, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str2, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str3, "Banco(id=null, nome=hi!, contas=[])");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        java.lang.String str3 = banco1.toString();
        banco1.setNome("Banco(id=10, nome=hi!, contas=[])");
        com.example.Conta conta6 = null;
        banco1.addConta(conta6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str2, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str3, "Banco(id=null, nome=hi!, contas=[])");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        com.example.Conta conta4 = null;
        banco1.addConta(conta4);
        java.lang.String str6 = banco1.toString();
        java.lang.String str7 = banco1.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Banco(id=null, nome=hi!, contas=[null, null])" + "'", str6, "Banco(id=null, nome=hi!, contas=[null, null])");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.example.Conta[] contaArray4 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList5 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList5, contaArray4);
        com.example.Banco banco7 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=[])", (java.util.List<com.example.Conta>) contaList5);
        com.example.Conta conta8 = null;
        banco7.addConta(conta8);
        com.example.Conta[] contaArray10 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList11 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList11, contaArray10);
        banco7.setContas((java.util.List<com.example.Conta>) contaList11);
        com.example.Banco banco14 = new com.example.Banco((java.lang.Long) (-1L), "Banco(id=10, nome=hi!, contas=[])", (java.util.List<com.example.Conta>) contaList11);
        banco14.setNome("Banco(id=10, nome=hi!, contas=[])");
        org.junit.Assert.assertNotNull(contaArray4);
        org.junit.Assert.assertArrayEquals(contaArray4, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(contaArray10);
        org.junit.Assert.assertArrayEquals(contaArray10, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=[])", (java.util.List<com.example.Conta>) contaList7);
        com.example.Banco banco10 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList7);
        com.example.Banco banco11 = new com.example.Banco((java.lang.Long) 0L, "", (java.util.List<com.example.Conta>) contaList7);
        boolean boolean13 = banco11.canEqual((java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        banco1.setId((java.lang.Long) 1L);
        com.example.Banco banco6 = new com.example.Banco("hi!");
        com.example.Conta conta7 = null;
        banco6.addConta(conta7);
        com.example.Conta conta9 = null;
        banco6.addConta(conta9);
        banco6.setId((java.lang.Long) 100L);
        java.util.List<com.example.Conta> contaList13 = banco6.getContas();
        boolean boolean14 = banco1.equals((java.lang.Object) banco6);
        java.lang.Long long15 = banco1.getId();
        java.lang.String str16 = banco1.getNome();
        com.example.Conta conta17 = null;
        banco1.addConta(conta17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str2, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertNotNull(contaList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        com.example.Banco banco5 = new com.example.Banco("hi!");
        java.lang.String str6 = banco5.toString();
        java.lang.String str7 = banco5.toString();
        banco5.setNome("Banco(id=10, nome=hi!, contas=[])");
        java.lang.String str10 = banco5.getNome();
        boolean boolean11 = banco1.canEqual((java.lang.Object) str10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str6, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str7, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Banco(id=10, nome=hi!, contas=[])" + "'", str10, "Banco(id=10, nome=hi!, contas=[])");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.example.Banco banco0 = new com.example.Banco();
        java.lang.String str1 = banco0.getNome();
        java.lang.String str2 = banco0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=null, contas=null)" + "'", str2, "Banco(id=null, nome=null, contas=null)");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Conta[] contaArray3 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList4 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList4, contaArray3);
        com.example.Banco banco6 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=[])", (java.util.List<com.example.Conta>) contaList4);
        banco0.setContas((java.util.List<com.example.Conta>) contaList4);
        com.example.Conta conta8 = null;
        com.example.Conta conta9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = banco0.transferencia(conta8, conta9, (java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(contaArray3);
        org.junit.Assert.assertArrayEquals(contaArray3, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.example.Banco banco1 = new com.example.Banco("Banco(id=null, nome=null, contas=null)");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        com.example.Conta conta4 = null;
        banco1.addConta(conta4);
        banco1.setId((java.lang.Long) 100L);
        java.lang.Long long8 = banco1.getId();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        java.lang.String str3 = banco1.toString();
        banco1.setNome("Banco(id=10, nome=hi!, contas=[])");
        java.lang.Class<?> wildcardClass6 = banco1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str2, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str3, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        com.example.Conta conta4 = null;
        banco1.addConta(conta4);
        banco1.setId((java.lang.Long) 100L);
        java.util.List<com.example.Conta> contaList8 = banco1.getContas();
        banco1.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(contaList8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.example.Banco banco1 = new com.example.Banco("");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        java.lang.String str3 = banco1.toString();
        banco1.setId((java.lang.Long) 1L);
        com.example.Banco banco7 = new com.example.Banco("hi!");
        java.lang.String str8 = banco7.toString();
        java.lang.String str9 = banco7.toString();
        boolean boolean10 = banco1.equals((java.lang.Object) banco7);
        java.lang.Class<?> wildcardClass11 = banco7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str2, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str3, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str8, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str9, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Conta[] contaArray3 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList4 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList4, contaArray3);
        com.example.Banco banco6 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=[])", (java.util.List<com.example.Conta>) contaList4);
        banco0.setContas((java.util.List<com.example.Conta>) contaList4);
        boolean boolean9 = banco0.canEqual((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(contaArray3);
        org.junit.Assert.assertArrayEquals(contaArray3, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        com.example.Conta conta4 = null;
        banco1.addConta(conta4);
        banco1.setId((java.lang.Long) 100L);
        java.lang.String str8 = banco1.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Banco(id=100, nome=hi!, contas=[null, null])" + "'", str8, "Banco(id=100, nome=hi!, contas=[null, null])");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        com.example.Conta conta4 = null;
        banco1.addConta(conta4);
        java.lang.String str6 = banco1.getNome();
        java.util.List<com.example.Conta> contaList7 = banco1.getContas();
        com.example.Banco banco9 = new com.example.Banco("hi!");
        com.example.Conta conta10 = null;
        banco9.addConta(conta10);
        java.util.List<com.example.Conta> contaList12 = banco9.getContas();
        banco1.setContas(contaList12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(contaList7);
        org.junit.Assert.assertNotNull(contaList12);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.example.Conta[] contaArray8 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList9 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList9, contaArray8);
        com.example.Banco banco11 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=[])", (java.util.List<com.example.Conta>) contaList9);
        com.example.Banco banco12 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList9);
        com.example.Banco banco13 = new com.example.Banco((java.lang.Long) 0L, "", (java.util.List<com.example.Conta>) contaList9);
        com.example.Banco banco14 = new com.example.Banco((java.lang.Long) 1L, "Banco(id=null, nome=hi!, contas=[null, null])", (java.util.List<com.example.Conta>) contaList9);
        org.junit.Assert.assertNotNull(contaArray8);
        org.junit.Assert.assertArrayEquals(contaArray8, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        com.example.Conta conta4 = null;
        banco1.addConta(conta4);
        banco1.setId((java.lang.Long) 100L);
        banco1.setNome("Banco(id=null, nome=null, contas=null)");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        com.example.Conta conta4 = null;
        banco1.addConta(conta4);
        java.lang.String str6 = banco1.getNome();
        java.lang.String str7 = banco1.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Banco(id=null, nome=hi!, contas=[null, null])" + "'", str7, "Banco(id=null, nome=hi!, contas=[null, null])");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        java.util.List<com.example.Conta> contaList4 = banco1.getContas();
        java.lang.Class<?> wildcardClass5 = contaList4.getClass();
        org.junit.Assert.assertNotNull(contaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        com.example.Conta conta4 = null;
        banco1.addConta(conta4);
        banco1.addContaById((java.lang.Long) 10L);
        com.example.Conta conta8 = null;
        com.example.Conta conta9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = banco1.transferencia(conta8, conta9, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        java.lang.String str3 = banco1.toString();
        banco1.setNome("Banco(id=10, nome=hi!, contas=[])");
        com.example.Conta conta6 = null;
        com.example.Conta conta7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = banco1.transferencia(conta6, conta7, (java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str2, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str3, "Banco(id=null, nome=hi!, contas=[])");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.example.Conta[] contaArray4 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList5 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList5, contaArray4);
        com.example.Banco banco7 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=[])", (java.util.List<com.example.Conta>) contaList5);
        com.example.Banco banco8 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList5);
        java.lang.String str9 = banco8.getNome();
        java.lang.Class<?> wildcardClass10 = banco8.getClass();
        org.junit.Assert.assertNotNull(contaArray4);
        org.junit.Assert.assertArrayEquals(contaArray4, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=[])", (java.util.List<com.example.Conta>) contaList3);
        com.example.Conta conta6 = null;
        banco5.addConta(conta6);
        banco5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        java.util.List<com.example.Conta> contaList3 = banco1.getContas();
        java.lang.String str4 = banco1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str2, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertNotNull(contaList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str4, "Banco(id=null, nome=hi!, contas=[])");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        banco1.setId((java.lang.Long) 1L);
        com.example.Banco banco6 = new com.example.Banco("hi!");
        com.example.Conta conta7 = null;
        banco6.addConta(conta7);
        com.example.Conta conta9 = null;
        banco6.addConta(conta9);
        java.lang.String str11 = banco6.getNome();
        java.util.List<com.example.Conta> contaList12 = banco6.getContas();
        banco1.setContas(contaList12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str2, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(contaList12);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        com.example.Conta conta4 = null;
        banco1.addConta(conta4);
        banco1.setId((java.lang.Long) 100L);
        banco1.setNome("Banco(id=10, nome=hi!, contas=[])");
        java.lang.Long long10 = banco1.getId();
        banco1.setNome("Banco(id=null, nome=null, contas=null)");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=[])", (java.util.List<com.example.Conta>) contaList7);
        com.example.Banco banco10 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList7);
        com.example.Banco banco11 = new com.example.Banco((java.lang.Long) 0L, "", (java.util.List<com.example.Conta>) contaList7);
        banco11.setNome("Banco(id=null, nome=null, contas=null)");
        java.lang.String str14 = banco11.getNome();
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Banco(id=null, nome=null, contas=null)" + "'", str14, "Banco(id=null, nome=null, contas=null)");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=[])", (java.util.List<com.example.Conta>) contaList7);
        com.example.Banco banco10 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList7);
        com.example.Banco banco11 = new com.example.Banco((java.lang.Long) 0L, "", (java.util.List<com.example.Conta>) contaList7);
        banco11.addContaById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        banco1.setId((java.lang.Long) 1L);
        com.example.Banco banco6 = new com.example.Banco("hi!");
        com.example.Conta conta7 = null;
        banco6.addConta(conta7);
        com.example.Conta conta9 = null;
        banco6.addConta(conta9);
        banco6.setId((java.lang.Long) 100L);
        java.util.List<com.example.Conta> contaList13 = banco6.getContas();
        boolean boolean14 = banco1.equals((java.lang.Object) banco6);
        banco1.addContaById((java.lang.Long) (-1L));
        java.lang.String str17 = banco1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str2, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertNotNull(contaList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Banco(id=1, nome=hi!, contas=[Conta(id=-1, beneficiario=null, banco=null, saldo=null, numeroConta=0, digitoVerificador=\000)])" + "'", str17, "Banco(id=1, nome=hi!, contas=[Conta(id=-1, beneficiario=null, banco=null, saldo=null, numeroConta=0, digitoVerificador=\000)])");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        boolean boolean4 = banco1.equals((java.lang.Object) "Banco(id=null, nome=hi!, contas=[null, null])");
        com.example.Conta conta5 = null;
        com.example.Conta conta6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = banco1.transferencia(conta5, conta6, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str2, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        com.example.Conta conta4 = null;
        banco1.addConta(conta4);
        banco1.setId((java.lang.Long) 100L);
        java.util.List<com.example.Conta> contaList8 = banco1.getContas();
        com.example.Conta conta9 = null;
        com.example.Conta conta10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean12 = banco1.transferencia(conta9, conta10, (java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(contaList8);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        com.example.Conta conta4 = null;
        banco1.addConta(conta4);
        java.lang.String str6 = banco1.getNome();
        java.util.List<com.example.Conta> contaList7 = banco1.getContas();
        java.util.List<com.example.Conta> contaList8 = banco1.getContas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(contaList7);
        org.junit.Assert.assertNotNull(contaList8);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.example.Conta[] contaArray4 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList5 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList5, contaArray4);
        com.example.Banco banco7 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=[])", (java.util.List<com.example.Conta>) contaList5);
        com.example.Banco banco8 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList5);
        java.lang.String str9 = banco8.toString();
        com.example.Banco banco10 = new com.example.Banco();
        com.example.Conta[] contaArray13 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList14 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList14, contaArray13);
        com.example.Banco banco16 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=[])", (java.util.List<com.example.Conta>) contaList14);
        banco10.setContas((java.util.List<com.example.Conta>) contaList14);
        boolean boolean18 = banco8.canEqual((java.lang.Object) banco10);
        com.example.Conta conta19 = null;
        banco10.addConta(conta19);
        banco10.setId((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass23 = banco10.getClass();
        org.junit.Assert.assertNotNull(contaArray4);
        org.junit.Assert.assertArrayEquals(contaArray4, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Banco(id=10, nome=hi!, contas=[])" + "'", str9, "Banco(id=10, nome=hi!, contas=[])");
        org.junit.Assert.assertNotNull(contaArray13);
        org.junit.Assert.assertArrayEquals(contaArray13, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        banco1.setId((java.lang.Long) 1L);
        com.example.Banco banco6 = new com.example.Banco("hi!");
        com.example.Conta conta7 = null;
        banco6.addConta(conta7);
        com.example.Conta conta9 = null;
        banco6.addConta(conta9);
        banco6.setId((java.lang.Long) 100L);
        java.util.List<com.example.Conta> contaList13 = banco6.getContas();
        boolean boolean14 = banco1.equals((java.lang.Object) banco6);
        java.lang.Long long15 = banco1.getId();
        java.lang.String str16 = banco1.getNome();
        banco1.addContaById((java.lang.Long) 1L);
        banco1.addContaById((java.lang.Long) 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str2, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertNotNull(contaList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        com.example.Conta conta4 = null;
        banco1.addConta(conta4);
        java.lang.String str6 = banco1.getNome();
        java.util.List<com.example.Conta> contaList7 = banco1.getContas();
        java.lang.String str8 = banco1.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(contaList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Banco(id=null, nome=hi!, contas=[null, null])" + "'", str8, "Banco(id=null, nome=hi!, contas=[null, null])");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        boolean boolean4 = banco1.canEqual((java.lang.Object) 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str2, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        com.example.Conta conta4 = null;
        banco1.addConta(conta4);
        banco1.setId((java.lang.Long) 100L);
        java.util.List<com.example.Conta> contaList8 = banco1.getContas();
        com.example.Conta conta9 = null;
        banco1.addConta(conta9);
        com.example.Conta[] contaArray17 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList18 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList18, contaArray17);
        com.example.Banco banco20 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=[])", (java.util.List<com.example.Conta>) contaList18);
        com.example.Banco banco21 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList18);
        com.example.Banco banco22 = new com.example.Banco((java.lang.Long) 0L, "", (java.util.List<com.example.Conta>) contaList18);
        banco1.setContas((java.util.List<com.example.Conta>) contaList18);
        org.junit.Assert.assertNotNull(contaList8);
        org.junit.Assert.assertNotNull(contaArray17);
        org.junit.Assert.assertArrayEquals(contaArray17, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        com.example.Conta conta4 = null;
        banco1.addConta(conta4);
        java.lang.String str6 = banco1.toString();
        banco1.setNome("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Banco(id=null, nome=hi!, contas=[null, null])" + "'", str6, "Banco(id=null, nome=hi!, contas=[null, null])");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        com.example.Conta conta4 = null;
        banco1.addConta(conta4);
        java.lang.String str6 = banco1.toString();
        java.lang.String str7 = banco1.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Banco(id=null, nome=hi!, contas=[null, null])" + "'", str6, "Banco(id=null, nome=hi!, contas=[null, null])");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Banco(id=null, nome=hi!, contas=[null, null])" + "'", str7, "Banco(id=null, nome=hi!, contas=[null, null])");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        com.example.Conta conta4 = null;
        banco1.addConta(conta4);
        java.lang.String str6 = banco1.getNome();
        java.lang.Long long7 = banco1.getId();
        banco1.addContaById((java.lang.Long) 100L);
        banco1.setId((java.lang.Long) 0L);
        banco1.setNome("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=[])", (java.util.List<com.example.Conta>) contaList3);
        banco5.setId((java.lang.Long) 0L);
        com.example.Conta conta8 = null;
        com.example.Conta conta9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = banco5.transferencia(conta8, conta9, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.example.Conta[] contaArray4 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList5 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList5, contaArray4);
        com.example.Banco banco7 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=[])", (java.util.List<com.example.Conta>) contaList5);
        com.example.Banco banco8 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList5);
        java.lang.String str9 = banco8.toString();
        com.example.Banco banco10 = new com.example.Banco();
        com.example.Conta[] contaArray13 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList14 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList14, contaArray13);
        com.example.Banco banco16 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=[])", (java.util.List<com.example.Conta>) contaList14);
        banco10.setContas((java.util.List<com.example.Conta>) contaList14);
        boolean boolean18 = banco8.canEqual((java.lang.Object) banco10);
        com.example.Conta conta19 = null;
        banco10.addConta(conta19);
        banco10.setId((java.lang.Long) 100L);
        banco10.setId((java.lang.Long) 0L);
        banco10.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(contaArray4);
        org.junit.Assert.assertArrayEquals(contaArray4, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Banco(id=10, nome=hi!, contas=[])" + "'", str9, "Banco(id=10, nome=hi!, contas=[])");
        org.junit.Assert.assertNotNull(contaArray13);
        org.junit.Assert.assertArrayEquals(contaArray13, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        java.lang.String str3 = banco1.toString();
        com.example.Conta conta4 = null;
        banco1.addConta(conta4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str2, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str3, "Banco(id=null, nome=hi!, contas=[])");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.example.Conta[] contaArray4 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList5 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList5, contaArray4);
        com.example.Banco banco7 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=[])", (java.util.List<com.example.Conta>) contaList5);
        com.example.Banco banco8 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList5);
        java.lang.String str9 = banco8.toString();
        com.example.Banco banco10 = new com.example.Banco();
        com.example.Conta[] contaArray13 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList14 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList14, contaArray13);
        com.example.Banco banco16 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=[])", (java.util.List<com.example.Conta>) contaList14);
        banco10.setContas((java.util.List<com.example.Conta>) contaList14);
        boolean boolean18 = banco8.canEqual((java.lang.Object) banco10);
        com.example.Conta conta19 = null;
        banco10.addConta(conta19);
        banco10.setId((java.lang.Long) 100L);
        java.lang.Long long23 = banco10.getId();
        org.junit.Assert.assertNotNull(contaArray4);
        org.junit.Assert.assertArrayEquals(contaArray4, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Banco(id=10, nome=hi!, contas=[])" + "'", str9, "Banco(id=10, nome=hi!, contas=[])");
        org.junit.Assert.assertNotNull(contaArray13);
        org.junit.Assert.assertArrayEquals(contaArray13, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        com.example.Conta conta2 = null;
        banco1.addConta(conta2);
        com.example.Conta conta4 = null;
        banco1.addConta(conta4);
        java.lang.String str6 = banco1.getNome();
        com.example.Conta[] contaArray7 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList8 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList8, contaArray7);
        banco1.setContas((java.util.List<com.example.Conta>) contaList8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(contaArray7);
        org.junit.Assert.assertArrayEquals(contaArray7, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        banco1.setId((java.lang.Long) 1L);
        com.example.Banco banco6 = new com.example.Banco("hi!");
        com.example.Conta conta7 = null;
        banco6.addConta(conta7);
        com.example.Conta conta9 = null;
        banco6.addConta(conta9);
        banco6.setId((java.lang.Long) 100L);
        java.util.List<com.example.Conta> contaList13 = banco6.getContas();
        boolean boolean14 = banco1.equals((java.lang.Object) banco6);
        banco6.addContaById((java.lang.Long) 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=[])" + "'", str2, "Banco(id=null, nome=hi!, contas=[])");
        org.junit.Assert.assertNotNull(contaList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.example.Banco banco3 = new com.example.Banco("hi!");
        com.example.Conta conta4 = null;
        banco3.addConta(conta4);
        com.example.Conta conta6 = null;
        banco3.addConta(conta6);
        java.lang.String str8 = banco3.getNome();
        java.util.List<com.example.Conta> contaList9 = banco3.getContas();
        com.example.Banco banco10 = new com.example.Banco((java.lang.Long) 1L, "Banco(id=null, nome=hi!, contas=[null, null])", contaList9);
        banco10.setId((java.lang.Long) 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(contaList9);
    }
}

