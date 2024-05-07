import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorProdutos gerenciador = new GerenciadorProdutos();

        while (true) {
            System.out.println("O que você deseja fazer?");
            System.out.println("Digite 1 para inserir um novo produto.");
            System.out.println("Digite 2 para listar todos os produtos.");
            System.out.println("Digite 3 para pesquisar um produto.");
            System.out.println("Digite 4 para excluir um produto.");
            System.out.println("Digite 5 para sair do programa.");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Entre com o nome do produto:");
                    String nome = scanner.nextLine();
                    System.out.println("Entre com o preço do produto:");
                    double preco = scanner.nextDouble();
                    System.out.println("ENtre com a quantidade em estoque do produto:");
                    int quantidade = scanner.nextInt();
                    gerenciador.adicionarProduto(nome, preco, quantidade);
                    System.out.println("Produto adicionado com sucesso.");
                    break;
                case 2:
                    System.out.println("Lista de Produtos:");
                    gerenciador.listarProdutos();
                    break;
                case 3:
                    System.out.println("Digite o nome do produto a ser pesquisado:");
                    String nomePesquisa = scanner.nextLine();
                    gerenciador.pesquisarProduto(nomePesquisa);
                    break;
                case 4:
                    System.out.println("Digite o nome do produto a ser excluído:");
                    String nomeExclusao = scanner.nextLine();
                    gerenciador.excluirProduto(nomeExclusao);
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }
}