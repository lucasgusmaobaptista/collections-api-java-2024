package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListaDeAlunos {
    private Set<Aluno> listaDeAlunos;

    public ListaDeAlunos() {
        this.listaDeAlunos = new HashSet();
    }

    public void addAluno(String nome, long matricula, double media) {
        listaDeAlunos.add(new Aluno(nome, matricula, media));
    }

    public void removeAluno(long matricula) {
        for (Aluno a : listaDeAlunos) {
            if (a.getMatricula() == matricula) {
                listaDeAlunos.remove(a);
            }
        }
    }

    public Set<Aluno> showByName() {
        Set<Aluno> alunosNome = new TreeSet<>(listaDeAlunos);
        return alunosNome;
    }

    public Set<Aluno> showByMedia() {
        Set<Aluno> alunosMedia = new TreeSet<>(new ComparatorPorNota());
        alunosMedia.addAll(listaDeAlunos);
        return alunosMedia;
    }

    public static void main(String[] args) {
        ListaDeAlunos listaDeAlunos = new ListaDeAlunos();

        listaDeAlunos.addAluno("João", 123456789, 9.5);
        listaDeAlunos.addAluno("Maria", 987654321, 8.5);
        listaDeAlunos.addAluno("José", 123456789, 7.5);
        listaDeAlunos.addAluno("Ana", 987654321, 6.5);
        listaDeAlunos.addAluno("Pedro", 123456789, 5.5);

        System.out.println(listaDeAlunos.showByName());
        System.out.println(listaDeAlunos.showByMedia());
    }
}
