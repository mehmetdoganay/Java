package Inheritance;

public class It extends Officer{
    private String gorev;
    public It(String name, String surname, String email, String phoneNumber, String departman, String mesai,String gorev) {
        super(name, surname, email, phoneNumber, departman, mesai);
        this.gorev = gorev;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public void networkKurulum()
    {
        System.out.println(" network Kurulumu yapıldı.");
    }

    public void print()
    {
        System.out.println(this.getName()  + " " + this.getSurname());
        System.out.println("Mail " + this.getEmail());
        System.out.println("Telefon: " + this.getPhoneNumber());
        System.out.println("Depatrman: " + this.getDepartman());
        System.out.println("Mesai : " + this.getMesai());
        System.out.println("Görev : " + this.getGorev());
        System.out.println();
    }
}
