package player;

public abstract class  PlayerCharacter {
    private String charName;
    private int id;
    private int health;
    private int money;

    private int damage;

    public PlayerCharacter(int id, String charName,  int health, int money, int damage) {
        this.charName = charName;
        this.id = id;
        this.health = health;
        this.money = money;
        this.damage = damage;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
