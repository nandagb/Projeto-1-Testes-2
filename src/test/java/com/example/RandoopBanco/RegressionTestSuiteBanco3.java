package com.example;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTestSuiteBanco3 {

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
        // The following exception was thrown during execution in test generation
        try {
            banco1.addConta(conta2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        com.example.Conta conta3 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco1.addConta(conta3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str2, "Banco(id=null, nome=hi!, contas=null)");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        java.util.List<com.example.Conta> contaList3 = banco1.getContas();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str2, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertNull(contaList3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.setId((java.lang.Long) 100L);
        com.example.Conta conta3 = null;
        com.example.Conta conta4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = banco0.transferencia(conta3, conta4, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.setId((java.lang.Long) 100L);
        com.example.Conta conta3 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco0.addConta(conta3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        java.lang.String str3 = banco1.toString();
        com.example.Conta[] contaArray4 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList5 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList5, contaArray4);
        banco1.setContas((java.util.List<com.example.Conta>) contaList5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str2, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str3, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertNotNull(contaArray4);
        org.junit.Assert.assertArrayEquals(contaArray4, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        java.lang.String str3 = banco1.toString();
        java.lang.Long long4 = banco1.getId();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str2, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str3, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.example.Banco banco0 = new com.example.Banco();
        java.lang.String str1 = banco0.toString();
        java.lang.String str2 = banco0.getNome();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Banco(id=null, nome=null, contas=null)" + "'", str1, "Banco(id=null, nome=null, contas=null)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList3);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        banco5.setContas((java.util.List<com.example.Conta>) contaList7);
        banco5.setId((java.lang.Long) 1L);
        java.lang.String str12 = banco5.getNome();
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str12, "Banco(id=null, nome=hi!, contas=null)");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.example.Conta[] contaArray4 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList5 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList5, contaArray4);
        com.example.Banco banco7 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList5);
        com.example.Banco banco8 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList5);
        com.example.Conta conta9 = null;
        banco8.addConta(conta9);
        org.junit.Assert.assertNotNull(contaArray4);
        org.junit.Assert.assertArrayEquals(contaArray4, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.Long long2 = banco1.getId();
        boolean boolean4 = banco1.canEqual((java.lang.Object) '4');
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.setId((java.lang.Long) 100L);
        com.example.Conta conta3 = null;
        com.example.Conta conta4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = banco0.transferencia(conta3, conta4, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.example.Banco banco1 = new com.example.Banco("");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.setId((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass3 = banco0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.example.Conta[] contaArray4 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList5 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList5, contaArray4);
        com.example.Banco banco7 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList5);
        com.example.Banco banco8 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList5);
        java.util.List<com.example.Conta> contaList9 = banco8.getContas();
        banco8.setNome("Banco(id=null, nome=null, contas=null)");
        java.lang.String str12 = banco8.getNome();
        banco8.addContaById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(contaArray4);
        org.junit.Assert.assertArrayEquals(contaArray4, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(contaList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Banco(id=null, nome=null, contas=null)" + "'", str12, "Banco(id=null, nome=null, contas=null)");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList3);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        banco5.setContas((java.util.List<com.example.Conta>) contaList7);
        boolean boolean11 = banco5.canEqual((java.lang.Object) (short) 1);
        banco5.setNome("hi!");
        banco5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.example.Banco banco1 = new com.example.Banco("Banco(id=null, nome=hi!, contas=null)");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.example.Conta[] contaArray4 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList5 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList5, contaArray4);
        com.example.Banco banco7 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList5);
        com.example.Banco banco8 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList5);
        java.util.List<com.example.Conta> contaList9 = banco8.getContas();
        banco8.setNome("Banco(id=null, nome=null, contas=null)");
        com.example.Conta conta12 = null;
        banco8.addConta(conta12);
        org.junit.Assert.assertNotNull(contaArray4);
        org.junit.Assert.assertArrayEquals(contaArray4, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(contaList9);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList3);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        banco5.setContas((java.util.List<com.example.Conta>) contaList7);
        com.example.Conta conta10 = null;
        banco5.addConta(conta10);
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList3);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        banco5.setContas((java.util.List<com.example.Conta>) contaList7);
        banco5.setId((java.lang.Long) 1L);
        banco5.setNome("hi!");
        java.lang.String str14 = banco5.getNome();
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.example.Conta[] contaArray4 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList5 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList5, contaArray4);
        com.example.Banco banco7 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList5);
        com.example.Conta[] contaArray8 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList9 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList9, contaArray8);
        banco7.setContas((java.util.List<com.example.Conta>) contaList9);
        com.example.Banco banco12 = new com.example.Banco((java.lang.Long) (-1L), "Banco(id=null, nome=null, contas=null)", (java.util.List<com.example.Conta>) contaList9);
        java.lang.String str13 = banco12.getNome();
        org.junit.Assert.assertNotNull(contaArray4);
        org.junit.Assert.assertArrayEquals(contaArray4, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(contaArray8);
        org.junit.Assert.assertArrayEquals(contaArray8, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Banco(id=null, nome=null, contas=null)" + "'", str13, "Banco(id=null, nome=null, contas=null)");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList3);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        banco5.setContas((java.util.List<com.example.Conta>) contaList7);
        java.lang.String str10 = banco5.getNome();
        com.example.Banco banco12 = new com.example.Banco("hi!");
        java.lang.String str13 = banco12.toString();
        boolean boolean14 = banco5.equals((java.lang.Object) banco12);
        java.util.List<com.example.Conta> contaList15 = banco5.getContas();
        banco5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str10, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str13, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(contaList15);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList3);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        banco5.setContas((java.util.List<com.example.Conta>) contaList7);
        java.lang.String str10 = banco5.getNome();
        com.example.Banco banco12 = new com.example.Banco("hi!");
        java.lang.String str13 = banco12.toString();
        boolean boolean14 = banco5.equals((java.lang.Object) banco12);
        java.util.List<com.example.Conta> contaList15 = banco5.getContas();
        java.lang.String str16 = banco5.toString();
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str10, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str13, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(contaList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Banco(id=100, nome=Banco(id=null, nome=hi!, contas=null), contas=[])" + "'", str16, "Banco(id=100, nome=Banco(id=null, nome=hi!, contas=null), contas=[])");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList3);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        banco5.setContas((java.util.List<com.example.Conta>) contaList7);
        banco5.setId((java.lang.Long) 1L);
        banco5.setNome("hi!");
        java.util.List<com.example.Conta> contaList14 = banco5.getContas();
        com.example.Conta[] contaArray19 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList20 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList20, contaArray19);
        com.example.Banco banco22 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList20);
        com.example.Banco banco23 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList20);
        banco5.setContas((java.util.List<com.example.Conta>) contaList20);
        banco5.setNome("hi!");
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(contaList14);
        org.junit.Assert.assertNotNull(contaArray19);
        org.junit.Assert.assertArrayEquals(contaArray19, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.setId((java.lang.Long) 100L);
        boolean boolean4 = banco0.equals((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass5 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList3);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        banco5.setContas((java.util.List<com.example.Conta>) contaList7);
        java.lang.String str10 = banco5.getNome();
        com.example.Banco banco12 = new com.example.Banco("hi!");
        java.lang.String str13 = banco12.toString();
        boolean boolean14 = banco5.equals((java.lang.Object) banco12);
        com.example.Conta conta15 = null;
        com.example.Conta conta16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean18 = banco5.transferencia(conta15, conta16, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str10, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str13, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.example.Conta[] contaArray4 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList5 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList5, contaArray4);
        com.example.Banco banco7 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList5);
        com.example.Banco banco8 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList5);
        boolean boolean10 = banco8.canEqual((java.lang.Object) 100.0d);
        com.example.Conta[] contaArray13 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList14 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList14, contaArray13);
        com.example.Banco banco16 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList14);
        com.example.Conta[] contaArray17 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList18 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList18, contaArray17);
        banco16.setContas((java.util.List<com.example.Conta>) contaList18);
        banco16.setId((java.lang.Long) 1L);
        banco16.addContaById((java.lang.Long) 0L);
        boolean boolean25 = banco8.canEqual((java.lang.Object) banco16);
        com.example.Conta[] contaArray30 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList31 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList31, contaArray30);
        com.example.Banco banco33 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList31);
        com.example.Banco banco34 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList31);
        boolean boolean36 = banco34.canEqual((java.lang.Object) 100.0d);
        com.example.Conta[] contaArray39 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList40 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList40, contaArray39);
        com.example.Banco banco42 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList40);
        com.example.Conta[] contaArray43 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList44 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList44, contaArray43);
        banco42.setContas((java.util.List<com.example.Conta>) contaList44);
        banco42.setId((java.lang.Long) 1L);
        banco42.addContaById((java.lang.Long) 0L);
        boolean boolean51 = banco34.canEqual((java.lang.Object) banco42);
        boolean boolean52 = banco16.equals((java.lang.Object) banco42);
        org.junit.Assert.assertNotNull(contaArray4);
        org.junit.Assert.assertArrayEquals(contaArray4, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(contaArray13);
        org.junit.Assert.assertArrayEquals(contaArray13, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(contaArray17);
        org.junit.Assert.assertArrayEquals(contaArray17, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(contaArray30);
        org.junit.Assert.assertArrayEquals(contaArray30, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(contaArray39);
        org.junit.Assert.assertArrayEquals(contaArray39, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(contaArray43);
        org.junit.Assert.assertArrayEquals(contaArray43, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList7);
        com.example.Banco banco10 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList7);
        com.example.Banco banco11 = new com.example.Banco((java.lang.Long) 1L, "Banco(id=100, nome=Banco(id=null, nome=hi!, contas=null), contas=[])", (java.util.List<com.example.Conta>) contaList7);
        banco11.addContaById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList3);
        java.util.List<com.example.Conta> contaList6 = banco5.getContas();
        com.example.Conta[] contaArray11 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList12 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList12, contaArray11);
        com.example.Banco banco14 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList12);
        com.example.Conta[] contaArray15 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList16 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList16, contaArray15);
        banco14.setContas((java.util.List<com.example.Conta>) contaList16);
        boolean boolean20 = banco14.canEqual((java.lang.Object) (short) 1);
        com.example.Conta[] contaArray21 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList22 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList22, contaArray21);
        banco14.setContas((java.util.List<com.example.Conta>) contaList22);
        com.example.Banco banco25 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList22);
        banco5.setContas((java.util.List<com.example.Conta>) contaList22);
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(contaList6);
        org.junit.Assert.assertNotNull(contaArray11);
        org.junit.Assert.assertArrayEquals(contaArray11, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(contaArray15);
        org.junit.Assert.assertArrayEquals(contaArray15, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(contaArray21);
        org.junit.Assert.assertArrayEquals(contaArray21, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        java.lang.String str3 = banco1.toString();
        java.lang.String str4 = banco1.getNome();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str2, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str3, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.example.Conta[] contaArray4 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList5 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList5, contaArray4);
        com.example.Banco banco7 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList5);
        com.example.Conta[] contaArray8 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList9 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList9, contaArray8);
        banco7.setContas((java.util.List<com.example.Conta>) contaList9);
        java.lang.String str12 = banco7.getNome();
        com.example.Banco banco14 = new com.example.Banco("hi!");
        java.lang.String str15 = banco14.toString();
        boolean boolean16 = banco7.equals((java.lang.Object) banco14);
        java.util.List<com.example.Conta> contaList17 = banco7.getContas();
        boolean boolean19 = banco7.canEqual((java.lang.Object) 10.0d);
        java.lang.String str20 = banco7.toString();
        java.util.List<com.example.Conta> contaList21 = banco7.getContas();
        com.example.Banco banco22 = new com.example.Banco((java.lang.Long) 1L, "Banco(id=100, nome=Banco(id=null, nome=hi!, contas=null), contas=[])", contaList21);
        org.junit.Assert.assertNotNull(contaArray4);
        org.junit.Assert.assertArrayEquals(contaArray4, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(contaArray8);
        org.junit.Assert.assertArrayEquals(contaArray8, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str12, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str15, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(contaList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Banco(id=100, nome=Banco(id=null, nome=hi!, contas=null), contas=[])" + "'", str20, "Banco(id=100, nome=Banco(id=null, nome=hi!, contas=null), contas=[])");
        org.junit.Assert.assertNotNull(contaList21);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList3);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        banco5.setContas((java.util.List<com.example.Conta>) contaList7);
        java.lang.String str10 = banco5.getNome();
        banco5.addContaById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str10, "Banco(id=null, nome=hi!, contas=null)");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.example.Banco banco1 = new com.example.Banco("Banco(id=10, nome=hi!, contas=[])");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.example.Banco banco0 = new com.example.Banco();
        java.lang.String str1 = banco0.toString();
        boolean boolean3 = banco0.equals((java.lang.Object) 100.0f);
        com.example.Conta[] contaArray10 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList11 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList11, contaArray10);
        com.example.Banco banco13 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList11);
        com.example.Banco banco14 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList11);
        com.example.Banco banco15 = new com.example.Banco((java.lang.Long) 1L, "Banco(id=100, nome=Banco(id=null, nome=hi!, contas=null), contas=[])", (java.util.List<com.example.Conta>) contaList11);
        banco0.setContas((java.util.List<com.example.Conta>) contaList11);
        java.util.List<com.example.Conta> contaList17 = banco0.getContas();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Banco(id=null, nome=null, contas=null)" + "'", str1, "Banco(id=null, nome=null, contas=null)");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(contaArray10);
        org.junit.Assert.assertArrayEquals(contaArray10, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(contaList17);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList3);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        banco5.setContas((java.util.List<com.example.Conta>) contaList7);
        java.lang.String str10 = banco5.getNome();
        java.util.List<com.example.Conta> contaList11 = banco5.getContas();
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str10, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertNotNull(contaList11);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.example.Banco banco1 = new com.example.Banco("hi!");
        java.lang.String str2 = banco1.toString();
        java.lang.String str3 = banco1.toString();
        banco1.setId((java.lang.Long) 1L);
        java.util.List<com.example.Conta> contaList6 = banco1.getContas();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str2, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str3, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertNull(contaList6);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList3);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        banco5.setContas((java.util.List<com.example.Conta>) contaList7);
        boolean boolean11 = banco5.canEqual((java.lang.Object) (short) 1);
        banco5.setNome("hi!");
        java.util.List<com.example.Conta> contaList14 = banco5.getContas();
        com.example.Conta conta15 = null;
        banco5.addConta(conta15);
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(contaList14);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.example.Banco banco1 = new com.example.Banco("Banco(id=null, nome=null, contas=null)");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 0L, "", (java.util.List<com.example.Conta>) contaList3);
        java.lang.Long long6 = banco5.getId();
        banco5.addContaById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList3);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        banco5.setContas((java.util.List<com.example.Conta>) contaList7);
        java.lang.String str10 = banco5.getNome();
        com.example.Banco banco12 = new com.example.Banco("hi!");
        java.lang.String str13 = banco12.toString();
        boolean boolean14 = banco5.equals((java.lang.Object) banco12);
        java.lang.Long long15 = banco5.getId();
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str10, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Banco(id=null, nome=hi!, contas=null)" + "'", str13, "Banco(id=null, nome=hi!, contas=null)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList3);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        banco5.setContas((java.util.List<com.example.Conta>) contaList7);
        banco5.setId((java.lang.Long) 1L);
        banco5.setNome("hi!");
        java.util.List<com.example.Conta> contaList14 = banco5.getContas();
        java.lang.String str15 = banco5.toString();
        java.lang.Long long16 = banco5.getId();
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(contaList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Banco(id=1, nome=hi!, contas=[])" + "'", str15, "Banco(id=1, nome=hi!, contas=[])");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList3);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        banco5.setContas((java.util.List<com.example.Conta>) contaList7);
        banco5.setId((java.lang.Long) 1L);
        banco5.addContaById((java.lang.Long) 0L);
        com.example.Conta[] contaArray16 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList17 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList17, contaArray16);
        com.example.Banco banco19 = new com.example.Banco((java.lang.Long) 0L, "", (java.util.List<com.example.Conta>) contaList17);
        banco5.setContas((java.util.List<com.example.Conta>) contaList17);
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(contaArray16);
        org.junit.Assert.assertArrayEquals(contaArray16, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.example.Conta[] contaArray4 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList5 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList5, contaArray4);
        com.example.Banco banco7 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList5);
        com.example.Banco banco8 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList5);
        java.util.List<com.example.Conta> contaList9 = banco8.getContas();
        banco8.addContaById((java.lang.Long) 10L);
        banco8.setNome("Banco(id=null, nome=null, contas=null)");
        org.junit.Assert.assertNotNull(contaArray4);
        org.junit.Assert.assertArrayEquals(contaArray4, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(contaList9);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.example.Banco banco0 = new com.example.Banco();
        java.lang.String str1 = banco0.toString();
        banco0.setNome("");
        java.lang.String str4 = banco0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Banco(id=null, nome=null, contas=null)" + "'", str1, "Banco(id=null, nome=null, contas=null)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Banco(id=null, nome=, contas=null)" + "'", str4, "Banco(id=null, nome=, contas=null)");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList7);
        com.example.Banco banco10 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList7);
        com.example.Banco banco11 = new com.example.Banco((java.lang.Long) 1L, "Banco(id=100, nome=Banco(id=null, nome=hi!, contas=null), contas=[])", (java.util.List<com.example.Conta>) contaList7);
        banco11.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.example.Conta[] contaArray4 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList5 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList5, contaArray4);
        com.example.Banco banco7 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList5);
        com.example.Banco banco8 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList5);
        java.lang.String str9 = banco8.getNome();
        java.lang.String str10 = banco8.toString();
        banco8.setNome("Banco(id=100, nome=Banco(id=null, nome=hi!, contas=null), contas=[])");
        com.example.Conta conta13 = null;
        banco8.addConta(conta13);
        org.junit.Assert.assertNotNull(contaArray4);
        org.junit.Assert.assertArrayEquals(contaArray4, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Banco(id=10, nome=hi!, contas=[])" + "'", str10, "Banco(id=10, nome=hi!, contas=[])");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList3);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        banco5.setContas((java.util.List<com.example.Conta>) contaList7);
        banco5.setId((java.lang.Long) 1L);
        banco5.setNome("hi!");
        java.util.List<com.example.Conta> contaList14 = banco5.getContas();
        com.example.Conta[] contaArray19 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList20 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList20, contaArray19);
        com.example.Banco banco22 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList20);
        com.example.Banco banco23 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList20);
        banco5.setContas((java.util.List<com.example.Conta>) contaList20);
        com.example.Conta[] contaArray29 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList30 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList30, contaArray29);
        com.example.Banco banco32 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList30);
        com.example.Conta[] contaArray33 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList34 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList34, contaArray33);
        banco32.setContas((java.util.List<com.example.Conta>) contaList34);
        com.example.Banco banco37 = new com.example.Banco((java.lang.Long) (-1L), "Banco(id=null, nome=null, contas=null)", (java.util.List<com.example.Conta>) contaList34);
        boolean boolean38 = banco5.equals((java.lang.Object) contaList34);
        java.lang.Long long39 = banco5.getId();
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(contaList14);
        org.junit.Assert.assertNotNull(contaArray19);
        org.junit.Assert.assertArrayEquals(contaArray19, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(contaArray29);
        org.junit.Assert.assertArrayEquals(contaArray29, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(contaArray33);
        org.junit.Assert.assertArrayEquals(contaArray33, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.example.Banco banco1 = new com.example.Banco("Banco(id=100, nome=Banco(id=null, nome=hi!, contas=null), contas=[])");
        com.example.Conta[] contaArray4 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList5 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList5, contaArray4);
        com.example.Banco banco7 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList5);
        com.example.Conta[] contaArray8 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList9 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList9, contaArray8);
        banco7.setContas((java.util.List<com.example.Conta>) contaList9);
        boolean boolean13 = banco7.canEqual((java.lang.Object) (short) 1);
        banco7.setNome("hi!");
        java.util.List<com.example.Conta> contaList16 = banco7.getContas();
        banco1.setContas(contaList16);
        org.junit.Assert.assertNotNull(contaArray4);
        org.junit.Assert.assertArrayEquals(contaArray4, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(contaArray8);
        org.junit.Assert.assertArrayEquals(contaArray8, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(contaList16);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.example.Conta[] contaArray4 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList5 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList5, contaArray4);
        com.example.Banco banco7 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=null, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList5);
        com.example.Banco banco8 = new com.example.Banco((java.lang.Long) 10L, "hi!", (java.util.List<com.example.Conta>) contaList5);
        java.util.List<com.example.Conta> contaList9 = banco8.getContas();
        banco8.setNome("Banco(id=null, nome=null, contas=null)");
        java.lang.String str12 = banco8.getNome();
        banco8.addContaById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(contaArray4);
        org.junit.Assert.assertArrayEquals(contaArray4, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(contaList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Banco(id=null, nome=null, contas=null)" + "'", str12, "Banco(id=null, nome=null, contas=null)");
    }
}

