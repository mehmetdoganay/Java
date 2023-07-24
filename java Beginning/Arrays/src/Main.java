public class Main {

    static void printArray(int[] array)
    {
        for (int i = 0; i <= array.length -1; i++)
        {
            System.out.println("printArray Method: "+array[i]);

        }
    }
    static void printArray(double[] array)
    {
        for (int i = 0; i <= array.length -1; i++)
        {
            System.out.println("printArray Method: "+array[i]);

        }
    }

    static int[] reverse(int[] arr)
    {
        int[] reverse = new int[arr.length];
        for(int i = 0, j = arr.length - 1;  i <= arr.length-1; i++,j--)
        {
            reverse[i] = arr[j];
        }
        return reverse;
    }
    public static void main(String[] args) {
        int[] list = new int[10];
        list[0] = 2;
        list[1] = 5;
        list[2] = 99;
        list[3] = 22;
        list[4] = 7;
        System.out.println(list[3]);

        int[] list3 = {0,8,4,4,7};
        printArray(list3);

        double[] doubleList = {7.4,8.9,4.0,1.7,6.4};
        printArray(doubleList);

        int[] reverse = reverse(list3);
        printArray(reverse);

    }
}
