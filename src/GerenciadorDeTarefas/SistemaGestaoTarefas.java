package GerenciadorDeTarefas;

public class SistemaGestaoTarefas {
    public static void main(String[] args) {
        
        Projeto projeto1 = new Projeto();


        Tarefa tarefa1 = new Tarefa("Desenvolver interface do usuário");
        Tarefa tarefa2 = new Tarefa("Criar banco de dados");
        Tarefa tarefa3 = new Tarefa("Implementar API");

        projeto1.adicionarTarefa(tarefa1);
        projeto1.adicionarTarefa(tarefa2);
        projeto1.adicionarTarefa(tarefa3);

        projeto1.exibirTarefasPendentes();

        projeto1.concluirTarefa(tarefa1);
        projeto1.exibirTarefasPendentes();
        projeto1.exibirTarefasConcluidas();

        projeto1.concluirTarefa(tarefa2);
        projeto1.concluirTarefa(tarefa3);

        projeto1.exibirTarefasPendentes();
        projeto1.exibirTarefasConcluidas();

        if (projeto1.isProjetoConcluido()) {
            System.out.println("O projeto foi concluído com sucesso!");
        } else {
            System.out.println("O projeto ainda não foi concluído.");
        }
    }
}
