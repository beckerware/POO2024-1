package principal;

import matrizquadrada.MatrizQuadrada;

public class MainMatriz{
    public static void main(String[] args) {

        MatrizQuadrada matriz1 = new MatrizQuadrada(3);
        matriz1.setValor(0, 0, 1);
        matriz1.setValor(0, 1, 2);
        matriz1.setValor(0, 2, 3);
        matriz1.setValor(1, 0, 4);
        matriz1.setValor(1, 1, 5);
        matriz1.setValor(1, 2, 6);
        matriz1.setValor(2, 0, 7);
        matriz1.setValor(2, 1, 8);
        matriz1.setValor(2, 2, 9);

        System.out.println("Matriz 1:");
        matriz1.exibirMatriz();

        matriz1.somaLinha(1);
        matriz1.somaColuna(2);

        matriz1.somaDiagonal();

        MatrizQuadrada matriz2 = new MatrizQuadrada(3);
        matriz2.setValor(0, 0, 9);
        matriz2.setValor(0, 1, 8);
        matriz2.setValor(0, 2, 7);
        matriz2.setValor(1, 0, 6);
        matriz2.setValor(1, 1, 5);
        matriz2.setValor(1, 2, 4);
        matriz2.setValor(2, 0, 3);
        matriz2.setValor(2, 1, 2);
        matriz2.setValor(2, 2, 1);

        System.out.println("Matriz 2:");
        matriz2.exibirMatriz();

        MatrizQuadrada matrizSoma = matriz1.somaMatriz(matriz2);

        System.out.println("Matriz Resultante da Soma:");
        matrizSoma.exibirMatriz();
    }
}
