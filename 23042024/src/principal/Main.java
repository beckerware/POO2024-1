package principal;

import java.util.Random;
import lampada.Lampada;
import planocartesiano.Circulo;
import planocartesiano.Ponto;
import supermercado.Produto;
import umobjeto.UmObjeto;

public class Main {
    public static void main(String[] args) {

        /*
         * Main de todas as classes, caso queira rodar um programa só para a atividade
         * inteira;
         * Na package principal tem o main de cada contexto
         */

        Ponto ponto1 = new Ponto(4, 8);
        Ponto ponto2 = new Ponto(17, 23);
        Produto produto = new Produto();
        double aumento = 0.4;
        double desconto = 0.2;
        Circulo circulo1 = new Circulo(2, 4, 5);
        Circulo circulo2 = new Circulo(13, 7);
        Circulo circulo3 = new Circulo(5);
        Circulo circulo4 = new Circulo(circulo1);
        Lampada lampada = new Lampada();
        lampada.setPotencia(7);
        lampada.setVoltagem(4000);

        Random random = new Random();

        produto.setNome("Sabão em pó");
        produto.setCodigo("12345");
        produto.setValor(5.99);

        System.out.println("Valor original de " + produto.getNome() + ": R$" + produto.getValor());

        produto.aumentaValor(aumento);
        produto.promocaoValor(desconto);

        System.out.println("Valor após aumento e promoção: R$" + produto.getValor());

        System.out.println(
                "------------------------------------------------------------------------------------------------------");
        System.out.println("Círculo 1:");
        circulo1.representacao();
        circulo1.moverCirculo(4, 5);
        circulo1.representacao();
        circulo1.aumentarTam();
        circulo1.representacao();
        circulo1.diminuirTam();
        circulo1.representacao();

        System.out.println("Círculo 2:");
        circulo2.representacao();

        System.out.println("Círculo 3:");
        circulo3.representacao();

        System.out.println("Círculo 4:");
        circulo4.representacao();

        System.out.println(
                "------------------------------------------------------------------------------------------------------");

        System.out.println(
                "Distância entre o ponto 1 e o ponto 2: " + ponto1.calculaDistancia(ponto1, ponto2) + " unidades.");
        int x = 34;
        int y = 12;
        System.out.println(
                "Distância entre o ponto 1 e um outro ponto qualquer: " + ponto1.calculaDistancia(ponto1, x, y)
                        + " unidades.");

        System.out.println(
                "------------------------------------------------------------------------------------------------------");

        // chamando randomicamente os métodos liga e desliga 15 vezes:
        for (int i = 0; i < 15; i++) {
            int moeda = random.nextInt(2);
            if (moeda == 1) {
                System.out.println("Tentando ligar a lâmpada...");
                lampada.liga();
            } else {
                System.out.println("Tentando desligar a lâmpada...");
                lampada.desliga();
            }
        }

        System.out.println(
                "------------------------------------------------------------------------------------------------------");

        UmObjeto umObjetoInstancia = UmObjeto.pegaInstancia();
        System.out.println(umObjetoInstancia.toString());
    }

}
