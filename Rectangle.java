package Bentuk;

public class Rectangle extends Shape{
    int lenght;
    int widht;

    public Rectangle(String n, String c, int l, int w) {
        super(n, c);
        lenght = l;
        widht = w;
    }

    public int getLenght() {
        return this.lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidht() {
        return this.widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public void print() {
        System.out.println("Nama bentuk : " + name);
        System.out.println("Warna : " + color);
        System.out.println("Panjang : " + lenght);
        System.out.println("Lebar : " + widht);
    }

    
}
