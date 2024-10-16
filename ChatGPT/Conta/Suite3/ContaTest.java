package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContaTest {

    private Conta conta;
    private Conta contaComId;

    @BeforeEach
    public void setUp() {
        conta = new Conta();
        contaComId = new Conta(1L);
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(conta);
        assertEquals(0.0, conta.getSaldo());
    }

    @Test
    public void testConstructorWithId() {
        assertNotNull(contaComId);
        assertEquals(1L, contaComId.getId());
        assertEquals(0.0, contaComId.getSaldo());
    }

    @Test
    public void testGetAndSetSaldo() {
        conta.setSaldo(100.0);
        assertEquals(100.0, conta.getSaldo());
    }

    @Test
    public void testDebitarSaldoSuficiente() {
        conta.setSaldo(200.0);
        assertTrue(conta.debitar(100.0));
        assertEquals(100.0, conta.getSaldo());
    }

    @Test
    public void testDebitarSaldoInsuficiente() {
        conta.setSaldo(50.0);
        assertFalse(conta.debitar(100.0));
        assertEquals(50.0, conta.getSaldo());
    }

    @Test
    public void testCreditar() {
        conta.setSaldo(100.0);
        assertTrue(conta.creditar(50.0));
        assertEquals(150.0, conta.getSaldo());
    }

    @Test
    public void testCalculaDigitoVerificadorComRestoMenorQueDez() {
        char digito = conta.calculaDigitoVerificador(12345678);
        assertEquals('6', digito); // Substitua pelo valor esperado para o número 12345678
    }

    @Test
    public void testCalculaDigitoVerificadorComRestoMaiorOuIgualADez() {
        char digito = conta.calculaDigitoVerificador(98765432);
        assertEquals('X', digito); // Substitua pelo valor esperado para o número 98765432
    }

    @Test
    public void testEqualsAndHashCode() {
        Conta conta1 = new Conta(1L, "Beneficiario1", new Banco(), 100.0, 12345, 'A');
        Conta conta2 = new Conta(1L, "Beneficiario1", new Banco(), 100.0, 12345, 'A');
        assertEquals(conta1, conta2);
        assertEquals(conta1.hashCode(), conta2.hashCode());
    }
}
