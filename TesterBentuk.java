package Bentuk;

import java.util.Scanner;

public class TesterBentuk {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        
        System.out.println("1. Persegi\n2. Lingkaran");
        System.out.println("Pilih bentuk: (1/2)");
        int choice = b.nextInt();
        
        if (choice == 1) {
            System.out.println("1. Persegi\n2. Kubus");
            System.out.println("Pilih persegi: (1/2)");
            int choicee = b.nextInt();
            if (choicee == 1) {
                System.out.println("Data persegi");
                System.out.print("Masukkan warna: ");
                String color = b.next();
                System.out.print("Masukkan panjang: ");
                int lenght = b.nextInt();
                System.out.print("Masukkan lebar: ");
                int widht = b.nextInt();
                int luasP = lenght * widht;
                System.out.println("Luas persegi nya adalah "+luasP+" cm");
            } else if (choicee == 2) {
                System.out.println("Data kubus");
                System.out.print("Masukkan warna: ");
                String color = b.next();
                System.out.println("Masukkan panjang: ");
                int lenght = b.nextInt();
                System.out.print("Masukkan lebar: ");
                int widht = b.nextInt();
                System.out.print("Masukkan tinggi: ");
                int height = b.nextInt();
                int jumlahKub = lenght * widht * height * 6;
                System.out.println("Jumlah luas kubus tersebut ialah "+jumlahKub);
            }
        } else if (choice == 2) {
            double phi = 3.14;
            System.out.println("Data Lingkaran");
            System.out.print("Masukkan warna: ");
            String color = b.next();
            System.out.print("Masukkan radius: ");
            int radius = b.nextInt();
            double jumlahLin = phi * radius * radius;
            System.out.println("Luas lingkaran tersebut adalah "+jumlahLin);

        }
    }
}
