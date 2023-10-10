import java.util.Scanner;
public class Player {

    private String charName;
    private String playerName;
    private int id;
    private int health;
    private int money;
    private int damage;

    public Player(String playerName) {
        this.playerName = playerName;
    }
    public void selectCharacter()
    {
        Scanner input = new Scanner(System.in);
        Samurai samurai = new Samurai();
        Archer archer = new Archer();
        Knight knight = new Knight();

        PlayerCharacter[] playerCharacters = {new Samurai(), new Archer(),new Knight()};
        for (PlayerCharacter players : playerCharacters) {
            System.out.println("------------------------------------------");
            System.out.println("Karakter "+ players.getId()+ " - " +players.getCharName() + " " +
                    "\t " + "Hasar: "+ players.getDamage() + " - " +
                    "\t " + "Sağlık: " +players.getHealth() + " - " +
                    "\t " + "Para: " +players.getMoney());
        }

        int selectCharacter = input.nextInt();
        switch (selectCharacter){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3 :
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
                break;
        }
        System.out.println("Seçilen Karakter.");
        System.out.println("İsim: \t" + this.getCharName() + " \t Hasar: \t" + this.getDamage() + " \t Sağlık: \t" + this.getHealth()+ " \t Para: \t" + this.getMoney() );
    }
    public void initPlayer(PlayerCharacter playerCharacter)
    {
        this.setId(playerCharacter.getId());
        this.setCharName(playerCharacter.getCharName());
        this.setDamage(playerCharacter.getDamage());
        this.setHealth(playerCharacter.getHealth());
        this.setMoney(playerCharacter.getMoney());

    }
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
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
