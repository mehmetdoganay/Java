import javax.swing.plaf.basic.BasicIconFactory;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int counter = 0;
        for (int j = 2; j <= 100; j++) {
            for (int i = 2; i <= j - 1; i++) {
                if (j % i == 0) {
                    counter++;
                    break;
                }
            }
            if (counter == 0) {
                System.out.println(j + " Asal sayı");
            } else {
                System.out.println(j +" Asal sayı değil");
                counter = 0;
            }
        }

    }
}
