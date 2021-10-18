import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b, c;
        int u;
        int alan;

        System.out.print("1. Kenarı giriniz: ");
        a = scan.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        b = scan.nextInt();
        System.out.print("3. Kenarı giriniz: ");
        c = scan.nextInt();

        u = (a + b + c) / 2;
        alan = (int) Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı = " + alan);
    }
}
