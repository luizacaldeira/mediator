import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteB2CTest {

    @Test
    void deveElogiarComercial() {
        ClienteB2C cliente = new ClienteB2C();
        assertEquals("A Central de Atendimento agradece seu contato.\nO Comercial respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Comercial agradece a mensagem: Ótimo atendimento",
                cliente.elogiarComercial("Ótimo atendimento"));
    }

    @Test
    void deveReclamarComercial() {
        ClienteB2C cliente = new ClienteB2C();
        assertEquals("A Central de Atendimento agradece seu contato.\nO Comercial respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Comercial vai procurar melhorar o serviço da reclamação: Demora na instalação",
                cliente.reclamarComercial("Demora na instalação"));
    }

    @Test
    void deveSugerirComercial() {
        ClienteB2C cliente = new ClienteB2C();
        assertEquals("A Central de Atendimento agradece seu contato.\nO Comercial respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Comercial vai analisar a sugestão: Ampliar opções de plano",
                cliente.sugerirComercial("Ampliar opções de plano"));
    }

}