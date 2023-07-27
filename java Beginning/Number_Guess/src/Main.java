import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int numRandom = random.nextInt(100);
        int tryNum = 5,count = tryNum ,num ,wrongNum = 0;
        int[] wrong = new int[tryNum];

        System.out.println(tryNum + " Deneme hakkınız var.");

        while(count >= 0)
        {
            System.out.print("Tahmin girin: ");
            num = scan.nextInt();

            if(0 < num && num < 99 )
            {
                if(numRandom  == num)
                {
                    System.out.println(num + " Doğru tahmin tebrikler");
                    for(int value : wrong)
                    {
                        if(value != 0)
                        {
                            System.out.println("Yanlış girilen değerler: " + value);
                        }

                    }

                    break;
                }
                else
                {
                    if(numRandom > num)
                    {
                        System.out.println("Tahiminin küçük.");
                        wrong[wrongNum] = num;
                        wrongNum ++;
                    }
                    else {
                        System.out.println("Tahiminin büyük.");
                        wrong[wrongNum] = num;
                        wrongNum ++;
                    }
                }
                System.out.println((count -= 1) + " Deneme hakkınız kaldı.");
            }
            else {
                System.out.println(" 0 ile 100 arasında bir değer girin.");
                System.out.println((count) + " Deneme hakkınız kaldı.");
            }
        }

    }
}
