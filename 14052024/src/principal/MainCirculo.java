package principal;

import planocartesiano.Circulo;
import planocartesiano.Ponto;

public class MainCirculo {
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto(9, 3);
        Ponto ponto2 = new Ponto(11, 2);

        Circulo circulo1 = new Circulo(2, 4, 5);
        Circulo circulo2 = new Circulo(13, 7); // receba como parâmetros o ponto X e Y para o centro, para o raio utilizar o valor padrão 1;
        Circulo circulo3 = new Circulo(5); // receba como parâmetro o raio, para o ponto central X e Y utilizar o valor padrão 0;
        Circulo circulo4 = new Circulo(circulo1); // receba como parâmetro um outro círculo, inicializando os atributos om os mesmos valores do outro círculo.
        Circulo circulo5 = new Circulo(ponto1, 4); // construir novos círculos através da informação de um ponto central e raio;
        Circulo circulo6 = new Circulo(ponto1, 10.00); //construir novos círculos através da informação de um ponto central e diâmetro;

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

        System.out.println("Círculo 5:");
        circulo5.representacao();

        System.out.println("Círculo 6:");
        circulo6.representacao();

        circulo6.moverCirculo(ponto2);
        System.out.println("Nova configuração do círculo 6: ");
        circulo6.representacao();
    }
}
