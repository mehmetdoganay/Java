public class Player {
    Inventory inventory;
    private int damage;
    private int health;
    private int money;
    private String name;

    public Player(int damage, int health, int money, String name) {
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.name = name;
    }

    public Player(String name ) {

        this.name = name;
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return health;
    }

    public void setHealthy(int healthy) {
        this.health = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void selectChar(int selectChar){

        switch (selectChar)
        {
            case 1:
                Ninja ninja = new Ninja(this.name,5,15,20);
                break;
            case 2:
                Okcu okcu = new Okcu(this.name,7,13,20);
                break;
            case 3:
                Sovalye sovalye = new Sovalye(this.name,5,20,20);
                break;
            case 4:
                Buyucu buyucu = new Buyucu(this.name,10,9,20);
                break;
            default:
                System.out.println("Yanlış bir giriş yaptın tekrar dene");

        }

    }
}
