import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fiz, kim, tur, tar, muz;
        System.out.println("Matematik Puanınızı Giriniz:");
        mat = input.nextInt();
        System.out.println("Fizik Puanınızı Giriniz:");
        fiz = input.nextInt();
        System.out.println("Kimya Puanınızı Giriniz:");
        kim = input.nextInt();
        System.out.println("Türkçe Puanınızı Giriniz:");
        tur = input.nextInt();
        System.out.println("Tarih Puanınızı Giriniz:");
        tar = input.nextInt();
        System.out.println("Müzik Puanınızı Giriniz:");
        muz = input.nextInt();

        int toplam = (mat+fiz+kim+tur+tar+muz);
        int   sonuc = toplam / 6;
        boolean sart = sonuc >= 60.0;
        String durum = sart ? "Sınıfı Geçti!" : "Sınıfta Kaldı !!!";
        System.out.println("Not Ortalamanız: "+sonuc);
        System.out.println(durum);
    }
}
