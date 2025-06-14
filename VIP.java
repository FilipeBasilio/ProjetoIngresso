public class VIP extends Ingresso {
    protected double valorAdicional;

    public VIP(int codigo, double valor, double valorAdicional) {
        super(codigo, valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorVIP() {
        return valor + valorAdicional;
    }

    @Override
    public void imprimeValor() {
        System.out.printf("Código: %d | Valor VIP: R$ %.2f%n", codigo, getValorVIP());
    }
}
