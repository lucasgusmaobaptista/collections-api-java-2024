package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void addConvidado(String nome, int convite) {
        convidadoSet.add(new Convidado(nome, convite));
    }

    public void removeById(int convite) {
        Convidado convidadoRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getConvite() == convite) {
                convidadoRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoRemover);
    }

    public int contarConvidados() {
        return  convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        convidados.addConvidado("João", 1);
        convidados.addConvidado("Maria", 2);
        convidados.addConvidado("José", 3);
        convidados.addConvidado("Pedro", 4);
        convidados.removeById(2);
        convidados.exibirConvidados();
        System.out.println("O número total de convidados é: " + convidados.contarConvidados());
    }
}
