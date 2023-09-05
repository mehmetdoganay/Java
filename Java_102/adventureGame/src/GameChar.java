public abstract class GameChar {
    private String charName;
    private int damage;
    private int health;
    private int money;

    public GameChar(String charName, int damage, int health, int money) {
        this.charName = charName;
        this.damage = damage;
        this.health = health;
        this.money = money;
    }
}
