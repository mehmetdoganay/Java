import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, r, nFac = 1, rFac = 1, dFac = 1,  kombinasyon;
        System.out.printf("Eleman Sayısını girin: ");
        n = input.nextInt();

        System.out.printf("Seçim sayısını girin: ");
        r = input.nextInt();

        for (int i = 1; n >= i; i++)
        {
            nFac = i * nFac ;
        }

        for (int i = 1; r >= i; i++)
        {
            rFac = i * rFac ;
        }

        for (int i = 1; n-r >= i; i++)
        {
            dFac = i * dFac ;
        }

        kombinasyon =  nFac/(dFac*rFac);

        System.out.printf(kombinasyon + "Farklı kombinasyon oluşabilir.");

    }
}
