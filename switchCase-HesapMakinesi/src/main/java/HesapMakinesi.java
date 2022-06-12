import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int s1, s2, islem;

        Scanner sayiAl = new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz: ");
        s1 = sayiAl.nextInt();
        System.out.print("İkinci Sayiyi Giriniz: ");
        s2 = sayiAl.nextInt();

        System.out.print("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme\n5.Mod Alma\n Yapılacak İşlemi Seçiniz: ");
        islem = sayiAl.nextInt();

        switch (islem) {
            case 1:
                System.out.println(s1 + " ile " + s2 + " sayisinin toplamı: " + (s1 + s2));
                break;
            case 2:
                System.out.println(s1 + " ile " + s2 + " sayisinin toplamı: " + (s1 - s2));
                break;
            case 3:
                System.out.println(s1 + " ile " + s2 + " sayisinin toplamı: " + (s1 * s2));
                break;
            case 4:
                System.out.println(s1 + " ile " + s2 + " sayisinin toplamı: " + (s1 / s2));
                break;
            case 5:
                System.out.println(s1 + " ile " + s2 + " sayisinin değeri: " + (s1 % s2));
                break;
            default:
                System.out.println("Girilen Değer Geçersiz Lütfen Tekrar Deneyeniz");
                break;

        }
    }
}
