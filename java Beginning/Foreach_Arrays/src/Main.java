public class Main {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7};
        for(int num: list)
        {
            System.out.println(num);
        }

        String[][] cars = {
                {"BMW","Toyota","Volvo"},
                {"320i","Corolla","S90"},
                {"520","Auris","s60"}
        };

        for(String[] row : cars)
        {
            for (String col: row)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
