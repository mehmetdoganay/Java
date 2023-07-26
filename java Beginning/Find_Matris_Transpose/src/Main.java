import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Satır girin: ");
        int row = input.nextInt();
        System.out.print("Sütun girin: ");
        int col = input.nextInt();

        int[][] matris = new int[row][col];
        int[][] transpose = new int[col][row];

        int count = 1;
        System.out.println("Matris");
        for (int i = 0; i < row; i++)
        {
            for(int j = 0; j < col ; j++)
            {
                matris[i][j] = count;
                count ++;
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpoze");
        for (int i = 0; i < col; i++)
        {
            for(int j = 0; j < row ; j++)
            {
                transpose[i][j] = matris[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
