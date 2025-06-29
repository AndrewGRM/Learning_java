package com.banco.services;

import com.banco.models.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    public String nome;
    private List<Conta> contas = new ArrayList<>();

    public void inserir(Conta c) {
        contas.add(c);
    }

    public boolean remover(Conta c) {
        return contas.remove(c);
    }

    // public Conta procurarConta(int numero) {}


}
