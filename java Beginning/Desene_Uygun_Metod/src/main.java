import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int patternNumber = input.nextInt();
        createPattern(patternNumber,patternNumber,-1);
    }

    static void createPattern(int variableNum,int fixedNumber, int processNum)
    {
        if(variableNum > fixedNumber) return;
        if(variableNum < 1) processNum *=-1;
        System.out.println(" "+variableNum+" ");
        createPattern(variableNum + processNum*5,fixedNumber,processNum);
    }
}
