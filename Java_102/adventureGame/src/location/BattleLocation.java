package location;

import com.sun.jdi.Location;
import player.*;

import java.util.Random;
import java.util.Scanner;

public  class BattleLocation extends Location {
    Scanner input = new Scanner(System.in);


    public BattleLocation(Player player) {
        super(player, "Battle Location");
    }

    @Override
    boolean onLocation() {
        selectBattleLocation();
        return true;
    }

    public void selectBattleLocation()
    {
        System.out.println("****************************************** Savaş Alanı !******************************************");
        System.out.println(" Gitmek istediğin Bölgeyi Seç");
        System.out.println("***** Mağara ****");
        System.out.println("********* Nehir ********");
        System.out.println("***************** Orman ****************");
        System.out.print("--->");

        int selectLoc = input.nextInt();
        selectLocation(selectLoc);
    }

    public int selectLocation(int selectLocation)
    {
        BattleLocation battleLacation = null;

        int selectLoc = input.nextInt();
        switch (selectLoc)
        {
            case 1 :
                System.out.println();
            case 2 :
                System.out.println("River");
            case 3 :
                System.out.println("Forest");
            default:
                break;

        }
        return selectLocation;
    }

}
