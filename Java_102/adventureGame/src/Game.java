import java.util.Scanner;

public class Game {
        Location location ;
        Player player;

    private Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("---Welcome my Adventure Game---");
        //Karakter ad Seçimi
        System.out.print("Karakter Adı : ");
        String playerName = input.nextLine();
        Player player1 = new Player(playerName);
        System.out.println(player1.getName() + " olarak karakter adı başarılı şekilde kaydedildi.");

        //Karakter Seçimi
        System.out.println("Sırada Karakter Seçimi var.");
        System.out.println("1 - Ninja");
        System.out.println("2 - Okçu");
        System.out.println("3 - Şovalye");
        System.out.println("4 - Büyücü");
        int selectChar = input.nextInt();
        player1.selectChar(selectChar);
        player1.getName();

    }
}
