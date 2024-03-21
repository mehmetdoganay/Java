package location;

import location.NormalLocation;
import player.Player;

public class SafeHouse extends NormalLocation {

    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("------------------Güvenli evdesiniz------------------");
        System.out.println("------------------Canınız Yenilendi ! ------------------");
        System.out.println("------------------Çıkış için herhangi bir tuşa basın.------------------");

        input.nextLine();

        return true;
    }
}