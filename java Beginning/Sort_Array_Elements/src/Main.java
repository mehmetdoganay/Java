import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi kaç elemanlı olsun: ");
        int arr = input.nextInt();
        int[] arrList = new int[arr];

        int num = 0;
        for(int i = 0; i < arr  ; i++)
        {
            System.out.print(i + 1 + ". sayıyı giriniz: ");
            arrList[i] = num = input.nextInt();
        }
        Arrays.sort(arrList);
        System.out.println("Sıralama: " + Arrays.toString(arrList));
    }
}
