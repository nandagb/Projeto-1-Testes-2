package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BancoTest {

    private Banco banco;
    private Conta conta1;
    private Conta conta2;

    @BeforeEach
    public void setUp() {
        banco = new Banco("Banco Teste");
        conta1 = new Conta(1L);
        conta2 = new Conta(2L);
    }

    @Test
    public void testSetId() {
        banco.setId(100L);
        assertEquals(100L, banco.getId());
    }

    @Test
    public void testGetId() {
        banco.setId(200L);
        assertEquals(200L, banco.getId());
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
        List<Conta> contas = banco.getContas();
        assertEquals(1, contas.size());
        assertEquals(3L, contas.get(0).getId());
    }

    @Test
    public void testTransferencia() {
        banco.addConta(conta1);
        banco.addConta(conta2);

        conta1.creditar(500.0);
        assertTrue(banco.transferencia(conta1, conta2, 200.0));
        assertEquals(300.0, conta1.getSaldo());
        assertEquals(200.0, conta2.getSaldo());

        assertFalse(banco.transferencia(conta1, conta2, 500.0));
        assertEquals(300.0, conta1.getSaldo());
        assertEquals(200.0, conta2.getSaldo());
    }

    @Test
    public void testConstructorWithNome() {
        Banco bancoComNome = new Banco("Banco Novo");
        assertEquals("Banco Novo", bancoComNome.getNome());
        assertNotNull(bancoComNome.getContas());
    }
}
