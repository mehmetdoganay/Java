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

        System.out.println("Mayın Tarlası oyununa hoş gelidiniz.");



        for(int i = 0; i < this.col; i++)
        {
            for(int j = 0; j < this.row; j++)
            {

                System.out.print(" " + mine[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        updateMineCounts(mine);

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

        int[] pastCol = new int[(this.col * this.row) - (this.col * this.row)/4];
        int[] pastRow = new int[(this.col * this.row) - (this.col * this.row)/4];
        int counter = 0, winCount = 0 ;

        while (isBomb)
        {
            System.out.print("Satır sayısını girin: ");
            currentRow = input.nextInt();

            System.out.print("Sütun sayısını girin: ");
            currentCol = input.nextInt();

            pastRow[counter] = currentRow;
            pastCol[counter] = currentCol;
            counter ++;

            if(mine[currentRow][currentCol] == -1)
            {
                System.out.println("Mayın Patladı ! Oyun bitti. ");
                for(int i = 0; i < this.row ; i++)
                {
                    for(int j = 0; j < this.col; j++)
                    {
                        if(containsPastMove(pastRow, pastCol, i, j))
                        {
                            System.out.print(" * ");
                        }
                        else
                        {
                            System.out.print(" - ");
                        }
                    }
                    System.out.println();
                }
                isBomb = false;
            }
            else
            {
                int a = 0;
                winCount ++;
                for(int i = 0; i < this.row ; i++)
                {
                    for(int j = 0; j < this.col; j++)
                    {
                            if(containsPastMove(pastRow, pastCol, i, j))
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

                if(winCount == ((this.row * this.col) - ((this.row * this.col)/4)))
                {
                    System.out.println("Oyun Kazanıldı.");
                    for(int i = 0; i < this.col; i++)
                    {
                        for(int j = 0; j < this.row; j++)
                        {

                            if (mine[i][j] == -1)
                            {
                                System.out.print(" * ");
                            }
                            else {
                                System.out.print(" - ");
                            }
                        }
                        System.out.println();
                    }
                    isBomb = false;
                }
            }
        }
    }

    //Temas edilen Mayın adedi.
    public void updateMineCounts(int[][] mine)
    {
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
    }
    // Geçmişe dönük girilen değerleri sorgular.
    private boolean containsPastMove(int[] pastRow, int[] pastCol, int row, int col) {
        for (int i = 0; i < pastRow.length; i++) {
            if(pastRow[i] == 0 && pastCol[i] == 0)
            {
                return false;
            }
            else if (pastRow[i] == row && pastCol[i] == col) {
                return true;
            }
        }
        return false;
    }
    public int[][] calField()
    {
        this.field = new int[this.row][this.col];
        int count = 0;
        for(int i = 0; i < this.row; i++)
        {
            for(int j = 0; j < this.col; j++)
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
        this.mine = new int[this.row][this.col];
        copyField();

        int calMine = (this.row * this.col)/4;
        while (calMine > 0)
        {
            int randomMine = random.nextInt(this.col * this.row);
            for(int i = 0; i < row; i++)
            {
                for (int j = 0; j < col; j++)
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
        for(int i = 0; i < this.row; i++)
        {
            for(int j = 0; j < this.col; j++)
            {
                mine[i][j] = field[i][j];
            }
        }
        return mine;
    }
}
