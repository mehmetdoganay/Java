import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorCompletionService;


public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight,int maxWeight)
    {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void fight() throws InterruptedException {
        if(checkWeight())
        {
            Random random = new Random();
            for(int i = 1; i < 4; i++)
            {
                System.out.println("********** " + i + " **********");
                time();
            }
            System.out.println("********** Fight ! **********");
            while (!isWin())
            {
                boolean punch = random.nextBoolean();
                int hit = random.nextInt(50);

                System.out.println(this.f1.name+ " is health: \t" + this.f1.health);
                System.out.println(this.f2.name + " is health: \t"+this.f2.health);
                time();
                if(punch)
                {
                    System.out.println("********* Attack From: \t" + this.f1.name + "\t +" + hit + " ! *********");
                    isCriticalAttack(hit);
                    this.f2.health -= hit;
                    System.out.println( this.f2.name + " health: \t" + this.f2.health + " !");
                }
                else
                {
                    System.out.println("********* Attack From: \t"  + this.f2.name + "\t +" + hit + " !");
                    isCriticalAttack(hit);
                    this.f1.health -= hit;
                    System.out.println(this.f1.name + " health: \t" + this.f1.health + " ! *********");
                }
                System.out.println();
                System.out.println("###################################################");
                System.out.println();
            }
        }
        else
        {
            System.out.println(" Match is cancel !");
        }
    }

    void time() throws InterruptedException {
        Thread.sleep(1000);
    }

    boolean isCriticalAttack(int attack)
    {
        if(attack > 40)
        {
            System.out.println("Critical Attack !!!");
            return true;
        }
        else
            return false;

    }
    boolean isWin()
    {
        if(this.f1.health <= 0)
        {
            System.out.println("Winner: " + this.f2.name);
            return true;
        }
        else if(this.f2.health <= 0)
        {
            System.out.println("Winner: " + this.f1.name);
            return true;
        }
        return false;
    }

    boolean checkWeight()
    {
        return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) && (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
    }
}
