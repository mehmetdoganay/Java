import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, kimya, biyoloji, turkce, tarih, dersSayisi = 6;
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz.");

            System.out.print("Matematik Ders Notunu giriniz: ");
            matematik = input.nextInt();
            if (!(matematik >= 0 && matematik <= 100))
            {
                dersSayisi--;
                matematik = 0;
                System.out.println("0 ile 100 arasında bir değer girmediniz matematik notu hesaplanmayacaktır." );
            }

            System.out.print("Fizik Ders Notunu giriniz: ");
            fizik = input.nextInt();
            if (!(fizik >= 0 && fizik <= 100))
            {
                dersSayisi--;
                fizik = 0;
                System.out.println("0 ile 100 arasında bir değer girmediniz fizik notu hesaplanmayacaktır." );
            }

            System.out.print("Kimya Ders Notunu giriniz: ");
            kimya = input.nextInt();
             if (!(kimya >= 0 && kimya <= 100))
            {
                dersSayisi--;
                kimya = 0;
                System.out.println("0 ile 100 arasında bir değer girmediniz kimya notu hesaplanmayacaktır." );
            }

            System.out.print("Biyoloji Ders Notunu giriniz: ");
            biyoloji = input.nextInt();
            if (!(biyoloji >= 0 && biyoloji <= 100))
            {
                dersSayisi--;
                biyoloji = 0;
                System.out.println("0 ile 100 arasında bir değer girmediniz biyoloji notu hesaplanmayacaktır." );
            }

            System.out.print("Türkçe Ders Notunu giriniz: ");
            turkce = input.nextInt();
            if (!(turkce >= 0 && turkce <= 100))
            {
                dersSayisi--;
                turkce = 0;
                System.out.println("0 ile 100 arasında bir değer girmediniz turkce notu hesaplanmayacaktır." );
            }

            System.out.print("Tarih Ders Notunu giriniz: ");
            tarih = input.nextInt();
            if (!(tarih >= 0 && tarih <= 100))
            {
                dersSayisi--;
                tarih = 0;
                System.out.println("0 ile 100 arasında bir değer girmediniz tarih notu hesaplanmayacaktır." );
            }

            double toplam = matematik + fizik + kimya + biyoloji + turkce + tarih;


            double ortalama = toplam / dersSayisi;

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
