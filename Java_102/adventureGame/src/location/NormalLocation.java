package location;

import player.Player;

public class NormalLocation extends Location {

    public NormalLocation(Player player, String locationName)
    {
        super(player, locationName);
    }
    @Override
    boolean onLocation() {
        return true;
    }
}
