import java.util.Arrays;

public class Main {

    static boolean isRepeat(int[] newList, int value)
    {
        for(int num: newList)
        {
            if(num == value)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {3,7,0,3,10,22,3,2,9,10,18,6,21,1,33,9,1,2,18};
        int[] newList = new int[list.length];
        int counter = 0;

        for(int i = 0; i < list.length; i++)
        {
            for(int j = 0; j < list.length ; j++)
            {
                if((i != j) && (list[i] == list[j]))
                {
                    if(!isRepeat(newList,list[i]))
                    {
                        newList[counter++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.print("Tekrar Eden sayılar çift sayılar:  " );
        for(int value : newList)
        {
            if((value != 0) && (value % 2 == 0))
            {
                System.out.print( value + " ");
            }
        }
    }
}
