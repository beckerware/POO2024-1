package supermercado;

public class Produto {
    private String nome;
    private double valor;
    private String codigo;

    public void aumentaValor(double porcentagemEmDecimal){
        this.valor += this.valor * porcentagemEmDecimal;
    }

    public void promocaoValor(double porcentagemEmDecimal){
        this.valor -= this.valor * porcentagemEmDecimal;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
