package com.github.mateusgandi.poo.t17;

import java.util.ArrayList;

import com.github.mateusgandi.poo.t17.PessoaParticipanteDeComite;

public class Comite {
    private ArrayList<PessoaParticipanteDeComite> membros;
    private ArrayList<PessoaParticipanteDeComite> presidentes;

    public void adicionarMembro(PessoaParticipanteDeComite novaPessoa){
        if(novaPesssoa.retornarSituacao() == true){
            this.presidentes.add(novaPessoa);
        } else {
            this.membros.add(novaPessoa);
        }
    }
}
