package principal;

import supermercado.Produto;

public class MainSupermercado {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Sabão em pó");
        produto.setCodigo("12345");
        produto.setValor(5.99);
        double aumento = 0.4;
        double desconto = 0.2;

        System.out.println("Valor original de " + produto.getNome() + ": R$" + produto.getValor());

        produto.aumentaValor(aumento);
        produto.promocaoValor(desconto);

        System.out.println("Valor após aumento e promoção: R$" + produto.getValor());
    }

}
