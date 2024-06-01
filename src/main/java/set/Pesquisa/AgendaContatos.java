package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void addContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void showContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> searchNomeContato(String nome) {
        Set<Contato> contatoNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatoNome.add(c);
            }
        }
        return contatoNome;
    }

    public Contato updateContato(String name, int numero) {
        Contato c = null;
        for (Contato contato : contatoSet) {
            if (c.getNome().equals(name)) {
                c.setNumero(numero);
                c = contato;
                break;
            }
        }
        return c;
    }
}
