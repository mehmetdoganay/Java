public class Weapon {
    private  String name;
    private int id;
    private  int damage;
    private int price;

    public Weapon(String name,int id, int damage, int price)
    {
        this.name = name;
        this.damage = damage;
        this.price = price;
        this.id = id;
    }
    public static Weapon[] weapons()
    {
        Weapon[] weaponsList = new Weapon[3];
        weaponsList[0] = new Weapon("Bıçak",1,2, 25);
        weaponsList[1] = new Weapon("Kılıç",2,4, 14);
        weaponsList[2] = new Weapon("Ok",3,6, 16);
        return weaponsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

