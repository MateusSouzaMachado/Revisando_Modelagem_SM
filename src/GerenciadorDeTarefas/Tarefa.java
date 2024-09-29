package GerenciadorDeTarefas;

public class Tarefa {

    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void concluir() {
        this.concluida = true;
    }

    public boolean isConcluida() {
        return this.concluida;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
