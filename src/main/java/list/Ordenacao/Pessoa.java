package main.java.list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    private String name;
    private int age;
    private double height;

    public Pessoa(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(age, p.getAge());
    }

}
class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getHeight(), p2.getHeight());
    }
}

