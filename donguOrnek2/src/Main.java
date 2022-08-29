import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, toplam = 0;

        do {
            System.out.printf("Sayı girin: ");
            num = input.nextInt();
            toplam = toplam + num;

        }while (num % 2 == 0);
        toplam = toplam -num;
        System.out.printf("Toplam: " + toplam);
    }
}
