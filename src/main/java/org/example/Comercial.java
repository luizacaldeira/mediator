package org.example;

public class Comercial implements Setor {

    private static Comercial instancia = new Comercial();

    private Comercial() {}

    public static Comercial getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O Comercial vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O Comercial agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O Comercial vai analisar a sugestão: " + mensagem;
    }
}