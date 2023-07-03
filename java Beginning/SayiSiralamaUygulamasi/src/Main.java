import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int  num1, num2, num3;
        System.out.printf("Lüften ilk değeri giriniz: ");
        num1 =input.nextInt();

        System.out.printf("Lüften ikinci değeri giriniz: ");
        num2 =input.nextInt();

        System.out.printf("Lüften üçüncü değeri giriniz: ");
        num3 =input.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("En büyük değer: " + num1);
            if (num2 > num3){
                System.out.println("İkinci en büyük değer: " + num2);
                System.out.println("En küçük değer: " + num3);
            }
            else
            {
                System.out.println("İkinci en büyük değer: " + num3);
                System.out.println("En küçük değer: " + num2);
            }
        } else if (num2 > num3) {
            System.out.println("En büyük değer: " + num2);
            if(num1 > num3)
            {
                System.out.println("İkinci en büyük değer: " + num1);
                System.out.println("En küçük değer: " + num3);
            }
            else
            {
                System.out.println("İkinci en büyük değer: " + num3);
                System.out.println("En küçük değer: " + num1);
            }

        }
        else
        {
            System.out.println("En büyük değer: " + num3);
            if (num1 > num2)
            {
                System.out.println("İkinci en büyük değer: " + num1);
                System.out.println("En küçük değer: " + num2);
            }
            else {
                System.out.println("İkinci en büyük değer: " + num2);
                System.out.println("En küçük değer: " + num1);
            }
        }


    }
}
