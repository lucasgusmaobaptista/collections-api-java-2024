package main.java.set.OperacoesBasicas;

public class Convidado {
    private String nome;
    private int convite;

    public Convidado(String nome, int convite) {
        this.nome = nome;
        this.convite = convite;
    }

    public int getConvite() {
        return convite;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", convite=" + convite +
                '}';
    }
}
