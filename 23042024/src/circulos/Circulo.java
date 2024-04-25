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

    public Circulo(int x, int y){
        centrox = x;
        centroy = y;
        raio = 1;
    }

    public Circulo(int r){
        centrox = 0;
        centroy = 0;
        raio = r;
    }

    public Circulo(Circulo circulo){
        centrox = circulo.getCentrox();
        centroy = circulo.getCentroy();
        raio = circulo.getRaio();
    }

    public void moverCirculo(int novox, int novoy) {
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

    public void aumentarTam() {
        this.raio++;
    }

    public void diminuirTam() {
        this.raio--;
    }

    public void representacao(){
        System.out.println("O círculo se encontra em X: " + this.centrox + " e Y: " + centroy + ", e tem " + this.raio + " unidade(s) de raio.");
    }


}