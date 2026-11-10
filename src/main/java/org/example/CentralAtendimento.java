package org.example;

public class CentralAtendimento {

    private static CentralAtendimento instancia = new CentralAtendimento();

    private CentralAtendimento() {}

    public static CentralAtendimento getInstancia() {
        return instancia;
    }

    public String receberElogioComercial(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n" +
                "O Comercial respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Comercial.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoComercial(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n" +
                "O Comercial respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Comercial.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoComercial(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n" +
                "O Comercial respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Comercial.getInstancia().receberSugestao(mensagem);
    }

}