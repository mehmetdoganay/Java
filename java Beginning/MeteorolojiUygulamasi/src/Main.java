import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int heat;

        System.out.printf("Sıcaklık Giriniz: ");
        heat = input.nextInt();

        if (heat > -89 && heat < 70 )
        {
            if(heat < 5 )
            {
                System.out.println("Hava Kış sporları için uygun. Kayak Yapabilirsin.");
            } else if (heat > 5 && heat < 15 ) {
                System.out.println("Hava biraz serin sinemada Marvel filmi var mı bir bak. ");
            } else if (heat > 15 && heat < 25 ) {
                System.out.println("Piknik için hava gayet uygun.");
            }else
                System.out.println("Hava sıcak Yüzmek için yeterli bir sebep.");
        }
        else
            System.out.println("Bu sıcaklıklarda dışarıda olmanı önermem.");



    }
}
