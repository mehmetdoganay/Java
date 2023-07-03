import java.util.Scanner;

public class Main {

    static  void plus()
    {
        Scanner scan =  new Scanner(System.in);
        int number, i = 1, result = 0, counter = 0;

        System.out.printf("Kaç adet sayı toplanacak: ");
        i = scan.nextInt();

        while ( i != 0)
        {
            counter ++;
            System.out.printf(counter +". Değeri giriniz: ");
            number = scan.nextInt();
            i--;
            result +=number;
        }
        System.out.println("Sonuç: " + result);
    }

    static  void minus()
    {
        Scanner scan = new Scanner(System.in);
        int number = 0, counter = 0, result = 0;

        System.out.printf("Kaç adet sayı girilecek: ");
         counter = scan.nextInt();

         for (int i = 1; counter >= i; i++)
         {
             System.out.printf(i + ". Sayıyı giriniz: ");
             number = scan.nextInt();

             if(i == 1)
             {
                 result += number;
                 continue;
             }
             result -= number;

         }
        System.out.println("Sonuç:  " + result);
    }

    static void times()
    {
        Scanner scan = new Scanner(System.in);
        int number, result = 1;
        System.out.printf("Çarpmak istediğiniz kadar sayı girin sonuç için 0'ı tuşlayın: ");
        number = scan.nextInt();

        while (number !=0)
        {
            System.out.printf("Sayı giriniz: ");
            number = scan.nextInt();

            if(number == 0)
            {
                break;
            }
            else {
                result *= number;
            }

        }
        System.out.println("Sonuç: " + result);
    }

    static  void  divided()
    {
        Scanner scan = new Scanner(System.in);
        double number, result = 0.0, counter ;

        System.out.printf("Kaç adet sayı gireceksiniz: ");
        counter = scan.nextDouble();

        for(int i = 1; counter >= i; i++)
        {
            System.out.printf(i + ". Sayıyı giriniz: ");
            number = scan.nextDouble();

            if(number == 0)
            {
                System.out.printf("0'ı bölemezsiniz");
                i--;
                continue;
            }
            if(i == 1)
            {
                result = number;
                continue;
            }
            result /=number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void power()
    {
        Scanner scan = new Scanner(System.in);
        int base, expondent, result = 1;

        System.out.printf("Taban Girin: ");
        base = scan.nextInt();

        System.out.printf("Kuvvet Girin: ");
        expondent = scan.nextInt();

        if(base == 0)
        {
            result = 0;
            System.out.printf("Taban sıfır olamaz");
        } else if (expondent == 0) {
            result = 1;
        }
        else {
            for (var i = 0; expondent > i; i++)
            {
                result *= expondent ;
            }
        }
        System.out.println(" Sonuç: " + result);
    }

    static void factorial()
    {
        Scanner scan = new Scanner(System.in);
        int fac = 1, counter ;

        System.out.printf("Factoriyel hesaplanacak değeri giriniz: ");
        counter = scan.nextInt();

        for(var i = 1; counter >= i; i++)
        {
            fac *= i;
        }

        System.out.println("Sonuç: " + fac);

    }
    static  void modding()
    {
        Scanner scan = new Scanner(System.in);
        double number1, number2;

        System.out.printf("Bölünen Sayısı girin: ");
        number1 = scan.nextInt();

        System.out.printf("Bölen Sayıyı girin: ");
        number2 = scan.nextInt();

        number1 = number1 % number2;

        System.out.println("Mod: " + number1);
    }

    static  void rectangle()
    {
        Scanner scan = new Scanner(System.in);

        int shortEdge, longEdge, perimeter, area;

        System.out.printf("Kısa kenar girin: ");
        shortEdge = scan.nextInt();

        System.out.printf("Uzun kenar girin: ");
        longEdge = scan.nextInt();

        perimeter = 2 * (shortEdge + longEdge);
        area =  shortEdge * longEdge;

        System.out.println("Çevresi: " + perimeter );
        System.out.println("Alanı: " + area);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int select, num1, num2;

        String menu = "1 -Toplama İşlemi \n"
                + "2 -Çıkarma İşlemi \n"
                + "3 -Çarpma İşlemi \n"
                + "4 -Bölme İşlemi \n"
                + "5 -Üslü sayı Hesaplama \n"
                + "6 -Faktoriyel hesaplama\n"
                + "7 -Mod Alma \n"
                + "8- Dikdörtgen Alan ve Çevre Hesaplama\n"
                + "0 - Çıkış Yap";
        System.out.println(menu);

        do {
            System.out.printf("Bir işlem seçiniz: ");
            select = input.nextInt();

            switch (select)
            {
                case 1:
                    plus();
                case 2:
                    minus();
                case 3:
                    times();
                case 4:
                    divided();
                case 5:
                    power();
                case 6:
                    factorial();
                case 7:
                    modding();
                case 8:
                    rectangle();
            }
        }while (select != 0);
    }
}
