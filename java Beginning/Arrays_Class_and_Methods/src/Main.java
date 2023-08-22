import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {1,2,4,66,6,5,3,2};
        double[] doubleList = {1.3,45.2,55.4,77,3.12,4};
        System.out.println(Arrays.toString(doubleList)); // diziyi  yazdırır.Arrays.fill(list,20); // tüm elemanlarını 20 ile değiştirdik

        // Arrays.fill();
        Arrays.fill(list, 20); // list dizisindeki tüm elemanların değerini 20 yaptık
        System.out.println(Arrays.toString(list)); // [20, 20, 20, 20, 20, 20, 20, 20]

        //Arrays.sort();
        // Elemanları küçükten büyüğe sıralar
        Arrays.sort(doubleList);
        System.out.println(Arrays.toString(doubleList)); // [1.3, 3.12, 4.0, 45.2, 55.4, 77.0]

        //Arrays.binarySearch();
        // dizinin içerisinde senin belirlediğin değerin kaçınıcı sırada olduğunu yazdırır.
        System.out.println(Arrays.binarySearch(doubleList,1.3)); // 0
        System.out.println(Arrays.binarySearch(doubleList,55.4)); // 4


        //Arrays.copyOf();
        //Diziyi başka bir diziye koplaylar.
        int[] copy = Arrays.copyOf(list,list.length);
        System.out.println(Arrays.toString(copy)); // [20, 20, 20, 20, 20, 20, 20, 20]

        //Arrays.equals()
        // iki sizi parametresi alır ve bu diziler birbirine eşitmi eşit değilmi true veya false döndürür.
        System.out.println(Arrays.equals(list,copy)); // true

    }
}
