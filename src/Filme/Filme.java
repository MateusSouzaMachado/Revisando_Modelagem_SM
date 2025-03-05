package Filme;

public class Filme {

    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public Filme(String nome, int anoDeLancamento,int duracaoEmMinutos, boolean incluidoNoPlano){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        double media = somaDasAvaliacoes / totalDeAvaliacoes;
        return media;
    }

    public String exibirFichaTecnica(){
        System.out.println("Nome: " + this.nome
        + "\nData de Lançamento: " + this.anoDeLancamento
        + "\nDuração em Minutos: " + this.duracaoEmMinutos
        + "\nSoma das Avaliações: " + this.somaDasAvaliacoes
        + "\nQuantidade de Avaliações: " + this.totalDeAvaliacoes);

        return String.format("Incluido no Plano: %b%n", this.incluidoNoPlano);
    }
} 
