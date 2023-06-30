import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter, space=0;
        System.out.print("Basamak Sayısı gir: ");
        counter = input.nextInt();
        space = (counter + counter-1)/2;

        for (int k = 0; k <= space ; k++) {
            for (int j = 1; j <= k; j++) {
                System.out.print(" ");
            }
            for (int j = counter + counter-1; j >= 1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
            counter --;
        }
    }
}
