package principal;

import planocartesiano.Ponto;

public class MainPonto {
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto(4, 8);
        Ponto ponto2 = new Ponto(17, 23);
        int x = 34;
        int y = 12;

        System.out.println(
                "Distância entre o ponto 1 e o ponto 2: " + ponto1.calculaDistancia(ponto1, ponto2) + " unidades.");
        System.out.println(
                "Distância entre o ponto 1 e um outro ponto qualquer: " + ponto1.calculaDistancia(ponto1, x, y) + " unidades.");
    }

}
