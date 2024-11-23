package Bentuk;

public class Cube extends Rectangle{
    int height;

    public Cube(String n, String c, int l, int w, int h) {
        super(n, c, l, w);
        height = h;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void print() {
        System.out.println("Nama bentuk : " + this.name);
        System.out.println("Warna : " + this.color);
        System.out.println("Panjang : " + this.lenght);
        System.out.println("Lebar : " + this.widht);
        System.out.println("Tinggi : " + this.height);
    }
    
}
