import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, ucret, kmBasiUcret = 2.2, acilis= 10 ;

        System.out.printf("Lütfen kilometre giriniz: ");
        km = input.nextDouble();

        ucret = acilis + (km*kmBasiUcret);

        ucret = (ucret < 20) ? 20: ucret;

        System.out.print("Ödenecek Tutar: " + ucret + " Türk Lirası");



    }
}
