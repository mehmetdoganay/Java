import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);
    public void start()
    {
        System.out.println("Macera Oyununa Hoşgeldiniz.");
        System.out.print("Karakter ismi giriniz: ");
        String charName = input.nextLine();
        Player player = new Player(charName);
        System.out.println("Güzel bir isim seçimi " + player.getPlayerName());
        System.out.println("Artık sana uygun bir Karakter seçmeye hazırsın.");
        player.selectCharacter();

    }
}
