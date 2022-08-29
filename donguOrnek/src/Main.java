import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, sayac = 0, toplam = 0;
        System.out.printf("Lütfen pozitif bir değer girin: ");
        num = input.nextInt();

        System.out.println((num < 0) ? "Lütfen pozitif bir değer girin.":"");

        while (num > 0){

            if(num % 3 == 0 && num % 4 == 0)
            {
                sayac ++;
                toplam = toplam + num;
            }
            num --;
        }
        System.out.println("3 ve 4 e tam bölünen sayıların Ortalaması: " + toplam/ sayac );
    }
}
