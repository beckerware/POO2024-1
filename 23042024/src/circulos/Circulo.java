/*mover um circulo para qualquer posição;
 aumentar o tamanho de um círculo em uma unidade;
 diminuir o tamanho de um círculo em uma unidade;
 informar uma representação textual do círculo, contendo seu ponto central e raio. */

package circulos;

public class Circulo {
    private int centrox;
    private int centroy;
    private int raio;

    public Circulo(int x, int y, int r) {
        centrox = x;
        centroy = y;
        raio = r;   
    }

    public void moverCirculo(int novox, int novoy){
        setCentrox(novox);
        setCentroy(novoy);
    }


    public int getCentrox() {
        return this.centrox;
    }

    public void setCentrox(int centrox) {
        this.centrox = centrox;
    }

    public int getCentroy() {
        return this.centroy;
    }

    public void setCentroy(int centroy) {
        this.centroy = centroy;
    }

    public int getRaio() {
        return this.raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }



}