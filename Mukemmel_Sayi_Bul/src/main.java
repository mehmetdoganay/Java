import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, divisors=0 ;

        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        for (int i = 1; i <= number-1; i++)
        {
            if(number % i == 0)
            {
                divisors = divisors + i;
            }
        }
        if(divisors == number)
        {
            System.out.println(number + " Mukemmel bir sayıdır.");
        }
        else
        {
            System.out.println(number + " Mukemmel bir sayı değildir.");
        }
    }
}
