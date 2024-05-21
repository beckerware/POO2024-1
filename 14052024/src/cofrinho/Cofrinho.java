package cofrinho;

import java.util.HashMap;
import java.util.LinkedList;

public class Cofrinho {
    LinkedList<Moeda> lista = new LinkedList<>();
    HashMap<Double, Integer> contagemMoedas = new HashMap<>();

    public void adicionar(Moeda m) {
        if ((m.getValor() == 0.05 || m.getValor() == 0.10 || m.getValor() == 0.25 || m.getValor() == 0.50 || m.getValor() == 1.0)) {
            lista.add(m);
            contabilizarMoeda(m.getValor());
        } else {
            throw new IllegalArgumentException("Valor inválido: o valor deve estar em centavos. Operação cancelada.");
        }
    }

    private void contabilizarMoeda(double valor) {
        if (contagemMoedas.containsKey(valor)) {
            contagemMoedas.put(valor, contagemMoedas.get(valor) + 1);
        } else {
            contagemMoedas.put(valor, 1);
        }
    }

    public double menorValor() {
        Moeda menor = new Moeda(0, "menor");
        for (Moeda item : lista) {
            if (item.getValor() > menor.getValor()) {
                menor = item;
            }
        }

        return menor.getValor();
    }

    public Moeda menorMoeda() {
        Moeda menor = new Moeda(0, "menor");
        for (Moeda item : lista) {
            if (item.getValor() > menor.getValor()) {
                menor = item;
            }
        }

        return menor;
    }

    public void mostrarContagemMoedas() {
        for (double valor : contagemMoedas.keySet()) {
            System.out.println("Moeda de " + valor + " centavos: " + contagemMoedas.get(valor) + " vezes.");
        }
    }
}
