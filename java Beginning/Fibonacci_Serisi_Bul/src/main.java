import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Seri Kaç elemanlı olsun? ");
        int fibonacci = 0, num1 = 1, num2 = 0, seriSayisi = input.nextInt();

        for (int i = 0; i < seriSayisi; i++) {
            fibonacci = num2 + num1;
            System.out.println(num2 + " + " + num1 + " = " + fibonacci);
            num2= num1;
            num1 = fibonacci;
        }
    }
}
