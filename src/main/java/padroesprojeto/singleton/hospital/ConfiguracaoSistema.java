package padroesprojeto.singleton.hospital;

public class ConfiguracaoSistema {

    private ConfiguracaoSistema() {};
    private static ConfiguracaoSistema instance = new ConfiguracaoSistema();
    public static ConfiguracaoSistema getInstance() {
        return instance;
    }

    private String nomeHospital;
    private String usuarioLogado;

    public String getNomeHospital() {
        return nomeHospital;
    }

    public void setNomeHospital(String nomeHospital) {
        this.nomeHospital = nomeHospital;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
