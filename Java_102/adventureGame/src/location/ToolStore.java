package location;

import item.Armor;
import item.Weapon;
import location.NormalLocation;
import player.Player;

public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {

        selectCase();
        return true;
    }


    public void selectCase()
    {
        System.out.println("Mağazaya Hoşgeldin.");
        System.out.println("Yapmak istediğiniz işlemi seçin.");
        System.out.println("1 - Silahlar");
        System.out.println("2 - Zırhlar");
        System.out.println("3 - Çıkış");
        System.out.print("Seçim : ");


        int selectCase = input.nextInt();
        while (selectCase < 1 || selectCase > 3)
        {
            System.out.println("Geçersiz bir değer girdiğiniz.");
            selectCase = input.nextInt();
        }

        switch (selectCase)
        {
            case 1 :
                printWeapon();
                break;
            case 2 :
                printArmor();
                break;
            case 3:
                break;
        }
    }

    public void printWeapon()
    {
        System.out.println("------------------------------Silahlar------------------------------");
        System.out.println("Satın Almak istediğiniz Silahı seçin.");
        for (Weapon w : Weapon.weapons())
        {
            System.out.println(w.getId() +  " |  Ad   " +  w.getName() + " | Güç    " + w.getDamage() + " | Fiyat  " + "$" + w.getPrice() + " |");
        }
        System.out.print("Seçim ---> ");
        int selectWeapon = input.nextInt();
        selectWeapon(selectWeapon);

    }

    public static void selectWeapon(int select)
    {
        switch (select)
        {
            case 1 :
                System.out.println(" 1 Şuan envanter ve para oluşuturulmadı sadece taslak mevcut");
                break;
            case 2 :
                System.out.println(" 2 Şuan envanter ve para oluşuturulmadı sadece taslak mevcut");
                break;
            case 3 :
                System.out.println(" 3 Şuan envanter ve para oluşuturulmadı sadece taslak mevcut");
                break;
            default:
                System.out.println(" 1 Şuan envanter ve para oluşuturulmadı sadece taslak mevcut");
        }
    }

    public void printArmor()
    {
        System.out.println("------------------------------Zırhlar------------------------------");
        System.out.println("Satın Almak istediğiniz Zırhı seçin.");
        for (Armor arm : Armor.armors())
        {
            System.out.println(arm.getId() +  " |  Ad   " +  arm.getName() + " | Güç    " + arm.getDefance() + " | Fiyat  " + "$" + arm.getPrice() + " |");
        }
        System.out.print("Seçim ---> ");
        int selectArmor = input.nextInt();
        selectArmor(selectArmor);
    }

    public static void selectArmor(int select)
    {
        switch (select)
        {
            case 1 :
                System.out.println(" 1 Şuan envanter ve para oluşuturulmadı sadece taslak mevcut");
                break;
            case 2 :
                System.out.println(" 2 Şuan envanter ve para oluşuturulmadı sadece taslak mevcut");
                break;
            case 3 :
                System.out.println(" 3 Şuan envanter ve para oluşuturulmadı sadece taslak mevcut");
            default:
                System.out.println(" 1 Şuan envanter ve para oluşuturulmadı sadece taslak mevcut");
        }
    }
}
