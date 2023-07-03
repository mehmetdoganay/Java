import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);

            int yas, km, yolculukTipi;
            double fiyat, yasIndirimi = 1.0;

            System.out.print("Lütfen yolculuğun mesafesini giriniz (km): ");
            km = input.nextInt();

            while (km < 2)
            {
                System.out.println("yapılabilen en kısa uçuş mesajfesi 2.7 km dir.");
                System.out.printf(" lütfen mesafeyi tekrar girin: ");
                km = input.nextInt();
            }

            System.out.printf("Yaşınızı giriniz: ");
            yas = input.nextInt();

            while (!(yas > 0 && yas < 150))
            {
                System.out.println("Yaşınız doğru girilmedi");
                System.out.printf("Yaşınızı Tekrar girin: ");
                yas = input.nextInt();
            }

            if(yas > 0 && yas < 12)
            {
                yasIndirimi = 0.50;
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = 0.90;
            } else if (yas > 65) {
                yasIndirimi = 0.70;
            }


            System.out.println("Lüften gidiş türünü seçin");
            System.out.printf("Gidiş için (0) Gidiş-Dönüş için (1): " );

            yolculukTipi = input.nextInt();

            if(yolculukTipi == 1)
            {
                fiyat = 0.80*(yasIndirimi*(km * 0.10));
                System.out.printf("Toplam ödenecek fiyat: " + fiyat);
            }
            else if(yolculukTipi == 0) {
                fiyat = yasIndirimi*(km*0.10);
                System.out.printf("Toplam ödenecek fiyat: " + fiyat);
            }
            else
                System.out.println("Yanlış bir değer girdiniz.");

        }catch (InputMismatchException e){
            System.out.println("Lütfen sayısal değer girin.");


        }
    }
}
