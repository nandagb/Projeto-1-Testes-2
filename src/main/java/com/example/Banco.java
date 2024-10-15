package com.example;

import java.util.*;

import com.example.Banco;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Banco {

    private Long id;

    private String nome;

    private List<Conta> contas;

    public Banco(String nome){
        this.contas = new ArrayList<>();
        this.nome = nome;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void addConta(Conta conta){
        this.contas.add(conta);
    }

    public void addContaById(Long id){
        Conta conta = new Conta(id);
        this.contas.add(conta);
    }

    public Boolean transferencia(Conta origem, Conta destino, Double valor){
        if(origem.debitar(valor)){
            return destino.creditar(valor);
        }
        return false;
    }
}
