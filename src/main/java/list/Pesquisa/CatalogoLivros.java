package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano) {
        livroList.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> searchAuthor(String autor) {
        List<Livro> livrosAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosAutor.add(l);
                }
            }
        }
        return livrosAutor;
    }

    public List<Livro> searchByYearInterval(int anoInicial, int anoFinal) {
        List<Livro> livrosAno = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
                    livrosAno.add(l);
                }
            }
        }
        return livrosAno;
    }

    public Livro searchByTitle(String title) {
        Livro livroTitutlo = null;
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equals(title)) {
                    livroTitutlo = l;
                    break;
                }
            }
        }
        return livroTitutlo;
    }

}




