public class SafeHouse extends  NormalLocation{

    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("------------------Güvenli evdesin------------------");
        System.out.println("------------------Canınız Yenilendi ! ------------------");
        return true;
    }
}