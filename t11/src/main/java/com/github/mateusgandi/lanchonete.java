package com.github.mateusgandi.poo.t11;

import java.util.ArrayList;
import java.util.List;

class Lanchonete{
    private Funcionario[] funcionarios;
    private int nFuncionarios=0;

    public void Lanchonete(){
        this.funcionarios[0] = new Funcionario(); // o funcionario 0 será gerente
        this.funcionarios[1] = new Funcionario();

        this.nFuncionarios += 2;
    }

    public void adicionarFuncionarios(){
        this.funcionarios[this.nFuncionarios] = new Funcionario();
        this.nFuncionarios++;
        }
}

class Funcionario{
    private boolean gerente;
    private String estabelecimento;
}