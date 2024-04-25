import calculos.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto();
        double aumento;
        double desconto;

        produto.setNome("Sabão em pó");
        produto.setCodigo("12345");
        produto.setValor(5.99);

        System.out.println("Valor original de " + produto.getNome() + ": R$" + produto.getValor());

        produto.aumentaValor(0.4);
        produto.promocaoValor(0.2);

        System.out.println("Valor após aumento e promoção: R$" + produto.getValor());

    }
}
