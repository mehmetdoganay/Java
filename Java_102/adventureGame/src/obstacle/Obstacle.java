package obstacle;

public abstract class Obstacle {
    private String obstacleName;
    private int id;
    private int health;
    private int damage;

    public Obstacle(String obstacleName, int id, int health, int damage) {
        this.obstacleName = obstacleName;
        this.id = id;
        this.health = health;
        this.damage = damage;
    }

    public String getObstacleName() {
        return obstacleName;
    }

    public void setObstacleName(String obstacleName) {
        this.obstacleName = obstacleName;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
