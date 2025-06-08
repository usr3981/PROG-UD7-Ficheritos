package net.salesianos.tables;

public class Table {
    private String color;
    private int numeroPatas;

    public Table(String color, int numeroPatas) {
        this.color = color;
        this.numeroPatas = numeroPatas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return "Table [color=" + color + ", numeroPatas=" + numeroPatas + "]";
    }

}
