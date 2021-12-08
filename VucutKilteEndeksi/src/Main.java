import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kilo, boy, sonuc;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre cinsinde giriniz:");
        boy = scan.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz:");
        kilo = scan.nextDouble();

        sonuc = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz:" + sonuc);
    }
}
