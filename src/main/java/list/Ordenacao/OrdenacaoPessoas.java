package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void addPessoa(String name, int age, double height) {
        pessoaList.add(new Pessoa(name, age, height));
    }

    public List<Pessoa> orderByAge() {
        List<Pessoa> pAge = new ArrayList(pessoaList);
        Collections.sort(pAge);
        return pAge;
    }

    public List<Pessoa> orderByeHeight() {
        List<Pessoa> pHeight = new ArrayList<>(pessoaList);
        Collections.sort(pHeight, new ComparatorPorAltura());
        return pHeight;
    }
}
