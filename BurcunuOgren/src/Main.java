import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isError = false;

        try {
            int month, day;

            System.out.printf("Kaçıncı ayda doğdunuzu girin: ");
            month = input.nextInt();

            while (!(month > 0 && month < 13))
            {
                System.out.println("1 ile 12 arasında bir değer girmelisin");
                System.out.printf("Tekrar giriniz: ");
                month = input.nextInt();
            }


            System.out.printf("Hangi gün doğduğunuzu girin: ");
            day = input.nextInt();

            while (!(day > 0 && day < 32))
            {
                System.out.println("1 ile 31 arasında bir değer girmelisin");
                System.out.println("Tekrar giriniz: ");
                day = input.nextInt();
            }

            if (month == 1)
            {
                if (day > 0 && day < 22)
                    System.out.printf("Oğlak Burcu");
                else if(day > 21 && day < 31)
                    System.out.printf("Kova Burcu");
            }
            if (month == 2)
            {
                if (day > 0 && day < 20)
                    System.out.printf("Kova Burcu");
                else if(day > 19 && day < 31)
                    System.out.printf("Balık Burcu");
            }
            if (month == 3)
            {
                if (day > 20 && day < 31)
                    System.out.printf("Balık Burcu");
                else if(day > 0 && day < 22)
                    System.out.printf("Koç Burcu");
            }
            if (month == 4)
            {
                if (day > 0 && day < 21)
                    System.out.printf("Koç Burcu");
                else if(day > 21 && day < 31)
                    System.out.printf("Boğa Burcu");
            }
            if (month == 5)
            {
                if (day > 0 && day < 22)
                    System.out.printf("Boğa Burcu");
                else if(day > 21 && day < 31)
                    System.out.printf("İkizler Burcu");
            }
            if (month == 6)
            {
                if (day > 0 && day < 23)
                    System.out.printf("İkizler Burcu");
                else if(day > 22 && day < 31)
                    System.out.printf("Yengeç Burcu");
            }
            if (month == 7)
            {
                if (day > 0 && day < 23)
                    System.out.printf("Yengeç Burcu");
                else if(day > 22 && day < 31)
                    System.out.printf("Aslan Burcu");
            }
            if (month == 8)
            {
                if (day > 0 && day < 23)
                    System.out.printf("Aslan Burcu");
                else if(day > 22 && day < 31)
                    System.out.printf("Başak Burcu");
            }
            if (month == 9)
            {
                if (day > 0 && day < 23)
                    System.out.printf("Başak Burcu");
                else if(day > 22 && day < 31)
                    System.out.printf("Terazi Burcu");
            }
            if (month == 10)
            {
                if (day > 0 && day < 23)
                    System.out.printf("Terazi Burcu");
                else if(day > 22 && day < 31)
                    System.out.printf("Akrep Burcu");
            }
            if (month == 11)
            {
                if (day > 0 && day < 22)
                    System.out.printf("Akrep Burcu");
                else if(day > 21 && day < 31)
                    System.out.printf("Yay Burcu");
            }
            if (month == 12)
            {
                if (day > 0 && day < 22)
                    System.out.printf("Yay Burcu");
                else if(day > 21 && day < 31)
                    System.out.printf("Oğlak Burcu");
            }


        }
        catch (InputMismatchException e)
        {
            System.out.println("Lütfen sayısal değer girin.");
        }

    }
}
