package main.java.map.OperaceosBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String p = null;
        if (!dicionarioMap.isEmpty()) {
            p = dicionarioMap.get(palavra);
        }
        return p;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Estudar", "Aprender");
        dicionario.adicionarPalavra("Futebol", "Esporte");
        dicionario.adicionarPalavra("Brincar", "Jogar");
        dicionario.exibirPalavras();

        dicionario.removerPalavra("Estudar");
        dicionario.pesquisarPorPalavra("Futebol");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Futebol"));
    }
}
