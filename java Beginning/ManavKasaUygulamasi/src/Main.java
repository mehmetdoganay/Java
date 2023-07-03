import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {


        try {
            Scanner input = new Scanner(System.in);

            double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.00,
                    armutKg, elmaKg, domatesKg, muzKg, patlıcanKg ;

            System.out.printf(ANSI_PURPLE + "Armut Kaç Kilo?: ");
            armutKg = input.nextDouble();

            System.out.printf(ANSI_PURPLE + "Elma Kaç Kilo?: ");
            elmaKg = input.nextDouble();

            System.out.printf(ANSI_PURPLE + "Domates Kaç Kilo?: ");
            domatesKg = input.nextDouble();

            System.out.printf(ANSI_PURPLE + "Muz Kaç Kilo?: ");
            muzKg = input.nextDouble();

            System.out.printf(ANSI_PURPLE + "Patlıcan Kaç Kilo?: ");
            patlıcanKg = input.nextDouble();

            armut = armut * armutKg;
            elma = elma * elmaKg;
            domates = domates * domatesKg;
            muz = muz * muzKg;
            patlıcan = patlıcan * patlıcanKg;

            double toplamTutar = armut + elma + domates + muz + patlıcan;

            System.out.println(ANSI_BLUE + "Armutun toplam fiyatı: " + armut);
            System.out.println(ANSI_BLUE + "Elmanın toplam fiyatı: " + elma);
            System.out.println(ANSI_BLUE + "Domatesin toplam fiyatı: " + domates);
            System.out.println(ANSI_BLUE + "Muzun toplam fiyatı: " + muz);
            System.out.println(ANSI_BLUE + "Patlıcanın toplam fiyatı: " + patlıcan);

            System.out.println(ANSI_YELLOW + "Toplam Ödenecek Tutar: " + new DecimalFormat("##.##").format(toplamTutar)  + "TL");

        }
        catch (InputMismatchException e)
        {
            System.out.println("Lütfen sayısal değer giriniz.");
        }

    }
}
