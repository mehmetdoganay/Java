package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Book harryPoter = new Book("Harry Peter1", 185);
        Book lordOfRings = new Book("Lord Of Rings", -350);

        lordOfRings.setName("Lord Of Rings2");
        lordOfRings.setPageNumber(-350);

        harryPoter.setName("Harry Peter2");
        harryPoter.setPageNumber(124);

        System.out.println(lordOfRings.getName() + " " + lordOfRings.getPageNumber());
        System.out.println(harryPoter.getName() + " " + harryPoter.getPageNumber());


    }
}
