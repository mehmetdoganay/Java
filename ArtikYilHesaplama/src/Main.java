import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yil;

        System.out.printf("Yıl giriniz: ");
        yil = input.nextInt();

        if(yil % 4 == 0 || yil % 400 == 0)
        {
            System.out.println(yil + " Bir artık yıldır.");
        }else
        {
            System.out.println(yil + " Bir artık yıl değildir. ");
        }

    }
}
