package Inheritance;

public class Security extends Officer{
    private String belge;
    public Security(String name, String surname, String email, String phoneNumber, String departman, String mesai,String belge) {
        super(name, surname, email, phoneNumber, departman, mesai);
        this.belge = belge;
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }

    public void nobet()
    {
        System.out.println( "Nöbet tutuldu.");
    }
}
