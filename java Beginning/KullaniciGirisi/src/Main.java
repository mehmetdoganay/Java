import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName="mehmet", password="666666",
                userNameControl, passwordControl;

        System.out.printf("Lütfen Kullanıcı adınızı giriniz: ");
        userNameControl = input.nextLine();

        System.out.printf("Lütfen Şifrenizi giriniz: ");
        passwordControl = input.nextLine();

        if(!userNameControl.equals(userName))
        {
            System.out.println("kullanıcı adı yanlış");
        } else if (!passwordControl.equals(password))
        {
            System.out.println("Şifre yanlış");
            System.out.println("Şifreni sıfırlamak için 0'ı tuşla \nKapatmak için 1");

            int select = input.nextInt();

            switch (select)
            {
                case (0):
                {
                    Scanner inp = new Scanner(System.in);
                    String controlUserName ,newPassword;

                    System.out.printf("Kullanıcı Adını girin: ");
                    controlUserName = inp.nextLine();

                    if (userName.equals(controlUserName))
                    {
                        System.out.printf("Yeni parola girin: ");
                        newPassword = inp.nextLine();

                        if (password.equals(newPassword))
                        {
                            System.out.println("Oluşturulan şifre eski şifre ile aynı olamaz.");
                        }
                        else
                        {
                            System.out.printf("Parolanızı Doğrulayın");
                            String newPasswordControl = inp.nextLine();

                            if (newPassword.equals(newPasswordControl))
                            {
                                password = newPassword;
                                System.out.println("Yeni Parola oluşturuldu.");
                            }

                            else {
                                System.out.printf("Yanlış parola doğrulaması.");
                            }

                        }
                    }
                    else {
                        System.out.println("Kullanıcı adı geçerli değil.");
                    }

                }
                case (1):
                    break;

            }
        }
        else
        {
            System.out.printf("Giriş Yapıldı");
        }
    }
}
