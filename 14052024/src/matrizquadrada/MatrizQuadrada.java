package matrizquadrada;

public class MatrizQuadrada {
    private int[][] matriz;
    private int dimensao;

    public MatrizQuadrada(int dimensao) {
        if (dimensao <= 0) {
            throw new IllegalArgumentException("A dimensão da matriz deve ser um número positivo.");
        }
        this.dimensao = dimensao;
        this.matriz = new int[dimensao][dimensao];
    }

    public void setValor(int linha, int coluna, int valor) {
        if (linha < 0 || linha >= dimensao || coluna < 0 || coluna >= dimensao) {
            throw new IndexOutOfBoundsException("Índices fora dos limites da matriz.");
        }
        matriz[linha][coluna] = valor;
    }

    public int getValor(int linha, int coluna) {
        if (linha < 0 || linha >= dimensao || coluna < 0 || coluna >= dimensao) {
            throw new IndexOutOfBoundsException("Índices fora dos limites da matriz.");
        }
        return matriz[linha][coluna];
    }

    public void exibirMatriz() {
        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j < dimensao; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void somaLinha(int linha) {
        int soma = 0;
        for (int coluna = 0; coluna < dimensao; coluna++) {
            soma += matriz[linha][coluna];
        }
        System.out.println("A soma da linha " + linha + " é igual a " + soma + ".");
    }

    public void somaColuna(int coluna) {
        int soma = 0;
        for (int linha = 0; linha < dimensao; linha++) {
            soma += matriz[linha][coluna];
        }
        System.out.println("A soma da coluna " + coluna + " é igual a " + soma + ".");
    }

    public void somaDiagonal() {
        int soma = 0;
        for (int linha = 0; linha < dimensao; linha++) {
            for (int coluna = 0; coluna < dimensao; coluna++) {
                if (linha == coluna) {
                    soma += matriz[linha][coluna];
                }
            }
        }
        System.out.println("A soma da diagona principal da matriz é igual a " + soma + ".");
    }

    public MatrizQuadrada somaMatriz(MatrizQuadrada outra) {
        if (this.dimensao != outra.dimensao) {
            throw new IllegalArgumentException("As matrizes devem ter a mesma dimensão para serem somadas.");
        }

        MatrizQuadrada resultado = new MatrizQuadrada(this.dimensao);

        for (int i = 0; i < this.dimensao; i++) {
            for (int j = 0; j < this.dimensao; j++) {
                resultado.setValor(i, j, this.getValor(i, j) + outra.getValor(i, j));
            }
        }

        return resultado;
    }

}