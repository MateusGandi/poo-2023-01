package com.github.mateusgandi.poo.t17;

public class PessoaParticipanteDeComite {
    private Comite comiteQueParticipa;
    private Boolean apenasMembro = true;
    private Boolean presidente = false;

    public PessoaParticipanteDeComite(Comite comiteQueParticipa) {
        this.comiteQueParticipa = comiteQueParticipa;
        this.adicionarNoComite();
    }

    private void adicionarNoComite() {
        this.comiteQueParticipa.adicionarMembro(this);
    }

    public void tornarPresidente() {
        this.presidente = true;
        this.apenasMembro = false;
    }

    public Boolean retornarSituacao(){
        return this.presidente;
    }
}
