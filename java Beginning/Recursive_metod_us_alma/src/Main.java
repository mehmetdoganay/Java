import java.util.Scanner;

public class Main {

    static int exponentiation(int base, int exponent)
    {
        if (base == 1 | exponent == 0) {
            return 1;
        }

        return  exponentiation(base,exponent-1) * base;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base ,exponent;
        System.out.printf("Taban Girin: ");
        base = scan.nextInt();

        System.out.printf("Kuvvet girin: ");
        exponent = scan.nextInt();

        System.out.println(exponentiation(base,exponent));
    }
}
