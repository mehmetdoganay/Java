import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        System.out.printf("Sayı Giriniz: ");
        int sayi = input.nextInt();

        for (var i = 1; i <= sayi; i++)
        {
             sum +=  (1.0/i);
        }
        System.out.println(sum);
    }
}
