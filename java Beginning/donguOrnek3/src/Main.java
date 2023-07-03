import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, sum;
        System.out.printf("Sayı Girin: ");
        num = input.nextInt();

        do{
            if(num % 4 == 0  || num % 5 == 0)
            {
                System.out.println(num);
            }
            num --;
        }
        while (num > 0);
    }
}
