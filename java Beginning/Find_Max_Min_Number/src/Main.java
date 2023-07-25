import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int[] newList = new int[list.length + 1];

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num = input.nextInt();

        for(int i = 0; i < list.length; i++)
        {
            newList[i] = list[i];
        }
        newList[newList.length -1 ] = num;

        Arrays.sort(newList);
        int index = Arrays.binarySearch(newList,num);

        if(newList[newList.length -1] == num)
        {
            System.out.println("Girilen sayıdan küçük en büyük değer: " + newList[Arrays.binarySearch(newList,num) - 1]);
            System.out.println("Girilen sayı dizinin en büyük değeri.");

        }
        else if(newList[0] == num)
        {
            System.out.println("Girilen sayı dizinin en küçük değerir");
            System.out.println("Girilen sayıdan büyük en küçük değer: " + newList[Arrays.binarySearch(newList,num) + 1]);
        }
        else{
            System.out.println("Girilen sayıdan küçük en büyük değer: " + newList[Arrays.binarySearch(newList,num) - 1]);
            System.out.println("Girilen sayıdan büyük en küçük değer: " + newList[Arrays.binarySearch(newList,num) + 1]);
        }
    }
}
