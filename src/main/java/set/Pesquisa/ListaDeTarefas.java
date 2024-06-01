package main.java.set.Pesquisa;

import com.sun.tools.javac.Main;

import java.util.HashSet;
import java.util.Set;

public class ListaDeTarefas {
    private Set listaDeTarefas;
    public Set tarefasConcluidas = new HashSet();
    public Set tarefasPendentes = new HashSet();

    public ListaDeTarefas(){
        this.listaDeTarefas = new HashSet();
    }

    public void addTask(String task) {
        if (!tarefasConcluidas.contains(task)) {
            listaDeTarefas.add(task);
        }
    }

    public void removeTask(String task) {
        for (int i = 0; i < listaDeTarefas.size(); i++) {
            if (listaDeTarefas.contains(task)) {
                listaDeTarefas.remove(task);
            }
        }
    }

    public Set showTasks() {
        return listaDeTarefas;
    }

    public int countTasks() {
        return listaDeTarefas.size();
    }

    public void setTaskDone(String task) {
        tarefasConcluidas.add(task);
    }

    public void setTaskPending(String task) {
        tarefasPendentes.add(task);
    }

    public Set showTasksDone() {
        return tarefasConcluidas;
    }

    public Set showTasksPending() {
        return tarefasPendentes;
    }

    public void clearTasks() {
        listaDeTarefas.clear();
        tarefasConcluidas.clear();
        tarefasPendentes.clear();
    }

    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        listaDeTarefas.addTask("Estudar");
        listaDeTarefas.addTask("Brincar");
        listaDeTarefas.setTaskDone("Estudar");
        listaDeTarefas.setTaskPending("Brincar");

        System.out.println(listaDeTarefas.showTasks());
        System.out.println(listaDeTarefas.showTasksDone());
        System.out.println(listaDeTarefas.showTasksPending());
        System.out.println(listaDeTarefas.countTasks());

        listaDeTarefas.clearTasks();
        System.out.println(listaDeTarefas.showTasks());
    }
}
