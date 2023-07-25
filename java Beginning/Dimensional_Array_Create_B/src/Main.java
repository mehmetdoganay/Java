import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] dimensional = new String[7][4];

        for(int i = 0; i < dimensional.length; i++)
        {
            for(int j = 0; j < dimensional[i].length; j++)
            {
                if(i == 0 || i == 3 || i == 6)
                    dimensional[i][j] = " * ";
                 else if (j == 0 ||  j == 3)
                    dimensional[i][j] = " * ";
                 else
                     dimensional[i][j] = "    ";
            }
        }
        for(String[] row : dimensional)
        {
            for(String col : row )
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
