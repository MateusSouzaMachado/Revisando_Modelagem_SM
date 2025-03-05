package carteira_completo;

public class Produto {

    private String codigo;
    private double preco;
    private int quantidadeEmEstoque;
    private String nome;

        public void adicionarEstoque(int quantidade){
            this.quantidadeEmEstoque += quantidade;
        }

        public void removerEstoque(int quantidade){
            if(quantidadeEmEstoque >= quantidade){
                this.quantidadeEmEstoque -= quantidade;
            }
        }

        public int consultarEstoque(){
            return this.quantidadeEmEstoque;
        }

        public double getPreco(){
            return this.preco;
        }

        public String getCodigo(){
            return this.codigo;
        }

        public String getNome(){
            return this.nome;
        }
}