package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.util.*;

public class OrganizacaoEventos {
    private Map<LocalDate, Evento> eventosMap;

    public OrganizacaoEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventos = new TreeMap<>(eventosMap);
        System.out.println(eventos);
    }

    public void exibirProximo() {
        LocalDate data = LocalDate.now();
        Map<LocalDate, Evento> eventos = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
            if (entry.getKey().isEqual(data) || entry.getKey().isAfter(data)) {
                System.out.println("O Proximo evento :" + entry.getValue() + " acontecerá na data: " + entry.getKey());
                break;            }
        }
    }
}
