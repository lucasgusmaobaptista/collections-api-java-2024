package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void addTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removeTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescicoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas ListaTarefa = new ListaTarefas();

        ListaTarefa.addTarefa("Estudar");
        ListaTarefa.addTarefa("Brincar");
        ListaTarefa.obterDescicoesTarefas();

        System.out.println("O número total de tarefas é: " + ListaTarefa.obterNumeroTotalTarefas());
    }
}


