import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double dogumTarihi;

        System.out.printf("Doğum yılınızı girin: ");

        dogumTarihi = input.nextDouble();

        if(dogumTarihi % 12 == 0)
        {
            System.out.printf("Maymun");
        }
        else if(dogumTarihi % 12 == 1)
        {
            System.out.printf("Horoz");
        }
        else if(dogumTarihi % 12 == 2)
        {
            System.out.printf("Köpek");
        }
        else if(dogumTarihi % 12 == 3)
        {
            System.out.printf("Domuz");
        }
         else if(dogumTarihi % 12 == 4)
        {
            System.out.printf("Fare");
        }
        else if(dogumTarihi % 12 == 5)
        {
            System.out.printf("Öküz");
        }
        else if(dogumTarihi % 12 == 6)
        {
            System.out.printf("Kaplan");
        }
        else if(dogumTarihi % 12 == 7)
        {
            System.out.printf("Tavşan");
        }
        else if(dogumTarihi % 12 == 8)
        {
            System.out.printf("Ejderha");
        }
        else if(dogumTarihi % 12 == 9)
        {
            System.out.printf("Yılan");
        }
        else if(dogumTarihi % 12 == 10)
        {
            System.out.printf("At");
        }
        else if(dogumTarihi % 12 == 11)
        {
            System.out.printf("Koyun");
        }



    }
}
