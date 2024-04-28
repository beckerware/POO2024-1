package planocartesiano;

import java.lang.Math;

public class Ponto {

    private int X;
    private int Y;

    public Ponto() {
        this.X = 0;
        this.Y = 0;
    }

    public Ponto(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public Ponto(Ponto ponto) {
        this.X = ponto.X;
        this.Y = ponto.Y;
    }

    public int getX() {
        return this.X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return this.Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public int calculaDistancia(Ponto ponto1, Ponto ponto2) {
        double distancia;
        distancia = Math.sqrt(Math.pow((double) (ponto2.getX() - ponto1.getX()), 2)
                + (Math.pow((double) (ponto2.getY() - ponto1.getY()), 2)));
        return (int) distancia;
    }

    public int calculaDistancia(Ponto ponto1, int centrox, int centroy) {
        double distancia;
        distancia = Math.sqrt(
                Math.pow((double) (centrox - ponto1.getX()), 2) + (Math.pow((double) (centroy - ponto1.getY()), 2)));
        return (int) distancia;
    }

}
