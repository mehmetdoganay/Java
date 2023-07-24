public class Main {

    static void printArray(int[][] arr)
    {
        for(int i = 0; i < arr.length;i++)
        {
            System.out.println();
            for (int j = 0; j < arr.length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[][] citys = new int[6][6]; // Multidimensional  arrays
        citys[0][0] = 0;
        citys[0][1] = 453;
        citys[3][4] = 544;
        System.out.println(citys[3][4]);

        int matris[][] = {
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };
        printArray(matris);



    }
}
