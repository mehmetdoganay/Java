package Inheritance;

public class Officer extends Worker{
    private String departman;
    private String mesai;

    public Officer(String name, String surname, String email, String phoneNumber,String departman,String mesai) {
        super(name, surname, email, phoneNumber);
        this.departman = departman;
        this.mesai = mesai;
    }

    public String getDepartman()
    {
        return this.departman;
    }

    public void setDepartman(String departman)
    {
        this.departman = departman;
    }

    public String getMesai()
    {
        return this.mesai;
    }

    public void setMesai(String mesai)
    {
        this.mesai = mesai;
    }

    public void calis()
    {
        System.out.println(" Calıştı.");
    }

    public void giris()
    {
        System.out.println(getName() + " adlı memur üniveriteye giriş yaptı.");
    }
}
