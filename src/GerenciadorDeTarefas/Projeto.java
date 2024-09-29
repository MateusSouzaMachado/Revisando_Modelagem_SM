package GerenciadorDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class Projeto {

    private List<Tarefa> tarefas;
    private List<Tarefa> tarefasConcluidas;
    private boolean projetoConcluido;

    public Projeto() {
        this.tarefas = new ArrayList<>();
        this.tarefasConcluidas = new ArrayList<>();
        this.projetoConcluido = false;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void concluirTarefa(Tarefa tarefa) {
        if (tarefas.contains(tarefa)) {
            tarefa.concluir();
            tarefas.remove(tarefa);
            tarefasConcluidas.add(tarefa);
            verificarProjetoConcluido();
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    private void verificarProjetoConcluido() {
        if (tarefas.isEmpty()) {
            this.projetoConcluido = true;
            System.out.println("Todas as tarefas foram concluídas. Projeto concluído!");
        } else {
            this.projetoConcluido = false;
        }
    }

    public void exibirTarefasPendentes() {
        System.out.println("Tarefas pendentes:");
        for (Tarefa tarefa : tarefas) {
            System.out.println("- " + tarefa.getDescricao());
        }
    }

    public void exibirTarefasConcluidas() {
        System.out.println("Tarefas concluídas:");
        for (Tarefa tarefa : tarefasConcluidas) {
            System.out.println("- " + tarefa.getDescricao());
        }
    }

    public boolean isProjetoConcluido() {
        return this.projetoConcluido;
    }

}
