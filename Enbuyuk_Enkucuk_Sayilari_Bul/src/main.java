import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, maxNum = 0, minNum = 0, minValue ;
        ArrayList<Integer> numbers = new ArrayList<>();

        try {
            System.out.println("istediğiniz adette sayı giriniz ve Enter Tuşuna basınız.");
            while (true) {
                System.out.print("Sayı giriniz: ");
                num = input.nextInt();


                if(num > maxNum)
                {
                    maxNum = num;
                }
                System.out.println("Girilen En Büyük değer " + maxNum);
                numbers.add(num);
                System.out.println("Girilen En Küçük değer:" + Collections.min(numbers));
            }
        }
        catch (NoSuchElementException exception) {
            System.out.println("Çıkış Yapıldı");
        }

    }
}
