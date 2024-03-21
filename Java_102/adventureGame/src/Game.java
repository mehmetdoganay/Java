import com.sun.jdi.Location;
import location.BattleLocation;
import location.SafeHouse;
import location.ToolStore;
import player.Player;

import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);
    public void start()
    {
        System.out.println("Macera Oyununa Hoşgeldiniz.");
        System.out.print("Karakter ismi giriniz: ");
        String charName = input.nextLine();

        Player player = new Player();
        System.out.println("Güzel bir isim seçimi " + player.getPlayerName());
        System.out.println("Artık sana uygun bir Karakter seçmeye hazırsın.");
        player.selectCharacter();

        while (true)
        {
            Location location = null;
            System.out.println("Lokasyonlar");
            System.out.println("1 - Güvenli Ev");
            System.out.println("2 - Mağaza");
            System.out.println("3 - Savaş");
            System.out.print("Gitmek istediğin bölgeyi seç: ");
            int selectLoc = input.nextInt();
            switch (selectLoc)
            {
                case 1:
                    location = new Location(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new BattleLocation(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if(!location.onLocation())
            {
                System.out.println("GAME OVER");
                break;
            }

        }




    }
}
