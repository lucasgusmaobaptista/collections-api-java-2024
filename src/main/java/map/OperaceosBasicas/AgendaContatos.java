package main.java.map.OperaceosBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void addContato(String nome , Integer numero) {
        agendaContatoMap.put(nome, numero);
    }

    public void removeContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer n = null;
        if(!agendaContatoMap.isEmpty()) {
            n = agendaContatoMap.get(nome);
        }
        return n;
    }
}
