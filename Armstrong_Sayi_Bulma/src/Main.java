import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num,numCopy,numCopy2, mod, modToplam = 1, modToplam2 = 0 , basamakSayisi = 0;

        System.out.printf("Sayı giriniz: ");
        num = input.nextInt();

        numCopy = num;
        numCopy2 = num;

        while (num != 0)
        {
            num = num / 10;
            basamakSayisi ++;
        }

        for(var i= 0; i < basamakSayisi; i++)
        {

            mod = numCopy % 10;

            for (var j = 1; j <= basamakSayisi; j++)
            {
                    modToplam = modToplam * mod;
            }

            modToplam2 = modToplam2 + modToplam;

            modToplam = 1;

            numCopy = numCopy / 10;
        }

        if(modToplam2 == numCopy2)
            System.out.printf(numCopy2 + " Bir Armstrong sayıdir");
        else
            System.out.printf(numCopy2+ " Bir Armstrong sayı değildir");



    }
}
