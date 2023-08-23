package Static_code_blocks;

public class Main {
    public static void main(String[] args) {
        System.out.println("Varsayılan counter değeri: " + User.counter);
        User p1 = new User("Mehmet");
        User p2 = new User("Elif");
        System.out.println("User Classından nesne üretildikten sornaki durum: " + User.counter);
    }
}
