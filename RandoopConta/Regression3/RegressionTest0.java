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
        com.example.Conta conta0 = new com.example.Conta();
        java.lang.Class<?> wildcardClass1 = conta0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        java.lang.Class<?> wildcardClass3 = conta0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.example.Conta conta0 = new com.example.Conta();
        char char1 = conta0.getDigitoVerificador();
        conta0.setDigitoVerificador(' ');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.example.Conta conta0 = new com.example.Conta();
        int int1 = conta0.getNumeroConta();
        java.lang.String str2 = conta0.toString();
        com.example.Banco banco3 = conta0.getBanco();
        char char4 = conta0.getDigitoVerificador();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Conta(id=null, beneficiario=null, banco=null, saldo=0.0, numeroConta=0, digitoVerificador=\000)" + "'", str2, "Conta(id=null, beneficiario=null, banco=null, saldo=0.0, numeroConta=0, digitoVerificador=\000)");
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
        com.example.Conta conta0 = new com.example.Conta();
        boolean boolean2 = conta0.equals((java.lang.Object) 100.0f);
        int int3 = conta0.getNumeroConta();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.example.Conta conta0 = new com.example.Conta();
        int int1 = conta0.getNumeroConta();
        conta0.setId((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass4 = conta0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.example.Conta conta0 = new com.example.Conta();
        int int1 = conta0.getNumeroConta();
        java.lang.Class<?> wildcardClass2 = conta0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.example.Conta conta0 = new com.example.Conta();
        boolean boolean2 = conta0.equals((java.lang.Object) (-1.0d));
        java.lang.Boolean boolean4 = conta0.debitar((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 1L, "Conta(id=null, beneficiario=null, banco=null, saldo=0.0, numeroConta=0, digitoVerificador=\000)", banco2, (java.lang.Double) (-1.0d), (int) '#', 'a');
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        com.example.Banco banco3 = null;
        conta0.setBanco(banco3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        char char5 = conta0.calculaDigitoVerificador((int) 'a');
        boolean boolean7 = conta0.canEqual((java.lang.Object) (-1.0d));
        char char9 = conta0.calculaDigitoVerificador((int) '8');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '8' + "'", char5 == '8');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '5' + "'", char9 == '5');
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        conta0.setBeneficiario("hi!");
        int int5 = conta0.getNumeroConta();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        conta0.setSaldo((double) (-1));
        java.lang.Boolean boolean6 = conta0.debitar((double) (byte) -1);
        char char7 = conta0.getDigitoVerificador();
        char char8 = conta0.getDigitoVerificador();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.example.Conta conta0 = new com.example.Conta();
        boolean boolean2 = conta0.equals((java.lang.Object) (-1.0d));
        char char4 = conta0.calculaDigitoVerificador((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        conta0.setDigitoVerificador('\000');
        com.example.Banco banco6 = null;
        conta0.setBanco(banco6);
        conta0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 1L, "hi!", banco2, (java.lang.Double) (-1.0d), 100, '4');
        com.example.Banco banco9 = null;
        com.example.Conta conta13 = new com.example.Conta((java.lang.Long) 1L, "hi!", banco9, (java.lang.Double) (-1.0d), 100, '4');
        boolean boolean15 = conta13.equals((java.lang.Object) (short) -1);
        int int16 = conta13.getNumeroConta();
        boolean boolean17 = conta6.canEqual((java.lang.Object) conta13);
        java.lang.Boolean boolean19 = conta13.creditar((double) ' ');
        conta13.setDigitoVerificador('\000');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 1L, "hi!", banco2, (java.lang.Double) (-1.0d), 100, '4');
        char char7 = conta6.getDigitoVerificador();
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '4' + "'", char7 == '4');
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.example.Conta conta0 = new com.example.Conta();
        int int1 = conta0.getNumeroConta();
        java.lang.String str2 = conta0.toString();
        com.example.Banco banco3 = conta0.getBanco();
        int int4 = conta0.getNumeroConta();
        conta0.setSaldo((double) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Conta(id=null, beneficiario=null, banco=null, saldo=0.0, numeroConta=0, digitoVerificador=\000)" + "'", str2, "Conta(id=null, beneficiario=null, banco=null, saldo=0.0, numeroConta=0, digitoVerificador=\000)");
        org.junit.Assert.assertNull(banco3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 1L, "hi!", banco2, (java.lang.Double) (-1.0d), 100, '4');
        java.lang.Boolean boolean8 = conta6.debitar((double) 1L);
        java.lang.Boolean boolean10 = conta6.debitar((double) '\000');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        conta0.setDigitoVerificador('\000');
        conta0.setSaldo((double) (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 1L, "hi!", banco2, (java.lang.Double) (-1.0d), 100, '4');
        java.lang.Boolean boolean8 = conta6.debitar((double) 1L);
        char char9 = conta6.getDigitoVerificador();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        conta0.setSaldo((double) (-1));
        com.example.Banco banco5 = conta0.getBanco();
        org.junit.Assert.assertNull(banco5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 1L, "hi!", banco2, (java.lang.Double) (-1.0d), 100, '4');
        java.lang.Boolean boolean8 = conta6.creditar(0.0d);
        conta6.setDigitoVerificador('a');
        boolean boolean12 = conta6.canEqual((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        char char3 = conta0.getDigitoVerificador();
        boolean boolean5 = conta0.equals((java.lang.Object) '5');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.example.Conta conta1 = new com.example.Conta((java.lang.Long) 1L);
        com.example.Banco banco2 = null;
        conta1.setBanco(banco2);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 1L, "hi!", banco2, (java.lang.Double) (-1.0d), 100, '4');
        com.example.Banco banco9 = null;
        com.example.Conta conta13 = new com.example.Conta((java.lang.Long) 1L, "hi!", banco9, (java.lang.Double) (-1.0d), 100, '4');
        boolean boolean15 = conta13.equals((java.lang.Object) (short) -1);
        int int16 = conta13.getNumeroConta();
        boolean boolean17 = conta6.canEqual((java.lang.Object) conta13);
        int int18 = conta6.getNumeroConta();
        java.lang.String str19 = conta6.toString();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Conta(id=1, beneficiario=hi!, banco=null, saldo=-1.0, numeroConta=100, digitoVerificador=4)" + "'", str19, "Conta(id=1, beneficiario=hi!, banco=null, saldo=-1.0, numeroConta=100, digitoVerificador=4)");
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
        java.lang.Long long8 = conta0.getId();
        java.lang.Boolean boolean10 = conta0.debitar((-1.0d));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 1L, "hi!", banco2, (java.lang.Double) (-1.0d), 100, '4');
        com.example.Banco banco9 = null;
        com.example.Conta conta13 = new com.example.Conta((java.lang.Long) 1L, "hi!", banco9, (java.lang.Double) (-1.0d), 100, '4');
        boolean boolean15 = conta13.equals((java.lang.Object) (short) -1);
        int int16 = conta13.getNumeroConta();
        boolean boolean17 = conta6.canEqual((java.lang.Object) conta13);
        char char19 = conta6.calculaDigitoVerificador((int) '#');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '8' + "'", char19 == '8');
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.example.Conta conta0 = new com.example.Conta();
        char char1 = conta0.getDigitoVerificador();
        java.lang.Double double2 = conta0.getSaldo();
        java.lang.Boolean boolean4 = conta0.creditar(1.0d);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.example.Conta conta0 = new com.example.Conta();
        boolean boolean2 = conta0.equals((java.lang.Object) (-1.0d));
        java.lang.String str3 = conta0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Conta(id=null, beneficiario=null, banco=null, saldo=0.0, numeroConta=0, digitoVerificador=\000)" + "'", str3, "Conta(id=null, beneficiario=null, banco=null, saldo=0.0, numeroConta=0, digitoVerificador=\000)");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.example.Conta conta0 = new com.example.Conta();
        com.example.Banco banco1 = null;
        conta0.setBanco(banco1);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        char char5 = conta0.calculaDigitoVerificador((int) 'a');
        conta0.setId((java.lang.Long) 1L);
        java.lang.Long long8 = conta0.getId();
        com.example.Banco banco9 = conta0.getBanco();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '8' + "'", char5 == '8');
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(banco9);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.example.Conta conta0 = new com.example.Conta();
        int int1 = conta0.getNumeroConta();
        java.lang.String str2 = conta0.toString();
        com.example.Banco banco3 = conta0.getBanco();
        conta0.setSaldo(100.0d);
        java.lang.Boolean boolean7 = conta0.creditar((double) (byte) 10);
        conta0.setDigitoVerificador('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Conta(id=null, beneficiario=null, banco=null, saldo=0.0, numeroConta=0, digitoVerificador=\000)" + "'", str2, "Conta(id=null, beneficiario=null, banco=null, saldo=0.0, numeroConta=0, digitoVerificador=\000)");
        org.junit.Assert.assertNull(banco3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        conta0.setSaldo((double) (-1));
        conta0.setSaldo((double) (byte) 100);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 0L, "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)", banco2, (java.lang.Double) 10.0d, (int) (byte) 10, ' ');
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.example.Conta conta1 = new com.example.Conta((java.lang.Long) 0L);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        boolean boolean5 = conta0.equals((java.lang.Object) '\000');
        conta0.setBeneficiario("Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)");
        int int8 = conta0.getNumeroConta();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 0L, "", banco2, (java.lang.Double) 0.0d, 0, 'a');
        java.lang.Class<?> wildcardClass7 = conta6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 1L, "hi!", banco2, (java.lang.Double) (-1.0d), 100, '4');
        java.lang.Boolean boolean8 = conta6.debitar((double) 1L);
        com.example.Conta conta9 = new com.example.Conta();
        conta9.setSaldo((double) 10);
        char char12 = conta9.getDigitoVerificador();
        com.example.Banco banco13 = conta9.getBanco();
        boolean boolean14 = conta6.canEqual((java.lang.Object) banco13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertNull(banco13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.example.Conta conta0 = new com.example.Conta();
        char char1 = conta0.getDigitoVerificador();
        java.lang.Double double2 = conta0.getSaldo();
        char char3 = conta0.getDigitoVerificador();
        java.lang.Class<?> wildcardClass4 = conta0.getClass();
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 0L, "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)", banco2, (java.lang.Double) 10.0d, (-1), 'a');
        char char7 = conta6.getDigitoVerificador();
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        conta0.setBeneficiario("hi!");
        java.lang.Boolean boolean6 = conta0.debitar((double) 'a');
        com.example.Conta conta7 = new com.example.Conta();
        conta7.setSaldo((double) 10);
        int int10 = conta7.getNumeroConta();
        boolean boolean12 = conta7.equals((java.lang.Object) '\000');
        java.lang.String str13 = conta7.toString();
        java.lang.Double double14 = conta7.getSaldo();
        boolean boolean15 = conta0.canEqual((java.lang.Object) conta7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)" + "'", str13, "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.example.Conta conta0 = new com.example.Conta();
        char char1 = conta0.getDigitoVerificador();
        java.lang.Double double2 = conta0.getSaldo();
        com.example.Banco banco3 = null;
        conta0.setBanco(banco3);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.example.Conta conta0 = new com.example.Conta();
        int int1 = conta0.getNumeroConta();
        conta0.setId((java.lang.Long) 1L);
        char char4 = conta0.getDigitoVerificador();
        java.lang.Boolean boolean6 = conta0.debitar((double) 10);
        com.example.Conta conta7 = new com.example.Conta();
        conta7.setSaldo((double) 10);
        conta7.setSaldo((double) (-1));
        java.lang.Boolean boolean13 = conta7.debitar((double) (byte) -1);
        boolean boolean14 = conta0.equals((java.lang.Object) (byte) -1);
        int int15 = conta0.getNumeroConta();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.example.Banco banco2 = null;
        com.example.Conta conta6 = new com.example.Conta((java.lang.Long) 10L, "Conta(id=1, beneficiario=hi!, banco=null, saldo=-1.0, numeroConta=100, digitoVerificador=4)", banco2, (java.lang.Double) (-1.0d), 0, '\000');
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.example.Conta conta0 = new com.example.Conta();
        conta0.setSaldo((double) 10);
        int int3 = conta0.getNumeroConta();
        java.lang.String str4 = conta0.toString();
        conta0.setId((java.lang.Long) 10L);
        com.example.Banco banco7 = null;
        conta0.setBanco(banco7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)" + "'", str4, "Conta(id=null, beneficiario=null, banco=null, saldo=10.0, numeroConta=0, digitoVerificador=\000)");
    }
}

