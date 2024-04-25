package circulos;

public class Ponto {

    private int X;
    private int Y;

    public Ponto(){
        this.X = 0;
        this.Y = 0;
    }

    public Ponto(int X, int Y){
        this.X = X;
        this.Y = Y;
    }

    public Ponto(Ponto ponto){
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



}
