package padroesprojeto.singleton.hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class ConfiguracaoSistemaTest {

    @Test
    void deveRetornarSempreAMesmaInstancia() {
        ConfiguracaoSistema instancia1 = ConfiguracaoSistema.getInstance();
        ConfiguracaoSistema instancia2 = ConfiguracaoSistema.getInstance();
        assertSame(instancia1, instancia2);
    }

    @Test
    void alteracaoFeitaPorUmaReferenciaDeveRefletirNaOutra() {
        ConfiguracaoSistema.getInstance().setNomeHospital("Hospital Municipal");
        ConfiguracaoSistema.getInstance().setUsuarioLogado("enfermeira.ana");

        ConfiguracaoSistema outraReferencia = ConfiguracaoSistema.getInstance();

        assertEquals("Hospital Municipal", outraReferencia.getNomeHospital());
        assertEquals("enfermeira.ana", outraReferencia.getUsuarioLogado());
    }
}
