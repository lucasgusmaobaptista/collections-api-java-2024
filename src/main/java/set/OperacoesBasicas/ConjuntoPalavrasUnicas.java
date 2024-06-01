package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet();
    }

    public void adicionarPalavara(String palavra) {
        if (!palavrasUnicas.contains(palavra)) {
            palavrasUnicas.add(palavra);
        }
    }

    public void removerPalavrasUnicas(String palavra) {
        if (palavrasUnicas.contains(palavra)) {
            palavrasUnicas.remove(palavra);
        }
    }

    public void verificarPalavra(String palavra) {
        for (int i = 0; i < palavrasUnicas.size(); i++) {
            if (palavrasUnicas.contains(palavra)) {
                System.out.println("A palavra já está presente.");
                break;
            }
        }
    }

    public void mostrarPalavrasUnicas() {
        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavara("Estudar");
        conjuntoPalavrasUnicas.adicionarPalavara("Estudar");
        conjuntoPalavrasUnicas.adicionarPalavara("Brincar");
        conjuntoPalavrasUnicas.verificarPalavra("Estudar");
        conjuntoPalavrasUnicas.removerPalavrasUnicas("Estudar");
        conjuntoPalavrasUnicas.mostrarPalavrasUnicas();
    }
}
