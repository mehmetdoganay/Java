import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int col;
    int row;
    int[][] field;
    int[][] mine;

    MineSweeper(int col, int row)
    {
       this.col = col;
       this.row = row;
    }


    public void run()
    {
        Scanner input = new Scanner(System.in);
        int currentRow,currentCol;
        boolean isBomb = true;

        calField();
        calMine();
        for(int i = 0; i < this.col; i++)
        {
            for(int j = 0; j < this.row; j++)
            {
                System.out.print(" " + mine[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Mayın Tarlası oyununa hoş gelidiniz.");

        for(int i = 0 ; i <= this.col -1; i++)
        {
            for(int j = 0 ; j <= this.row -1; j++)
            {
                if(mine[i][j] == -1)
                {
                    for (int k = Math.max(0, i - 1); k <= Math.min(this.col - 1, i + 1); k++) {
                        for (int t = Math.max(0, j - 1); t <= Math.min(this.row - 1, j + 1); t++)
                        {
                            if (mine[k][t] != -1) {
                                mine[k][t] = 1;
                            }
                        }

                    }
                }
            }
        }

        for(int i = 0; i < this.col; i++)
        {
            for(int j = 0; j < this.row; j++)
            {

                System.out.print(" " + mine[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0 ; i <= this.col -1; i++)
        {
            for(int j = 0 ; j <= this.row -1; j++)
            {
                    for (int k = Math.max(0, i - 1); k <= Math.min(this.col - 1, i + 1); k++) {
                        for (int t = Math.max(0, j - 1); t <= Math.min(this.row - 1, j + 1); t++)
                        {
                            if (mine[k][t] != -1) {
                                mine[k][t] = 0;
                            }
                        }
                    }
            }
        }

        for(int i = 0 ; i <= this.col -1; i++)
        {
            for(int j = 0 ; j <= this.row -1; j++)
            {
                if(mine[i][j] == -1)
                {
                    for (int k = Math.max(0, i - 1); k <= Math.min(this.col - 1, i + 1); k++) {
                        for (int t = Math.max(0, j - 1); t <= Math.min(this.row - 1, j + 1); t++)
                        {
                            if (mine[k][t] != -1) {
                                mine[k][t] ++;
                            }
                        }

                    }
                }
            }
        }

        for(int i = 0; i < this.col; i++)
        {
            for(int j = 0; j < this.row; j++)
            {
                System.out.print(" " + mine[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();




        for(int i = 0; i < this.col; i++)
        {
            for(int j = 0; j < this.row; j++)
            {

                if (mine[i][j] == -1)
                {
                    System.out.print(" " + mine[i][j] + " ");
                }
                else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }

        int[] pastCol = new int[this.col];
        int[] pastRow = new int[this.row];
        int counter = 0;

        while (isBomb)
        {
            System.out.print("Satır sayısını girin: ");
            currentCol = input.nextInt();
            System.out.print("Sütun sayısını girin: ");
            currentRow = input.nextInt();

            pastCol[counter] = currentCol;
            pastRow[counter] = currentRow;
            counter ++;

            if(mine[currentRow][currentRow] == -1)
            {
                System.out.println("Mayın Patladı ! Oyun bitti. ");
                isBomb = false;
            }
            else
            {
                for(int i = 0; i < this.col; i++)
                {
                    for(int j = 0; j < this.row; j++)
                    {
                        if(i == currentRow && j == currentRow)
                        {
                                System.out.print(" " + mine[currentRow][currentCol] + " ");
                        }
                        else if(containsPastMove(pastRow, pastCol, i, j))
                        {
                            System.out.print(" " + mine[i][j] + " ");
                        }
                        else
                        {
                            System.out.print(" - ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
    private boolean containsPastMove(int[] pastRow, int[] pastCol, int row, int col) {
        for (int i = 0; i < pastRow.length; i++) {
            if (pastRow[i] == row && pastCol[i] == col) {
                return true;
            }
        }
        return false;
    }

    public int[][] calField()
    {
        this.field = new int[this.col][this.row];
        int count = 0;
        for(int i = 0; i < this.col; i++)
        {
            for(int j = 0; j < this.row; j++)
            {
                field[i][j] = count;
                count ++;
            }
        }
        return field;
    }
    public int[][] calMine()
    {
        Random random = new Random();
        this.mine = new int[this.col][this.row];
        copyField();

        int calMine = (this.col * this.row)/4;
        while (calMine > 0)
        {
            int randomMine = random.nextInt(this.col * this.row);
            for(int i = 0; i < col; i++)
            {
                for (int j = 0; j < row; j++)
                {
                    if(this.mine[i][j] == randomMine)
                    {
                        this.mine[i][j] = -1;
                    }
                }
            }
            calMine --;
        }
        return mine;
    }

    public int[][] copyField()
    {
        for(int i = 0; i < this.col; i++)
        {
            for(int j = 0; j < this.row; j++)
            {
                mine[i][j] = field[i][j];
            }
        }
        return mine;
    }
}
