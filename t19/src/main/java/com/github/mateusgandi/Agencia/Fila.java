package com.github.mateusgandi.poo.t19;

import java.util.ArrayList;

public class Fila {
    private ArrayList<Cliente> clientes;

    public void adicionarCliente(){
        this.clientes.add(new Cliente("cliente"));
    }

    public void acharCliente(int identificacao){
        System.out.println(this.clientes.get(identificacao).getNome());
    }
    
}
