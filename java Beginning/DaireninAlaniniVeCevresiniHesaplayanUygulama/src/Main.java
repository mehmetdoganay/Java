import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14, alan, cevre, dilimAlan;
        int yariCap, merkezAcisi;

        System.out.printf("Yarı çap Giriniz: ");
        yariCap = input.nextInt();

        System.out.printf("Daire Dilim alanı için merkez açısı giriniz: ");
        merkezAcisi = input.nextInt();

        alan = pi * yariCap * yariCap;
        cevre = 2*pi*yariCap;
        dilimAlan = 360/(pi*(yariCap*yariCap)*merkezAcisi);

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println("Dairenin Dilim alanı : " + dilimAlan);







    }
}
