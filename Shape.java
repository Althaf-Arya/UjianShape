package Bentuk;

public class Shape {
    String name;
    String color;

    public Shape(String n, String c) {
        name = n;
        color = c;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print() {
        System.out.println("Nama bentuk: " + this.name);
        System.out.println("Warna: " + this.color);
    }

}
