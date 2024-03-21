package location;
import player.Player;

public class River extends BattleLocation {
    public String obstacle;

    public River(Player player, String locationName, String obstacle) {
        super(player);
        this.obstacle = obstacle;
    }
}
