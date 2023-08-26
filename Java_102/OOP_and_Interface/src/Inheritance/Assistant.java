package Inheritance;

public class Assistant extends Academician{
    private String ofisSaati;

    public Assistant(String name, String surname, String email, String phoneNumber, String bolum, String unvan, String ofisSaati) {
        super(name, surname, email, phoneNumber, bolum, unvan);
        this.ofisSaati = ofisSaati;
    }

    public String getOfisSaati() {
        return ofisSaati;
    }

    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }

    public void quizYap()
    {
        System.out.println("Quaiz yapıldı.");
    }
}
