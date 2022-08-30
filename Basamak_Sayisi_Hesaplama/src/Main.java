import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Sayı Giriniz: ");
        int sayiMod,sum = 0, sayi =input.nextInt();

        while( sayi > 0)
        {
            sayiMod = sayi % 10;

            sayi = sayi / 10;

            sum = sum + sayiMod;

        }
        System.out.println("Girilen Sayının rakamlar toplamı " + sum );
    }
}
