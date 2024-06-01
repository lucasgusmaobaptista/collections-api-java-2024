package main.java.set.Ordenacao;

import java.nio.DoubleBuffer;
import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    private String name;
    private long matricula;
    private double media;

    public Aluno(String name, long matricula, double media) {
        this.name = name;
        this.matricula = matricula;
        this.media = media;
    }

    public String getName() {
        return name;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(name, aluno.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public int compareTo(Aluno o) {
        return name.compareToIgnoreCase(o.getName());
    }
}

class ComparatorPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getMedia(), o2.getMedia());
    }
}
