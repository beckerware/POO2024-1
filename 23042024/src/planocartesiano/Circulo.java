package planocartesiano;

public class Circulo {
    private int centrox;
    private int centroy;
    private int raio;

    public Circulo(int x, int y, int r) {
        centrox = x;
        centroy = y;
        raio = r;
    }

    public Circulo(int x, int y) {
        centrox = x;
        centroy = y;
        raio = 1;
    }

    public Circulo(int r) {
        centrox = 0;
        centroy = 0;
        raio = r;
    }

    public Circulo(Circulo circulo) {
        centrox = circulo.getCentrox();
        centroy = circulo.getCentroy();
        raio = circulo.getRaio();
    }

    public Circulo(Ponto ponto, int raio) {
        this.centrox = ponto.getX();
        this.centroy = ponto.getY();
        this.raio = raio;
    }

    public Circulo(Ponto ponto, double diametro) {
        this.centrox = ponto.getX();
        this.centroy = ponto.getY();
        this.raio = (int)diametro / 2;
    }

    public void moverCirculo(int novox, int novoy) {
        setCentrox(novox);
        setCentroy(novoy);
    }

    public void moverCirculo(Ponto ponto){
        setCentrox(ponto.getX());
        setCentroy(ponto.getY());
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

    public void representacao() {
        System.out.println("O círculo se encontra em X: " + this.centrox + " e Y: " + centroy + ", e tem " + this.raio
                + " unidade(s) de raio.");
    }

}