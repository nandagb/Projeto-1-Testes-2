package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BancoTest {

    private Banco banco;
    private Conta conta1;
    private Conta conta2;

    @BeforeEach
    public void setUp() {
        banco = new Banco("Banco Teste");
        conta1 = new Conta(1L);
        conta1.setSaldo(1000.0);
        conta2 = new Conta(2L);
        conta2.setSaldo(500.0);
    }

    @Test
    public void testBancoConstructorWithNome() {
        assertEquals("Banco Teste", banco.getNome());
        assertNotNull(banco.getContas());
        assertTrue(banco.getContas().isEmpty());
    }

    @Test
    public void testSetId() {
        banco.setId(1L);
        assertEquals(1L, banco.getId());
    }

    @Test
    public void testGetId() {
        banco.setId(2L);
        assertEquals(2L, banco.getId());
    }

    @Test
    public void testAddConta() {
        banco.addConta(conta1);
        assertEquals(1, banco.getContas().size());
        assertTrue(banco.getContas().contains(conta1));
    }

    @Test
    public void testAddContaById() {
        banco.addContaById(3L);
        assertEquals(1, banco.getContas().size());
        assertEquals(3L, banco.getContas().get(0).getId());
    }

    @Test
    public void testTransferenciaSuccess() {
        banco.addConta(conta1);
        banco.addConta(conta2);
        boolean result = banco.transferencia(conta1, conta2, 200.0);
        
        assertTrue(result);
        assertEquals(800.0, conta1.getSaldo());
        assertEquals(700.0, conta2.getSaldo());
    }

    @Test
    public void testTransferenciaInsufficientFunds() {
        banco.addConta(conta1);
        banco.addConta(conta2);
        boolean result = banco.transferencia(conta1, conta2, 2000.0);

        assertFalse(result);
        assertEquals(1000.0, conta1.getSaldo());
        assertEquals(500.0, conta2.getSaldo());
    }

    @Test
    public void testEqualsAndHashCode() {
        Banco banco1 = new Banco("Banco A");
        banco1.setId(1L);

        Banco banco2 = new Banco("Banco A");
        banco2.setId(1L);

        assertEquals(banco1, banco2);
        assertEquals(banco1.hashCode(), banco2.hashCode());
    }
}
