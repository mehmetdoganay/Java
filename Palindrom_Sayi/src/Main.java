import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int number)
    {
        int mod, numberCopy = 0 ;
        int temp = number;
        while (temp != 0)
        {
            mod = temp % 10;
            numberCopy = (numberCopy * 10) + mod;
            temp = temp / 10;
        }
        if(number == numberCopy)
            return true;
        else return false;



    }

    public static void main(String[] args) {
        System.out.println( isPalindrom(4));
    }
}
