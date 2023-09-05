public class Inventory {
    private boolean water;
    private boolean food;
    private boolean fireWood;
    private String weaponName;
    private String armorName;
    private int weaponDamage;
    private int armorDefance;

    public Inventory(boolean water, boolean food, boolean fireWood, String weaponName, String armorName, int weaponDamage, int armorDefance) {
        this.water = water;
        this.food = food;
        this.fireWood = fireWood;
        this.weaponName = weaponName;
        this.armorName = armorName;
        this.weaponDamage = weaponDamage;
        this.armorDefance = armorDefance;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFireWood() {
        return fireWood;
    }

    public void setFireWood(boolean fireWood) {
        this.fireWood = fireWood;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getArmorDefance() {
        return armorDefance;
    }

    public void setArmorDefance(int armorDefance) {
        this.armorDefance = armorDefance;
    }
}
