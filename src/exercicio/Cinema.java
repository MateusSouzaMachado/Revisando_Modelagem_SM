package exercicio;

public class Cinema {
    
    private String filme;
    private int totalAssentos;
    private int assentosOcupados;
    private double precoIngresso;

    public Cinema(int assentos, String filmeNome, double preco){
        this.filme = filmeNome;
        this.totalAssentos = assentos;
        this.precoIngresso = preco;
    }

    public void getAssentos(){
        System.out.println("Assentos livres: " + totalAssentos
        + "\nAssentos ocupados: " + assentosOcupados);
    }

    public void venderIngresso(int quantidade){
        if (quantidade <= this.totalAssentos) {
            this.totalAssentos -= quantidade;
            this.assentosOcupados += quantidade;
        }else{
            System.out.println("Numero de assentos insuficiente");
        }
    }

    public void cancelarIngresso(int quantidade){
        if (quantidade < this.assentosOcupados) {
            this.assentosOcupados -= quantidade;
            this.totalAssentos += quantidade;
            
        }else{
            totalAssentos += assentosOcupados;
            assentosOcupados = 0;
        }
    }

    public boolean verificarDisponibilidade(){
        if (totalAssentos > 0) {
            System.out.println("A assentos livres");
            return true;
        }else{
            System.out.println("Não a assentos");
            return false;
        }
    }

    public double calcularFaturamento(){
        return assentosOcupados * precoIngresso;
    }

}
