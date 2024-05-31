package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Compras> comprasList;

    public CarrinhoCompras() {
        this.comprasList = new ArrayList<>();
    }

    public void addItem(String item, double value, int quantity) {
        comprasList.add(new Compras(item, value, quantity));
    }

    public void removeItem(String item) {
        List<Compras> comprasParaRemover = new ArrayList<>();
        for (Compras compra : comprasList) {
            if (compra.getItem().equals(item)) {
                comprasParaRemover.add(compra);
            }
        }
        comprasList.remove(comprasParaRemover);
    }

    public double getTotal() {
        double total = 0;
        for (Compras compra : comprasList) {
            total += compra.getQuantity() * compra.getValue();
        }
        return total;
    }

    public void showItems() {
        System.out.println(comprasList);
    }


    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.addItem("Camiseta", 20.0, 2);
        carrinho.addItem("Calça", 30.0, 5);
        carrinho.addItem("Bermuda", 40.0, 1);
        carrinho.removeItem("Camiseta");
        carrinho.showItems();
        System.out.println(carrinho.getTotal());

    }
}
