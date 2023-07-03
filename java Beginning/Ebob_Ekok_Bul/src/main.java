import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int count = 1;
        int addEbob, addEkok, ekokLenght;

        ArrayList<Integer> ekok = new ArrayList<>();
        ArrayList<Integer> ebob = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("1. Sayıyı girin: ");
        int n1 = input.nextInt();

        System.out.println("2. Sayıyı girin: ");
        int n2 = input.nextInt();

        if(n1 > n2)
        {
            while (n1 >= count)
            {
                if(n1 % count == 0  && n2 % count == 0)
                {
                    addEbob = count;
                    addEkok = (n1*n2)/addEbob;
                    ebob.add(addEbob);
                    ekok.add(addEkok);
                }
                count ++;
            }
            ekokLenght = ekok.size();
            System.out.println("En büyük ortak bölenler "+ ebob);
            System.out.println("En küçük ortak kat " + ekok.get(ekokLenght -1 ));
        }
        else
        {
            while (n2 >= count)
            {
                if(n1 % count == 0  && n2 % count == 0)
                {
                    addEbob = count;
                    addEkok = (n1*n2)/addEbob;
                    ebob.add(addEbob);
                    ekok.add(addEkok);
                }
                count ++;
            }
            ekokLenght = ekok.size();
            System.out.println("En büyük ortak bölenler " + ebob);
            System.out.println("En küçük ortak kat " + ekok.get(ekokLenght -1 ));
        }
    }
}
