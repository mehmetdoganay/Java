public class Forest extends BattleLocation{
    public String obstacle;

    public Forest(Player player, String locationName, String obstacle) {
        super(player);
        this.obstacle = obstacle;
    }
}
