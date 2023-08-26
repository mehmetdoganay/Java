package Inheritance;

public class Lecturer extends  Academician{
    private String kapiNo;
    public Lecturer(String name, String surname, String email, String phoneNumber, String bolum, String unvan,String kapiNo) {
        super(name, surname, email, phoneNumber, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo()
    {
        return this.kapiNo;
    }

    public void setKapiNo()
    {
        this.kapiNo = kapiNo;
    }




}
