import javax.swing.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int balance = 1500;
        int section = 0;
        Scanner input = new Scanner(System.in);


        while (right > 0) {
            System.out.print("Kullanıcı adı : ");
            userName = input.nextLine();
            System.out.print("Şifre : ");
            password = input.nextLine();

            if (userName.equals("1") && password.equals("2")) {

                System.out.println("Giriş yapıldı.");
                System.out.println("Güncel Bakiye: " + balance);
                while (section != 4) {
                    System.out.println("İşlem Seçin");
                    System.out.println("1- Para Yatırma.\n" +
                            "2- Para Çekme \n" +
                            "3- Bakiye Sorgula \n" +
                            "4- Çıkış");

                    section = input.nextInt();
                    switch (section) {
                        case 1:
                            System.out.print("Yatırılacak miktar girin: ");
                            balance = balance + input.nextInt();
                            System.out.println("Para yatırma işlemi gerçekleşti.\n Güncel Bakiye: " + balance);
                            break;
                        case 2:
                            System.out.print("Çekilecek miktar girin: ");
                            balance = balance - input.nextInt();
                            System.out.println("Para çekme işlemi gerçekleşti.\n Güncel Bakiye: " + balance);
                            break;
                        case 3:
                            System.out.println("Güncel Bakiye: " + balance);
                            break;
                        case 4:
                            right = 0;
                            System.out.print("Çıkış yapıldı.");
                            break;
                        default:
                            System.out.println(" '1' '2' '3' '4' değerlerinden birini giriniz.");
                    }
                }
            }

             else {
                System.out.println("Kullanıcı adı veya parola yanlış.");
                right--;

                if (right == 0) {
                    System.out.println("Hesabiniz bloke edilmiştir. lütfen bankayla iletişime geçin.");
                } else {
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }













    }
}
