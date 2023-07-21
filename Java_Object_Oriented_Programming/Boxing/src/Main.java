public class Main {
    public static void main(String[] args) throws InterruptedException {
        Fighter mehmet = new Fighter("Mehmet",100,65);
        Fighter ali = new Fighter("Ali",100, 72);

        Match match = new Match(mehmet,ali,60,80 );
        match.fight();
    }
}
