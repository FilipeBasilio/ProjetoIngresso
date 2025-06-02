public class CamaroteInferior extends VIP {
    private String localizacao;

    public CamaroteInferior(int codigo, double valor, double valorAdicional, String localizacao) {
        super(codigo, valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização: " + localizacao);
    }

    @Override
    public void imprimeValor() {
        System.out.println("Ingresso Camarote Inferior");
        imprimeLocalizacao();
        super.imprimeValor();
    }
}
