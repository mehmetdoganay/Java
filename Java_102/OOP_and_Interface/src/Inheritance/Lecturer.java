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

    // Lecture sınıfı Academician sınıfından miras aldığı Metodları ve nitelikleri kullanılır.
    // Academician sınfı giris metodunu Worker sınıfından aldı daha sonra Academician sınıfında Overriding işlemi yaparak Metodu academician sınıfına özel olarak tekrar tanımladık
    // Lecture sınıfını ise Academician sınıfından aldığımız için Academician sınıfınfa Overriding edilmiş giris metodunu almış oldu.
    // miras olarak aldığımız giris metodunu Lecturet sınıfınfa tekrardan Overriding işlemi yaptık.
    @Override
    public void giris()
    {
        System.out.println(getName() + " " + getSurname() + " " + " adlı Öğretim görevlisi giriş yaptı." );
    }


}
