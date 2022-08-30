import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.printf("Sayi Girin: ");
        int n =input.nextInt();

        for (int i = 0; n > i; i++)
        {
            for (int j = 0; j <= (n-i); j++)
            {
                System.out.printf(" ");
            }

            for (int j = 0; j <= 2*i; j++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 0; i--)
        {
            for (int j = (n-i); j >= -1; j--)
            {
                System.out.printf(" ");
            }

            for (int j = 2*i; j > 1; j--)
            {
                System.out.printf("*");
            }

            System.out.println();

        }
    }
}
