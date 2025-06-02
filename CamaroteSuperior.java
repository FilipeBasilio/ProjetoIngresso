public class CamaroteSuperior extends VIP {

    public CamaroteSuperior(int codigo, double valor, double valorAdicional) {
        super(codigo, valor, valorAdicional);
    }

    @Override
    public void imprimeValor() {
        System.out.println("Ingresso Camarote Superior");
        super.imprimeValor();
    }
}
