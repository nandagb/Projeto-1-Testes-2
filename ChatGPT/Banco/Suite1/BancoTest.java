package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

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
    public void testConstructorWithNome() {
        Banco novoBanco = new Banco("Banco Novo");
        assertEquals("Banco Novo", novoBanco.getNome());
        assertNotNull(novoBanco.getContas());
        assertTrue(novoBanco.getContas().isEmpty());
    }

    @Test
    public void testSetId() {
        banco.setId(100L);
        assertEquals(100L, banco.getId());
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
        conta1.creditar(200.0); // Adiciona saldo suficiente para transferência
        boolean result = banco.transferencia(conta1, conta2, 100.0);

        assertTrue(result);
        assertEquals(100.0, conta1.getSaldo());
        assertEquals(100.0, conta2.getSaldo());
    }

    @Test
    public void testTransferenciaFailure() {
        conta1.creditar(50.0); // Saldo insuficiente para transferência
        boolean result = banco.transferencia(conta1, conta2, 100.0);

        assertFalse(result);
        assertEquals(50.0, conta1.getSaldo());
        assertEquals(0.0, conta2.getSaldo());
    }
}
