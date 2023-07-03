import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();
        primeNumber(number);

        if(number == 1)
        {
            System.out.println(number + " Bir asal sayı değildir." );
        }
        else if (primeNumber(number) == 0)
        {
            System.out.println(number + " Bir asal sayıdır." );
        } else
        {
            System.out.println(number + " Bir asal sayı değildir." );
        }
    }
    public static int primeNumber(int n)
    {
        int counter = 0;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                counter++;
                break;
            }
        }
        return counter;
    }
}
