package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumero implements Comparable<OrdenacaoNumero> {
    private List ordenacaoList;

    public OrdenacaoNumero() {
        this.ordenacaoList = new ArrayList<>();
    }

    public List getOrdenacaoList() {
        return ordenacaoList;
    }

    public void addNum(int num) {
        ordenacaoList.add(num);
    }

    public List orderAscending() {
        List newOrdenacaoList = new ArrayList(ordenacaoList);
        Collections.sort(newOrdenacaoList);
        return newOrdenacaoList;
    }

    public List orderDescending() {
        List newOrdenacaoList = new ArrayList(ordenacaoList);
        Collections.sort(newOrdenacaoList);
        Collections.reverse(newOrdenacaoList);
        return newOrdenacaoList;
    }

    @Override
    public int compareTo(OrdenacaoNumero o) {
        return Integer.compare(ordenacaoList.size(), o.ordenacaoList.size());
    }

    public static void main(String[] args) {
        OrdenacaoNumero ordenacaoNumero = new OrdenacaoNumero();
        ordenacaoNumero.addNum(1);
        ordenacaoNumero.addNum(2);
        ordenacaoNumero.addNum(3);
        ordenacaoNumero.addNum(4);
        ordenacaoNumero.addNum(5);
        ordenacaoNumero.addNum(6);
        ordenacaoNumero.addNum(7);
        ordenacaoNumero.addNum(8);
        ordenacaoNumero.addNum(9);
        ordenacaoNumero.addNum(10);

        System.out.println(ordenacaoNumero.orderAscending());
        System.out.println(ordenacaoNumero.orderDescending());
    }
}

class comparator implements Comparator<OrdenacaoNumero> {

    @Override
    public int compare(OrdenacaoNumero o1, OrdenacaoNumero o2) {
        return Integer.compare(o1.getOrdenacaoList().size(), o2.getOrdenacaoList().size());
    }
}
