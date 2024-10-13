package com.example;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTestSuiteConta1 {

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
        com.example.Conta conta0 = new com.example.Conta();
        java.lang.Class<?> wildcardClass1 = conta0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.example.Conta conta1 = new com.example.Conta((java.lang.Long) 1L);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        com.example.Banco banco4 = null;
        conta0.setBanco(banco4);
        java.lang.Class<?> wildcardClass6 = conta0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 1L, "hi!", banco2, (java.lang.Double) (-1.0d), 100, '4');
        java.lang.Boolean boolean8 = conta6.debitar((double) 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.example.Conta conta0 = new com.example.Conta();
        int int1 = conta0.getNumeroConta();
        java.lang.String str2 = conta0.toString();
        com.example.Banco banco3 = conta0.getBanco();
        char char4 = conta0.getDigitoVerificador();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Conta(id=null, beneficiario=null, banco=null, saldo=null, numeroConta=0, digitoVerificador=\000)" + "'", str2, "Conta(id=null, beneficiario=null, banco=null, saldo=null, numeroConta=0, digitoVerificador=\000)");
        org.junit.Assert.assertNull(banco3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        java.lang.Class<?> wildcardClass4 = conta0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 1L, "hi!", banco2, (java.lang.Double) (-1.0d), 100, '4');
        boolean boolean8 = conta6.equals((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass9 = conta6.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 0L, "", banco2, (java.lang.Double) 0.0d, 0, 'a');
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        conta0.setDigitoVerificador('\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.example.Conta conta0 = new com.example.Conta();
        int int1 = conta0.getNumeroConta();
        conta0.setId((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass4 = conta0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.example.Conta conta0 = new com.example.Conta();
        int int1 = conta0.getNumeroConta();
        java.lang.Class<?> wildcardClass2 = conta0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 1L, "hi!", banco2, (java.lang.Double) (-1.0d), 100, '4');
        java.lang.Boolean boolean8 = conta6.creditar(0.0d);
        boolean boolean10 = conta6.canEqual((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        conta0.setSaldo((double) (-1));
        java.lang.Boolean boolean6 = conta0.debitar((double) (byte) -1);
        char char7 = conta0.getDigitoVerificador();
        char char9 = conta0.calculaDigitoVerificador((int) 'a');
        int int10 = conta0.getNumeroConta();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '8' + "'", char9 == '8');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        boolean boolean5 = conta0.equals((java.lang.Object) '\000');
        java.lang.String str6 = conta0.toString();
        java.lang.Double double7 = conta0.getSaldo();
        java.lang.Long long8 = conta0.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)" + "'", str6, "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 1L, "hi!", banco2, (java.lang.Double) (-1.0d), 100, '4');
        java.lang.Boolean boolean8 = conta6.creditar(0.0d);
        com.example.Banco banco11 = null;
        com.example.Conta conta15 = new com.example.Conta((java.lang.Long) 1L, "hi!", banco11, (java.lang.Double) (-1.0d), 100, '4');
        java.lang.Boolean boolean17 = conta15.creditar(0.0d);
        boolean boolean18 = conta6.canEqual((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 1L, "hi!", banco2, (java.lang.Double) (-1.0d), 100, '4');
        char char7 = conta6.getDigitoVerificador();
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '4' + "'", char7 == '4');
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        boolean boolean5 = conta0.equals((java.lang.Object) '\000');
        java.lang.String str6 = conta0.toString();
        java.lang.Double double7 = conta0.getSaldo();
        com.example.Conta conta8 = new com.example.Conta();
        conta8.setSaldo((double) 10);
        java.lang.Class<?> wildcardClass11 = conta8.getClass();
        boolean boolean12 = conta0.canEqual((java.lang.Object) conta8);
        conta0.setSaldo((double) 100.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)" + "'", str6, "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        char char5 = conta0.calculaDigitoVerificador((int) (short) -1);
        conta0.setSaldo((double) (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        conta0.setSaldo((double) (-1));
        java.lang.Boolean boolean6 = conta0.debitar((double) (byte) -1);
        conta0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.example.Conta conta0 = new com.example.Conta();
        boolean boolean2 = conta0.equals((java.lang.Object) 100.0f);
        int int3 = conta0.getNumeroConta();
        char char4 = conta0.getDigitoVerificador();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        boolean boolean5 = conta0.equals((java.lang.Object) '\000');
        java.lang.Double double6 = conta0.getSaldo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.example.Conta conta0 = new com.example.Conta();
        char char1 = conta0.getDigitoVerificador();
        com.example.Banco banco2 = conta0.getBanco();
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
        org.junit.Assert.assertNull(banco2);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setDigitoVerificador('a');
        com.example.Conta conta3 = new com.example.Conta();
        boolean boolean5 = conta3.equals((java.lang.Object) (-1.0d));
        boolean boolean6 = conta0.canEqual((java.lang.Object) boolean5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        int int4 = conta0.getNumeroConta();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        conta0.setSaldo((double) (-1));
        java.lang.Boolean boolean6 = conta0.debitar((double) (byte) -1);
        char char7 = conta0.getDigitoVerificador();
        char char9 = conta0.calculaDigitoVerificador((int) 'a');
        char char10 = conta0.getDigitoVerificador();
        conta0.setNumeroConta(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '8' + "'", char9 == '8');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.example.Conta conta0 = new com.example.Conta();
        boolean boolean2 = conta0.equals((java.lang.Object) 100.0f);
        int int3 = conta0.getNumeroConta();
        char char5 = conta0.calculaDigitoVerificador((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '2' + "'", char5 == '2');
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 1L, "Conta(id=null, beneficiario=null, banco=null, saldo=null, numeroConta=0, digitoVerificador=\000)", banco2, (java.lang.Double) (-1.0d), (int) '#', 'a');
        java.lang.Boolean boolean8 = conta6.creditar((double) '#');
        java.lang.Boolean boolean10 = conta6.debitar((double) '4');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 1L, "Conta(id=null, beneficiario=null, banco=null, saldo=null, numeroConta=0, digitoVerificador=\000)", banco2, (java.lang.Double) (-1.0d), (int) '#', 'a');
        java.lang.Boolean boolean8 = conta6.creditar((double) '#');
        java.lang.Long long9 = conta6.getId();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 1L, "hi!", banco2, (java.lang.Double) (-1.0d), 100, '4');
        boolean boolean8 = conta6.equals((java.lang.Object) (short) -1);
        int int9 = conta6.getNumeroConta();
        java.lang.Boolean boolean11 = conta6.creditar((double) (byte) 10);
        java.lang.Object obj12 = null;
        boolean boolean13 = conta6.equals(obj12);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        boolean boolean5 = conta0.equals((java.lang.Object) '\000');
        conta0.setBeneficiario("Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)");
        boolean boolean9 = conta0.canEqual((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        boolean boolean5 = conta0.equals((java.lang.Object) '\000');
        conta0.setBeneficiario("Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)");
        java.lang.Long long8 = conta0.getId();
        java.lang.Boolean boolean10 = conta0.debitar((double) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.example.Conta conta0 = new com.example.Conta();
        int int1 = conta0.getNumeroConta();
        java.lang.String str2 = conta0.toString();
        com.example.Banco banco3 = conta0.getBanco();
        char char5 = conta0.calculaDigitoVerificador((int) '8');
        char char7 = conta0.calculaDigitoVerificador((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Conta(id=null, beneficiario=null, banco=null, saldo=null, numeroConta=0, digitoVerificador=\000)" + "'", str2, "Conta(id=null, beneficiario=null, banco=null, saldo=null, numeroConta=0, digitoVerificador=\000)");
        org.junit.Assert.assertNull(banco3);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '5' + "'", char5 == '5');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        conta0.setSaldo((double) (-1));
        java.lang.Boolean boolean6 = conta0.debitar((double) (byte) -1);
        char char7 = conta0.getDigitoVerificador();
        char char9 = conta0.calculaDigitoVerificador((int) 'a');
        char char10 = conta0.getDigitoVerificador();
        java.lang.Double double11 = conta0.getSaldo();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '8' + "'", char9 == '8');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 1L, "hi!", banco2, (java.lang.Double) (-1.0d), 100, '4');
        java.lang.Long long7 = conta6.getId();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.example.Conta conta0 = new com.example.Conta();
        int int1 = conta0.getNumeroConta();
        java.lang.String str2 = conta0.toString();
        com.example.Banco banco3 = conta0.getBanco();
        int int4 = conta0.getNumeroConta();
        java.lang.String str5 = conta0.getBeneficiario();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Conta(id=null, beneficiario=null, banco=null, saldo=null, numeroConta=0, digitoVerificador=\000)" + "'", str2, "Conta(id=null, beneficiario=null, banco=null, saldo=null, numeroConta=0, digitoVerificador=\000)");
        org.junit.Assert.assertNull(banco3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        java.lang.String str4 = conta0.toString();
        java.lang.Double double5 = conta0.getSaldo();
        int int6 = conta0.getNumeroConta();
        char char7 = conta0.getDigitoVerificador();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)" + "'", str4, "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        char char5 = conta0.calculaDigitoVerificador((int) (short) -1);
        java.lang.String str6 = conta0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)" + "'", str6, "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.example.Conta conta0 = new com.example.Conta();
        char char1 = conta0.getDigitoVerificador();
        com.example.Banco banco2 = null;
        conta0.setBanco(banco2);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        boolean boolean5 = conta0.equals((java.lang.Object) '\000');
        java.lang.String str6 = conta0.toString();
        java.lang.Double double7 = conta0.getSaldo();
        com.example.Conta conta8 = new com.example.Conta();
        conta8.setSaldo((double) 10);
        java.lang.Class<?> wildcardClass11 = conta8.getClass();
        boolean boolean12 = conta0.canEqual((java.lang.Object) conta8);
        int int13 = conta0.getNumeroConta();
        conta0.setDigitoVerificador('#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)" + "'", str6, "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        java.lang.String str4 = conta0.toString();
        com.example.Banco banco5 = conta0.getBanco();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)" + "'", str4, "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)");
        org.junit.Assert.assertNull(banco5);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        conta0.setSaldo((double) (-1));
        java.lang.Boolean boolean6 = conta0.debitar((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        conta0.setSaldo((double) (-1));
        java.lang.Boolean boolean6 = conta0.debitar((double) (byte) -1);
        char char7 = conta0.getDigitoVerificador();
        com.example.Banco banco8 = null;
        conta0.setBanco(banco8);
        conta0.setSaldo((double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 0L, "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)", banco2, (java.lang.Double) 10.0d, 1, '8');
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        boolean boolean5 = conta0.equals((java.lang.Object) '\000');
        java.lang.String str6 = conta0.toString();
        java.lang.Double double7 = conta0.getSaldo();
        com.example.Conta conta8 = new com.example.Conta();
        conta8.setSaldo((double) 10);
        java.lang.Class<?> wildcardClass11 = conta8.getClass();
        boolean boolean12 = conta0.canEqual((java.lang.Object) conta8);
        int int13 = conta0.getNumeroConta();
        conta0.setId((java.lang.Long) 100L);
        com.example.Banco banco16 = conta0.getBanco();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)" + "'", str6, "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(banco16);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.example.Conta conta1 = new com.example.Conta((java.lang.Long) 0L);
        int int2 = conta1.getNumeroConta();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        conta0.setSaldo((double) (-1));
        java.lang.Boolean boolean6 = conta0.debitar((double) (byte) -1);
        char char7 = conta0.getDigitoVerificador();
        com.example.Banco banco8 = null;
        conta0.setBanco(banco8);
        conta0.setDigitoVerificador('\000');
        java.lang.Class<?> wildcardClass12 = conta0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        conta0.setBeneficiario("hi!");
        java.lang.Boolean boolean6 = conta0.debitar((double) '\000');
        com.example.Banco banco9 = null;
        com.example.Conta conta13 = new com.example.Conta((java.lang.Long) 1L, "Conta(id=null, beneficiario=null, banco=null, saldo=null, numeroConta=0, digitoVerificador=\000)", banco9, (java.lang.Double) (-1.0d), (int) '#', 'a');
        char char14 = conta13.getDigitoVerificador();
        boolean boolean15 = conta0.equals((java.lang.Object) char14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'a' + "'", char14 == 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        boolean boolean5 = conta0.equals((java.lang.Object) '\000');
        java.lang.String str6 = conta0.toString();
        java.lang.Double double7 = conta0.getSaldo();
        com.example.Conta conta8 = new com.example.Conta();
        conta8.setSaldo((double) 10);
        java.lang.Class<?> wildcardClass11 = conta8.getClass();
        boolean boolean12 = conta0.canEqual((java.lang.Object) conta8);
        int int13 = conta0.getNumeroConta();
        com.example.Conta conta14 = new com.example.Conta();
        conta14.setSaldo((double) 10);
        int int17 = conta14.getNumeroConta();
        boolean boolean18 = conta0.canEqual((java.lang.Object) int17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)" + "'", str6, "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        conta0.setSaldo((double) (-1));
        java.lang.Boolean boolean6 = conta0.debitar((double) (byte) -1);
        char char7 = conta0.getDigitoVerificador();
        com.example.Banco banco8 = null;
        conta0.setBanco(banco8);
        char char10 = conta0.getDigitoVerificador();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        java.lang.String str4 = conta0.toString();
        com.example.Conta conta5 = new com.example.Conta();
        conta5.setSaldo((double) 10);
        int int8 = conta5.getNumeroConta();
        boolean boolean10 = conta5.equals((java.lang.Object) '\000');
        java.lang.String str11 = conta5.toString();
        java.lang.Double double12 = conta5.getSaldo();
        boolean boolean13 = conta0.canEqual((java.lang.Object) conta5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)" + "'", str4, "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)" + "'", str11, "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.example.Conta conta0 = new com.example.Conta();
        char char1 = conta0.getDigitoVerificador();
        conta0.setDigitoVerificador(' ');
        com.example.Banco banco4 = null;
        conta0.setBanco(banco4);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }
}

