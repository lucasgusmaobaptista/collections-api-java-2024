package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adcicionarPalavra(String palavra, Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }
    public void removerPalavra(String palavra) {
        if (!palavrasMap.isEmpty()) {
            palavrasMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(palavrasMap);
    }

    public String palavraMaisContada() {
        Integer maiorPalavra = 0;
        String  palavraMaisContada = null;
        if (!palavrasMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
                int maior = entry.getValue();
                if (maior > maiorPalavra) {
                    maiorPalavra = maior;
                    palavraMaisContada = entry.getKey();
                }
            }
        }
        return palavraMaisContada;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adcicionarPalavra("Estudar", 1);
        contagemPalavras.adcicionarPalavra("Estudar", 2);
        contagemPalavras.adcicionarPalavra("Brincar", 3);
        contagemPalavras.adcicionarPalavra("Andar", 7);
        contagemPalavras.adcicionarPalavra("Jogar", 5);
        contagemPalavras.exibirPalavras();
        contagemPalavras.removerPalavra("Estudar");
        contagemPalavras.exibirPalavras();
        System.out.println(contagemPalavras.palavraMaisContada());
    }
}
