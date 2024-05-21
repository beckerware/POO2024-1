package principal;

import cofrinho.Cofrinho;
import cofrinho.Moeda;

public class MainCofrinho {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();

        cofrinho.adicionar(new Moeda(0.05, "5 centavos"));
        cofrinho.adicionar(new Moeda(0.10, "10 centavos"));
        cofrinho.adicionar(new Moeda(0.25, "25 centavos"));
        cofrinho.adicionar(new Moeda(0.50, "50 centavos"));
        cofrinho.adicionar(new Moeda(1.0, "1 real"));
        cofrinho.adicionar(new Moeda(0.05, "5 centavos"));
        cofrinho.adicionar(new Moeda(0.10, "10 centavos"));

        System.out.println("Menor valor: " + cofrinho.menorValor());
        System.out.println("Menor moeda: " + cofrinho.menorMoeda());
        cofrinho.mostrarContagemMoedas();
    }
}
