package Inheritance;

// Bir metodu abstraction yapılacaksa metodun bulunduğu sınıfta Abstruction olmalı.
public abstract class Academician extends Worker{
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

    // Worker sınıfına ait olan giris metodunun aynısını aynı parametre ile acamedician sınıfında yazarak Overriding(Ezme) işlemi gerçekleştirdik
    // Override işlemi gerçekleştirildi
    @Override
    public void giris()
    {
        System.out.println(getUnvan() + " " + getName() + " " + getSurname() +" adlı akademisyen okula giriş yaptı");
    }

    // Abstruction metodların bodysi boştur.
    public abstract void derseGir(String girisSaat);


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
