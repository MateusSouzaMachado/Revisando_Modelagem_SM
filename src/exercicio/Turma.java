package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String nomeAluno;
    private List<Double> notas;

     public Turma(String nomeAluno) {
        this.nomeAluno = nomeAluno;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota){
        this.notas.add(nota);
    }

    public double calcularMedia(){
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return notas.size() > 0 ? soma / notas.size() : 0;
    }

    public String verificarAprovacao(){
        double media = calcularMedia();
        return media >= 6.0 ? "Aprovado" : "Reprovado";
    }

    public String exibirNotas(){
        StringBuilder sb = new StringBuilder();
        sb.append("Notas do aluno ").append(nomeAluno).append(": ");
        
        for (double nota : notas) {
            sb.append(nota).append(" ");
        }
        double media = calcularMedia();
        sb.append("\nMédia final: ").append(media);
        sb.append("\nResultado: ").append(verificarAprovacao());
        
        return sb.toString();
    }

}
