package item;

public class  Armor {
    private  String name;
    private int id;
    private  int defance;
    private int price;

    public Armor(String name, int id, int defance, int price) {
        this.name = name;
        this.id = id;
        this.defance = defance;
        this.price = price;
    }

    public static Armor[] armors()
    {
        Armor[] armorlist = new Armor[3];
        armorlist[0] = new Armor("Çelik Zırh",1,2, 5);
        armorlist[1] = new Armor("Titanyum Zırh",2,4, 7);
        armorlist[2] = new Armor("Büyülü Zırh",3,6, 12);
        return armorlist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDefance() {
        return defance;
    }

    public void setDefance(int defance) {
        this.defance = defance;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}

