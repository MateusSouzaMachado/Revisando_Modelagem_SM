package GerecenciamentosDeProdutos;

public class Produto {

    private String codigo;
    private double preco;
    private int quantidadeEmEstoque;
    private String nome;

    public void adicionarEstoque(int quantidade){

    }

    public void removerEstoque(int quantidade){

    }

    public int consultarEstoque(){
        return quantidadeEmEstoque;
    }

    public double getPreco(){
        return preco;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }
}
