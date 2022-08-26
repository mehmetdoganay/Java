import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kenarA ,kenarB ;
        double kenarC;

        System.out.printf("A kenarını giriniz: ");
        kenarA = input.nextInt();

        System.out.printf("B kenarını giriniz: ");
        kenarB = input.nextInt();

        kenarC = Math.sqrt((kenarA*kenarA) + (kenarB*kenarB));

        System.out.println("Hipotenüs: " + kenarC);






    }
}
