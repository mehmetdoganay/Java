package Inheritance;

public class LabAssistant extends Assistant {
    public LabAssistant(String name, String surname, String email, String phoneNumber, String bolum, String unvan, String ofisSaati) {
        super(name, surname, email, phoneNumber, bolum, unvan, ofisSaati);
    }

    public void lablaraGiris()
    {
        System.out.println("Labratuvara giriş yaptı.");
    }

    public void derseGir(){
        System.out.println(" Derse giriş yaptı.");
    }
}
