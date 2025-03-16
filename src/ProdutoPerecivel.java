public class ProdutoPerecivel extends Produto {
    String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public static void main(String[] args) {
        Produto produtoPerecivel = new Produto("Produto C", 21.99, 15);
        System.out.println(produtoPerecivel);
    }
}
