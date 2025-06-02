import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ingresso> ingressos = new ArrayList<>();

        ingressos.add(new Normal(1, 50.0));
        ingressos.add(new VIP(2, 50.0, 30.0));
        ingressos.add(new CamaroteInferior(3, 50.0, 40.0, "Setor A - Frente ao palco"));
        ingressos.add(new CamaroteSuperior(4, 50.0, 60.0));

        System.out.println("==== Lista de Ingressos ====");
        for (Ingresso ingresso : ingressos) {
            ingresso.imprimeValor();
            System.out.println("----------------------------");
        }
    }
}
