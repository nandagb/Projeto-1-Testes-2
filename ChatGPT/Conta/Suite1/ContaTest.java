package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    private Conta conta;

    @BeforeEach
    void setUp() {
        conta = new Conta(1L, "João", new Banco("Banco do Brasil"), 1000.0, 12345678, 'X');
    }

    @Test
    void testDefaultConstructor() {
        Conta novaConta = new Conta();
        assertNotNull(novaConta);
        assertEquals(0.0, novaConta.getSaldo());
    }

    @Test
    void testConstructorWithId() {
        Conta novaConta = new Conta(2L);
        assertNotNull(novaConta);
        assertEquals(0.0, novaConta.getSaldo());
        assertEquals(2L, novaConta.getId());
    }

    @Test
    void testGetSaldo() {
        assertEquals(1000.0, conta.getSaldo());
    }

    @Test
    void testSetSaldo() {
        conta.setSaldo(1500.0);
        assertEquals(1500.0, conta.getSaldo());
    }

    @Test
    void testDebitarSaldoSuficiente() {
        boolean debito = conta.debitar(500.0);
        assertTrue(debito);
        assertEquals(500.0, conta.getSaldo());
    }

    @Test
    void testDebitarSaldoInsuficiente() {
        boolean debito = conta.debitar(1500.0);
        assertFalse(debito);
        assertEquals(1000.0, conta.getSaldo());
    }

    @Test
    void testCreditar() {
        boolean credito = conta.creditar(300.0);
        assertTrue(credito);
        assertEquals(1300.0, conta.getSaldo());
    }

    @Test
    void testCalculaDigitoVerificador() {
        char digitoVerificador = conta.calculaDigitoVerificador(12345678);
        assertEquals('X', digitoVerificador); // Substitua 'X' pelo valor esperado para este número de conta
    }

    @Test
    void testEquals() {
        Conta outraConta = new Conta(1L, "João", new Banco("Banco do Brasil"), 1000.0, 12345678, 'X');
        assertEquals(conta, outraConta);
    }

    @Test
    void testNotEquals() {
        Conta outraConta = new Conta(2L, "Maria", new Banco("Caixa"), 500.0, 87654321, 'Y');
        assertNotEquals(conta, outraConta);
    }

    @Test
    void testHashCode() {
        Conta outraConta = new Conta(1L, "João", new Banco("Banco do Brasil"), 1000.0, 12345678, 'X');
        assertEquals(conta.hashCode(), outraConta.hashCode());
    }
}
