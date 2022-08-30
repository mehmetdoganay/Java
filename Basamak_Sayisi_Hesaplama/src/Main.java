import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Sayı Giriniz: ");
        int sayiMod,counter = 0, sayi =input.nextInt();

        while( sayi > 0)
        {
            sayiMod = sayi % 10;
            counter ++;
            sayi = sayi / 10;
        }
        System.out.println("Girilen Sayı " + counter + " basamaklıdır.");
    }
}
