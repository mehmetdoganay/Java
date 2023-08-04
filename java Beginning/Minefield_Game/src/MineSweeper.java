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
        int col,row;
        boolean isBomb = true;

        calField();
        calMine();

        System.out.println("Mayın Tarlası oyununa hoş gelidiniz.");

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

        for(int i = 0 ; i <= this.col ; i++)
        {
            for(int j = 0 ; j <= this.row ; j++)
            {

                if(mine[i][j] == -1)
                {
                    for(int k = i -1; i <= i + 1; i++)
                    {
                        for(int t = j -1; j <= j + 1; j++)
                        {

                            mine[i][j] = 1;
                        }

                    }
                }
            }

        }


        while (isBomb)
        {
            System.out.print("Satır sayısını girin: ");
            row = input.nextInt();
            System.out.print("Sütun sayısını girin: ");
            col = input.nextInt();

            if(mine[row][col] == -1)
            {
                System.out.println("Mayın Patladı ! Oyun bitti. ");
                isBomb = false;
            }
            else
            {
                System.out.println("Girilen değer:  " + field[row][col]);
                for(int i = col -1; i <= col + 1; i++)
                {
                    for(int j = row -1; j <= row + 1; j++)
                    {

                        if(field[row][col] != mine[i][j])
                        {
                            if(mine[i][j] == -1)
                            {

                            }
                        }
                    }

                }
            }

            for(int i = 0; i < this.col; i++)
            {
                for(int j = 0; j < this.row; j++)
                {
                    /*
                    if (field[i][j] == -1)
                    {
                        System.out.print(" " + field[i][j] + " ");
                    }
                    else {
                        System.out.print(" - ");
                    }

                     */
                    System.out.print(" " + field[i][j] + " ");
                }
                System.out.println();
            }
        }

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
}
