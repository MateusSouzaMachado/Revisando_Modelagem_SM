import exercicio.Turma;

public class App {
    public static void main(String[] args) throws Exception {
      
        Turma aluno1 = new Turma("João");

        aluno1.adicionarNota(7.2);
        aluno1.adicionarNota(5.0);
        aluno1.adicionarNota(10.0);

       System.out.println(aluno1.calcularMedia());
       System.out.println(aluno1.verificarAprovacao());
       System.out.println(aluno1.exibirNotas());
    }
}
