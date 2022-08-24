import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, kimya, biyoloji, turkce, tarih;
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz.");

            System.out.print("Matematik Ders Notunu giriniz: ");
            matematik = input.nextInt();

            System.out.print("Fizik Ders Notunu giriniz: ");
            fizik = input.nextInt();

            System.out.print("Kimya Ders Notunu giriniz: ");
            kimya = input.nextInt();

            System.out.print("Biyoloji Ders Notunu giriniz: ");
            biyoloji = input.nextInt();

            System.out.print("Türkçe Ders Notunu giriniz: ");
            turkce = input.nextInt();

            System.out.print("Tarih Ders Notunu giriniz: ");
            tarih = input.nextInt();

            int toplam = (matematik + fizik + kimya + biyoloji + turkce + tarih);

            double ortalama = toplam / 6.0;

            System.out.println("Ortalama : " + ortalama);

            if (ortalama >= 60)
            {
                System.out.print("Sınıfı Geçti");
            }
            else
            {
                System.out.print("Sınıfta Kaldı");
            }


        }catch (InputMismatchException e)
        {
            System.out.print("Lütfen Sayı giriniz.");
        };








    }
}
