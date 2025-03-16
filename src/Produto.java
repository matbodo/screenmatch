import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Sabão", 2.50, 10);
        Produto produto2 = new Produto("Detergente", 5.00, 20);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        for (Produto produto : listaProdutos){
            System.out.println(produto);
        }

        Produto produtoNovo = new Produto("Novo produto", 15.99, 20);
        System.out.println(produtoNovo);
    }

    public String toString(){
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
