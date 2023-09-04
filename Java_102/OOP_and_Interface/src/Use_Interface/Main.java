package Use_Interface;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);

        System.out.print("Tutar Girin: ");
        String price = in.nextLine();
        System.out.print("Kart Numarasını girin: ");
        String cardNumber = in.nextLine();
        System.out.print("Kartın son kullanım Tarihini girin: ");
        String expiryDate = in.nextLine();
        System.out.println("Kartın cvc numarasını girin: ");
        String cvcNumber = in.nextLine();

        System.out.println("Banka seçin !");
        System.out.println("1 - aBank");
        System.out.println("2 - bBank");
        int selectBank = in.nextInt();

        switch (selectBank)
        {
            case 1 :
                ABank aBank1 = new ABank("AtaBank","0023023234","1235");
                System.out.println(aBank1.connect("127.1.1.1"));
                System.out.println(aBank1.payment("100","1234 1234 4444 5555","27/11","453"));
                break;
            case 2:
                BBank bBank2 = new BBank("AsyaBank","0011026781","8126");
                if(bBank2.connect("127.1.1.1") == false)
                {
                    System.out.println("işlem gerçekleştirilemiyor.");
                    break;
                }
                System.out.println( bBank2.payment("250","4442 1134 6553 2351","25/10","875"));
                break;


            default:
                System.out.println(" Geçerli bir banka girin. ");
        }

    }
}
