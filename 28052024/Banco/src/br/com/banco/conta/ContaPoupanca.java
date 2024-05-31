package br.com.banco.conta;

public class ContaPoupanca extends ContaCorrente implements ContasDAO{
    private double juros;

    public ContaPoupanca(int numero, Pessoa titular) {
        super(numero, titular);
    }


    public double getJuros() {
        return this.juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public void depositarRendimento(){
        double rendimento = (this.saldo * juros) / 100;
        this.saldo += rendimento;
    }

    

}
