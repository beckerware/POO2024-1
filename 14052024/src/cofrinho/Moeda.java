package cofrinho;

public class Moeda {
    private double valor;
    private String nome;

    public Moeda(double v, String n){
        this.valor = v;
        this.nome = n;
    }

    public double getValor() {
        return this.valor;
    }

    public String getNome() {
        return this.nome;
    }

    public String toString(){
        return "Moeda: " + nome + ", Valor: " + valor;
    }

}
