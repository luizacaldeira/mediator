package org.example;

public class Cliente {

    public String elogiarComercial(String mensagem) {
        return CentralAtendimento.getInstancia().receberElogioComercial(mensagem);
    }

    public String reclamarComercial(String mensagem) {
        return CentralAtendimento.getInstancia().receberReclamacaoComercial(mensagem);
    }

    public String sugerirComercial(String mensagem) {
        return CentralAtendimento.getInstancia().receberSugestaoComercial(mensagem);
    }

}