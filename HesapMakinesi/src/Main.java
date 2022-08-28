import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            double n1, n2 ;
            int select;


            System.out.printf("Lütfen Yapmak istediğiniz işlemin numarasını giriniz: ");
            System.out.println("\n(1)-Toplama\n(2)-Çıkarma\n(3)-Çarpma\n(4)-Bölme\n(5)-Mod Alma");
            select = input.nextInt();

            if (select > 0 && select < 6)
            {
                System.out.printf("Lütfen ilk değeri giriniz: ");
                n1 = input.nextDouble();

                System.out.printf("Lütfen ikinci değeri giriniz: ");
                n2 = input.nextDouble();

                switch (select) {
                    case (1): {
                        System.out.println("Toplamı: " + (n1 + n2));
                        break;
                    }
                    case (2): {
                        System.out.println("Farkı: " + (n1 - n2));
                        break;
                    }

                    case (3): {
                        System.out.println("Çarpımı: " + (n1 * n2));
                        break;
                    }
                    case (4): {
                        System.out.println("Bölümü: " + (n1 / n2));
                        break;
                    }
                    case (5): {
                        System.out.println("Modu: " + (n1 % n2));
                        break;
                    }
                }
            }
            else
            {
                System.out.println("Lütfen belirtilen değerler aralığında bir değer giriniz.");
            }

        }
        catch (InputMismatchException e)
        {
            System.out.println("LÜtfen sayısal değer giriniz.");
        }


    }
}
