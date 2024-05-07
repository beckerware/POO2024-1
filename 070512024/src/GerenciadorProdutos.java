import java.util.ArrayList;

class GerenciadorProdutos {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void pesquisarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                System.out.println(produto);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void excluirProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtos.remove(produto);
                System.out.println("Produto removido com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
}
