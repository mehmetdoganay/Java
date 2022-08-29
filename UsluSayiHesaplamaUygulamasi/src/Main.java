import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int taban, kuvvet, sonuc = 1;

        System.out.printf("Taban değeri giriniz: ");
        taban = input.nextInt();

        System.out.printf("Kuvvet değeri giriniz: ");
        kuvvet = input.nextInt();

        for (var i = 1; kuvvet >= i; i++)
        {
            sonuc = sonuc * taban ;
        }
        System.out.println(sonuc);

    }
}
