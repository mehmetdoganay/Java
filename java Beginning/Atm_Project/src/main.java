import javax.swing.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int balance = 1500;

        Scanner input = new Scanner(System.in);

        while ( right > 0)
        {
            System.out.print("Kullanıcı adı : ");
            userName = input.nextLine();
            System.out.print("Şifre : ");
            password = input.nextLine();

            if(userName.equals("mehmet1234") && password.equals("12345678"))
            {
                System.out.println("Giriş Yapıldı.");
                System.out.println("İşlem Seçin");
                System.out.println(
                        "1- Para Yatırma.\n" +
                                "2- Para Çekme \n" +
                                "3- Bakiye Sorgula \n" +
                                "4- Çıkış"
                );

                int section = 0;
                section = Integer.parseInt(input.nextLine());
                switch (section)
                {
                    case 1:
                        System.out.print("Yatırılacak miktar girin: ");
                        balance = balance + Integer.parseInt(input.nextLine());
                        System.out.print("Para yatırma işlemi gerçekleşti.\nGüncel Bakiye: " + balance);
                        break;
                    case 2:
                        System.out.print("Çekilecek miktar girin: ");
                        balance = balance - Integer.parseInt(input.nextLine());
                        System.out.print("Para çekme işlemi gerçekleşti.\n Güncel Bakiye: " + balance);
                        break;
                    case 3:
                        System.out.print("Güncel Bakiye: " + balance);
                        break;
                    case 4:
                        right = 0;
                        System.out.print("Çıkış yapıldı.");
                        break;
                    default:
                        System.out.println(" '1' '2' '3' '4' değerlerinden birini giriniz.");
                }
            }
            else
            {
                System.out.println("Kullanıcı adı veya parola yanlış.");
                right --;

                if(right == 0){
                    System.out.println("Hesabiniz bloke olmuştur lütfen bankayla iletişime geçin.");
                }
                else
                {
                    System.out.println("Kalan hakkınız: " + right );
                }
            }

        }










    }
}
