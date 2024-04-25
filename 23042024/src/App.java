import calculos.Produto;
import circulos.Circulo;

public class App {
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto();
        Circulo circulo1 = new Circulo(2, 4, 5);
        Circulo circulo2 = new Circulo(13, 7);
        Circulo circulo3 = new Circulo(5);
        Circulo circulo4 = new Circulo(circulo1);
        double aumento = 0.4;
        double desconto = 0.2;

        produto.setNome("Sabão em pó");
        produto.setCodigo("12345");
        produto.setValor(5.99);

        System.out.println("Valor original de " + produto.getNome() + ": R$" + produto.getValor());

        produto.aumentaValor(aumento);
        produto.promocaoValor(desconto);

        System.out.println("Valor após aumento e promoção: R$" + produto.getValor());

        System.out.println("-------------------------------------");
        System.out.println("Círculo 1:");
        circulo1.representacao();
        circulo1.moverCirculo(4, 5);
        circulo1.representacao();
        circulo1.aumentarTam();
        circulo1.representacao();
        circulo1.diminuirTam();
        circulo1.representacao();

        System.out.println("Círculo 2:");
        circulo2.representacao();

        System.out.println("Círculo 3:");
        circulo3.representacao();

        System.out.println("Círculo 4:");
        circulo4.representacao();
    }

}
