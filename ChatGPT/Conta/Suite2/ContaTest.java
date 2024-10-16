package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContaTest {

    private Conta conta;

    @BeforeEach
    public void setUp() {
        conta = new Conta();
    }

    @Test
    public void testDefaultConstructor() {
        Conta contaDefault = new Conta();
        assertEquals(0.0, contaDefault.getSaldo());
        assertNull(contaDefault.getId());
    }

    @Test
    public void testConstructorWithId() {
        Long id = 1L;
        Conta contaWithId = new Conta(id);
        assertEquals(0.0, contaWithId.getSaldo());
        assertEquals(id, contaWithId.getId());
    }

    @Test
    public void testGetSaldo() {
        assertEquals(0.0, conta.getSaldo());
    }

    @Test
    public void testSetSaldo() {
        conta.setSaldo(100.0);
        assertEquals(100.0, conta.getSaldo());
    }

    @Test
    public void testDebitarSuccess() {
        conta.setSaldo(100.0);
        assertTrue(conta.debitar(50.0));
        assertEquals(50.0, conta.getSaldo());
    }

    @Test
    public void testDebitarFailure() {
        conta.setSaldo(100.0);
        assertFalse(conta.debitar(150.0));
        assertEquals(100.0, conta.getSaldo());
    }

    @Test
    public void testCreditar() {
        conta.setSaldo(100.0);
        assertTrue(conta.creditar(50.0));
        assertEquals(150.0, conta.getSaldo());
    }

    @Test
    public void testCalculaDigitoVerificador() {
        assertEquals('0', conta.calculaDigitoVerificador(12345678));
        assertEquals('X', conta.calculaDigitoVerificador(1234567)); // ajuste os valores conforme a lógica da sua implementação
    }

    @Test
    public void testAllArgsConstructor() {
        Banco banco = new Banco(); // Supondo que Banco tenha um construtor padrão
        Conta contaFull = new Conta(1L, "Beneficiario", banco, 200.0, 12345678, '5');
        assertEquals(1L, contaFull.getId());
        assertEquals("Beneficiario", contaFull.getBeneficiario());
        assertEquals(banco, contaFull.getBanco());
        assertEquals(200.0, contaFull.getSaldo());
        assertEquals(12345678, contaFull.getNumeroConta());
        assertEquals('5', contaFull.getDigitoVerificador());
    }
}
