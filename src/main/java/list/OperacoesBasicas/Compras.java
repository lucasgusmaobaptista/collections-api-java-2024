package main.java.list.OperacoesBasicas;

public class Compras {
    private String item;
    private double value;
    private int quantity;

    public Compras(String item, double value, int quantity) {
        this.item = item;
        this.value = value;
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public double getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Compras{" +
                "item='" + item + '\'' +
                ", value=" + value +
                ", quantity=" + quantity +
                '}';
    }
}
