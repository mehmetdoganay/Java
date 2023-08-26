package Inheritance;

public class Academician extends Worker{
    private String bolum;
    private String unvan;
    public Academician(String name, String surname, String email,String phoneNumber,String bolum,String unvan) {
        super(name, surname, email,phoneNumber); // super anahtar kelimesini kullanıp bir construuctor metod tanımlayarak
        //Worker sınıfından bir yani üst sınıfın niteliklerini alt sınıf olan Academican sınıfına aktarmış olduk.
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public void derseGir()
    {
        System.out.println(this.getName()  + " " + this.getSurname() + "Derse giriş yaptı");
    }

    public void print()
    {
        System.out.println(this.getName()  + " " + this.getSurname());
        System.out.println("Mail " + this.getEmail());
        System.out.println("Telefon: " + this.getPhoneNumber());
        System.out.println("Bölümü: " + this.getBolum());
        System.out.println("Uvanı: " + this.getUnvan());
        System.out.println();
    }
}
