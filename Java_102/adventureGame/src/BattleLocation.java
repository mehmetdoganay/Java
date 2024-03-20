import javax.sound.midi.Soundbank;
import java.util.SortedMap;

public class BattleLocation extends Location {

    public BattleLocation(Player player) {
        super(player, "Battle Location");
    }

    @Override
    boolean onLocation() {
        System.out.println("****************************************** Savaş Alanı !******************************************");
        System.out.println(" Gitmek istediğin Bölgeyi Seç");
        System.out.println("***** Mağara ****");
        System.out.println("********* Nehir ********");
        System.out.println("***************** Orman ****************");
        System.out.print("--->");
        int selectLoc = input.nextInt();
        switch (selectLoc)
        {
            case 1 :

        }
        return true;
    }





}
