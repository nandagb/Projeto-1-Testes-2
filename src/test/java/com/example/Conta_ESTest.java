/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 13 20:27:30 GMT 2024
 */

package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.Banco;
import com.example.Conta;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Conta_ESTest extends Conta_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Long long0 = new Long((-20L));
      Banco banco0 = new Banco((String) null);
      Double double0 = new Double((-20L));
      Conta conta0 = new Conta(long0, "com.example.Conta", banco0, double0, (-3248), '1');
      Boolean boolean0 = conta0.debitar((-20L));
      assertEquals((-3248), conta0.getNumeroConta());
      assertEquals((-20.0), conta0.getSaldo(), 0.01);
      assertTrue(boolean0);
      assertEquals('1', conta0.getDigitoVerificador());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Conta conta0 = new Conta();
      conta0.setDigitoVerificador('&');
      Conta conta1 = new Conta();
      boolean boolean0 = conta0.equals(conta1);
      assertEquals('&', conta0.getDigitoVerificador());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Long long0 = new Long(0L);
      Conta conta0 = new Conta(long0);
      Double double0 = new Double(0L);
      Conta conta1 = new Conta(long0, ", digitoVerificador=", (Banco) null, double0, (-1864), '(');
      boolean boolean0 = conta0.equals(conta1);
      assertEquals((-1864), conta1.getNumeroConta());
      assertEquals('(', conta1.getDigitoVerificador());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Conta conta0 = new Conta();
      conta0.setSaldo(0);
      Double double0 = conta0.getSaldo();
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Conta conta0 = new Conta();
      conta0.setSaldo((-1.0));
      Double double0 = conta0.getSaldo();
      assertEquals((-1.0), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Long long0 = new Long(0L);
      Banco banco0 = new Banco(", nome=");
      Double double0 = new Double((-1139.0));
      Conta conta0 = new Conta(long0, ", nome=", banco0, double0, 88, '#');
      int int0 = conta0.getNumeroConta();
      assertEquals(88, int0);
      assertEquals('#', conta0.getDigitoVerificador());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Long long0 = new Long((-20L));
      Banco banco0 = new Banco((String) null);
      Double double0 = new Double((-20L));
      Conta conta0 = new Conta(long0, "com.example.Conta", banco0, double0, (-3248), '1');
      int int0 = conta0.getNumeroConta();
      assertEquals('1', conta0.getDigitoVerificador());
      assertEquals((-3248), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Long long0 = new Long(1L);
      Banco banco0 = new Banco("");
      Double double0 = new Double(1592.017661);
      Conta conta0 = new Conta(long0, "", banco0, double0, (-2041), '?');
      conta0.getId();
      assertEquals('?', conta0.getDigitoVerificador());
      assertEquals((-2041), conta0.getNumeroConta());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Long long0 = new Long(0L);
      Conta conta0 = new Conta(long0);
      Long long1 = conta0.getId();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Long long0 = new Long((-3526L));
      Conta conta0 = new Conta(long0);
      Long long1 = conta0.getId();
      assertEquals((-3526L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Long long0 = new Long((-1L));
      Conta conta0 = new Conta(long0);
      Long long1 = conta0.getId();
      assertEquals((-1L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Conta conta0 = new Conta();
      conta0.setDigitoVerificador('l');
      char char0 = conta0.getDigitoVerificador();
      assertEquals('l', char0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Conta conta0 = new Conta();
      conta0.setBeneficiario("com.example.Conta");
      String string0 = conta0.getBeneficiario();
      assertEquals("com.example.Conta", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Long long0 = new Long(1L);
      Banco banco0 = new Banco("");
      Double double0 = new Double(1592.017661);
      Conta conta0 = new Conta(long0, "", banco0, double0, (-2041), '?');
      conta0.getBeneficiario();
      assertEquals((-2041), conta0.getNumeroConta());
      assertEquals('?', conta0.getDigitoVerificador());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Banco banco0 = new Banco();
      Double double0 = new Double(1936.5973719);
      Conta conta0 = new Conta((Long) null, ">V~#*uXU", banco0, double0, (-1469), 'u');
      conta0.getBanco();
      assertEquals((-1469), conta0.getNumeroConta());
      assertEquals('u', conta0.getDigitoVerificador());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Conta conta0 = new Conta();
      conta0.setSaldo(5143.0);
      conta0.creditar(2322.0146);
      assertEquals(7465.0146, conta0.getSaldo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Conta conta0 = new Conta();
      boolean boolean0 = conta0.canEqual(conta0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Conta conta0 = new Conta();
      Object object0 = new Object();
      boolean boolean0 = conta0.canEqual(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Long long0 = new Long((-1L));
      Conta conta0 = new Conta(long0);
      char char0 = conta0.calculaDigitoVerificador((-1));
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Conta conta0 = new Conta();
      // Undeclared exception!
      try { 
        conta0.debitar((-96));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.Conta", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Conta conta0 = new Conta();
      // Undeclared exception!
      try { 
        conta0.calculaDigitoVerificador((-2142548091));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("com.example.Conta", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Conta conta0 = new Conta();
      conta0.setSaldo((-3151.511));
      Boolean boolean0 = conta0.debitar((-1.0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Conta conta0 = new Conta();
      String string0 = conta0.getBeneficiario();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Conta conta0 = new Conta();
      Banco banco0 = conta0.getBanco();
      assertNull(banco0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Conta conta0 = new Conta();
      Long long0 = conta0.getId();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Conta conta0 = new Conta();
      char char0 = conta0.getDigitoVerificador();
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Conta conta0 = new Conta();
      int int0 = conta0.getNumeroConta();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Conta conta0 = new Conta();
      char char0 = conta0.calculaDigitoVerificador(683);
      assertEquals('X', char0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Conta conta0 = new Conta();
      char char0 = conta0.calculaDigitoVerificador(0);
      assertEquals('0', char0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Long long0 = new Long(0L);
      Banco banco0 = new Banco();
      Double double0 = new Double(0L);
      Conta conta0 = new Conta(long0, "CU~dpq$ZFU6RuO7WH3", banco0, double0, (-439), 'k');
      conta0.debitar((-439));
      Boolean boolean0 = banco0.transferencia(conta0, conta0, double0);
      assertEquals((-439.0), conta0.getSaldo(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Long long0 = Long.getLong("LYQ[|");
      Conta conta0 = new Conta(long0);
      Banco banco0 = new Banco();
      conta0.setBanco(banco0);
      Conta conta1 = new Conta(long0);
      boolean boolean0 = conta0.equals(conta1);
      assertFalse(boolean0);
      assertEquals(0, conta1.getNumeroConta());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Conta conta0 = new Conta();
      Banco banco0 = new Banco();
      conta0.setDigitoVerificador('0');
      conta0.setBanco(banco0);
      Double double0 = conta0.getSaldo();
      conta0.setBeneficiario("Conta(id=null, beneficiario=null, banco=null, saldo=1341.813032, numeroConta=0, digitoVerificador=0)");
      Conta conta1 = new Conta((Long) null, "Conta(id=null, beneficiario=null, banco=null, saldo=1341.813032, numeroConta=0, digitoVerificador=0)", banco0, double0, 0, '0');
      boolean boolean0 = conta0.equals(conta1);
      assertEquals('0', conta0.getDigitoVerificador());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Conta conta0 = new Conta();
      Banco banco0 = new Banco();
      conta0.setDigitoVerificador('&');
      Double double0 = conta0.getSaldo();
      conta0.setBeneficiario("");
      Conta conta1 = new Conta((Long) null, (String) null, banco0, double0, 0, '&');
      boolean boolean0 = conta0.equals(conta1);
      assertEquals('&', conta0.getDigitoVerificador());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Conta conta0 = new Conta();
      Banco banco0 = new Banco();
      conta0.setDigitoVerificador('0');
      Double double0 = conta0.getSaldo();
      conta0.setBeneficiario("Conta(id=null, beneficiario=null, banco=null, saldo=1341.813032, numeroConta=0, digitoVerificador=0)");
      Conta conta1 = new Conta((Long) null, "Conta(id=null, beneficiario=null, banco=null, saldo=1341.813032, numeroConta=0, digitoVerificador=0)", banco0, double0, 0, '0');
      boolean boolean0 = conta0.equals(conta1);
      assertEquals('0', conta0.getDigitoVerificador());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Conta conta0 = new Conta();
      Conta conta1 = new Conta((Long) null);
      assertTrue(conta1.equals((Object)conta0));
      
      conta1.setSaldo((-1.0));
      boolean boolean0 = conta0.equals(conta1);
      assertFalse(conta1.equals((Object)conta0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Long long0 = new Long((-1L));
      Conta conta0 = new Conta(long0);
      Conta conta1 = new Conta(long0);
      boolean boolean0 = conta0.equals(conta1);
      assertEquals(0, conta1.getNumeroConta());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Long long0 = Long.getLong("LYQ[|", (long) (-15));
      Conta conta0 = new Conta();
      Conta conta1 = new Conta(long0);
      boolean boolean0 = conta0.equals(conta1);
      assertFalse(boolean0);
      assertEquals(0, conta1.getNumeroConta());
      assertFalse(conta1.equals((Object)conta0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Long long0 = new Long((-1L));
      Conta conta0 = new Conta(long0);
      Conta conta1 = new Conta();
      boolean boolean0 = conta0.equals(conta1);
      assertEquals(0, conta1.getNumeroConta());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Conta conta0 = new Conta();
      Banco banco0 = new Banco();
      conta0.setDigitoVerificador('0');
      Double double0 = conta0.getSaldo();
      Conta conta1 = new Conta((Long) null, "Conta(id=null, beneficiario=null, banco=null, saldo=1341.813032, numeroConta=0, digitoVerificador=0)", banco0, double0, 0, '0');
      boolean boolean0 = conta0.equals(conta1);
      assertEquals('0', conta0.getDigitoVerificador());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Long long0 = new Long(0L);
      Banco banco0 = new Banco();
      Double double0 = new Double(0L);
      Conta conta0 = new Conta(long0, "CU~dpq$ZFU6RuO7WH3", banco0, double0, (-439), 'k');
      Conta conta1 = new Conta((Long) null);
      boolean boolean0 = conta0.equals(conta1);
      assertEquals('k', conta0.getDigitoVerificador());
      assertFalse(boolean0);
      assertEquals((-439), conta0.getNumeroConta());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Long long0 = new Long(0L);
      Banco banco0 = new Banco();
      Double double0 = new Double(0L);
      Conta conta0 = new Conta(long0, "CU~dpq$ZFU6RuO7WH3", banco0, double0, (-439), 'k');
      boolean boolean0 = conta0.equals(banco0);
      assertEquals('k', conta0.getDigitoVerificador());
      assertFalse(boolean0);
      assertEquals((-439), conta0.getNumeroConta());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Conta conta0 = new Conta();
      boolean boolean0 = conta0.equals(conta0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Conta conta0 = new Conta((Long) null);
      conta0.hashCode();
      assertEquals(0, conta0.getNumeroConta());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Long long0 = new Long(0L);
      Banco banco0 = new Banco();
      Double double0 = new Double(0L);
      Conta conta0 = new Conta(long0, "CU~dpq$ZFU6RuO7WH3", banco0, double0, (-439), 'k');
      conta0.hashCode();
      assertEquals('k', conta0.getDigitoVerificador());
      assertEquals((-439), conta0.getNumeroConta());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Conta conta0 = new Conta();
      // Undeclared exception!
      try { 
        conta0.creditar(0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.Conta", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Conta conta0 = new Conta();
      conta0.setSaldo(1341.813032);
      Banco banco0 = new Banco();
      conta0.setDigitoVerificador('0');
      Double double0 = conta0.getSaldo();
      Conta conta1 = new Conta((Long) null, "Conta(id=null, beneficiario=null, banco=null, saldo=1341.813032, numeroConta=0, digitoVerificador=0)", banco0, double0, 0, '0');
      boolean boolean0 = conta0.equals(conta1);
      assertEquals('0', conta0.getDigitoVerificador());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Long long0 = new Long((-52L));
      Conta conta0 = new Conta(long0);
      conta0.setId((Long) null);
      conta0.setSaldo(2666L);
      Conta conta1 = new Conta();
      boolean boolean0 = conta0.equals(conta1);
      assertEquals(2666.0, conta0.getSaldo(), 0.01);
      assertEquals(0, conta1.getNumeroConta());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Long long0 = new Long(0L);
      Banco banco0 = new Banco();
      Double double0 = new Double(0L);
      Conta conta0 = new Conta(long0, "CU~dpq$ZFU6RuO7WH3", banco0, double0, (-439), 'k');
      conta0.setNumeroConta((-439));
      assertEquals((-439), conta0.getNumeroConta());
      assertEquals('k', conta0.getDigitoVerificador());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Conta conta0 = new Conta();
      Banco banco0 = new Banco();
      Double double0 = conta0.getSaldo();
      Conta conta1 = new Conta((Long) null, "Conta(id=null, beneficiario=null, banco=null, saldo=1341.813032, numeroConta=0, digitoVerificador=0)", banco0, double0, 0, '0');
      boolean boolean0 = conta0.equals(conta1);
      assertFalse(boolean0);
      assertEquals(0, conta1.getNumeroConta());
      assertEquals('0', conta1.getDigitoVerificador());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Conta conta0 = new Conta();
      conta0.setDigitoVerificador('0');
      char char0 = conta0.getDigitoVerificador();
      assertEquals('0', char0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Conta conta0 = new Conta();
      String string0 = conta0.toString();
      assertEquals("Conta(id=null, beneficiario=null, banco=null, saldo=null, numeroConta=0, digitoVerificador=\u0000)", string0);
  }
}
