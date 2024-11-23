package Bentuk;

public class Cricle extends Shape{
    int radius;

    public Cricle(String n, String c, int r) {
        super(n, c);
        radius = r;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void print() {
        System.out.println("Nama bentuk : " + name);
        System.out.println("Warna : " + color);
        System.out.println("Radius : " + radius);
    }

    
}
