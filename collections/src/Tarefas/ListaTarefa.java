package Tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;
    
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover =  new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.geDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalDeTarefas() {
        return tarefaList.size();
    }
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O numero total de elementos na lista é:" + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.adicionarTarefa("tarefa1");
        listaTarefa.adicionarTarefa("tarefa 2");

        System.out.println("Onumero total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.removerTarefa("tarefa 2");
        System.out.println("O numero Total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

        
    }

}
