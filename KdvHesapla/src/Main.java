import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            double tutar, kdvOrani =0.18;

            Scanner input = new Scanner(System.in);

            System.out.print("Lütfen tutar giriniz: ");

            tutar = input.nextDouble();

            if(tutar >= 1000)
            {
                tutar = tutar - 0.10;
                System.out.println("Kdv Tutarı: " + new DecimalFormat("##.##").format(tutar * kdvOrani));
                tutar = tutar + (tutar * kdvOrani);
                System.out.println("Kdvli toplam tutar: " + new DecimalFormat("##.##").format(tutar));
            }
            else
            {
                System.out.println("Kdv Tutarı: " + new DecimalFormat("##.##").format(tutar * (kdvOrani)) );
                tutar = tutar + (tutar * (kdvOrani));
                System.out.println("Kdvli toplam tutar: " + new DecimalFormat("##.##").format(tutar));
            }


        }
        catch (InputMismatchException e)
        {
            System.out.printf("Lütfen sayı giriniz.");
        }
    }
}
