import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void findDuplicateElements(int[] arr)
    {
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();

        for(int num : arr)
        {
            if(frequencyMap.containsKey(num)) // num anahtarı var mı ?
            {
                int currentFrequency = frequencyMap.get(num); // num değerine ait frekansı atadık
                frequencyMap.put(num,currentFrequency + 1); // num değerine ait frekansi 1 artırdık.
            }
            else {
                frequencyMap.put(num, 1); // yoksa değer 1 kalsın
            }
        }
        for(Map.Entry<Integer,Integer> entry : frequencyMap.entrySet())
        {
                System.out.println( entry.getKey() + " sayısı " + entry.getValue() + " kez tekrar edmiştir.");
        }
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        findDuplicateElements(list);
    }
}
