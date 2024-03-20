public class Cave extends BattleLocation {

    public String obstacle;

    public Cave(Player player, String locationName, String obstacle) {
        super(player);
        this.obstacle = obstacle;
    }
}
