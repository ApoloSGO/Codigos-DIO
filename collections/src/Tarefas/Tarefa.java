package Tarefas;

public class Tarefa {
    //ATRIBUTO 
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String geDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
