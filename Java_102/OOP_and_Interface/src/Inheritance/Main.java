package Inheritance;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("Mehmet","Doğanay","mehmetdganay@gmail.com","0545 555 55 55");
        w1.print();
        w1.giris();
        w1.yemekhane();
        w1.cikis();

        // Kalıtım yapılan akademisyen sınıfından nesne üretimi

        //Academician academician1 = new Academician("İlber","Ortaylı","ilberortaylı@gmail.com","0545 555 55 55","Tarih"," Prof Dr. ");
        //academician1.print();
        //academician1.giris();
        //academician1.yemekhane();
        //academician1.cikis();

        It it1 = new It("Ali","Demir","alidemir@gmail.com","0555 555 55 55","IT1","35","Backand");
        it1.print();
        it1.giris();
        it1.cikis();
        it1.calis();

        Lecturer l = new Lecturer("Kemal","Sunal","kemalsunal@gmail.com","0555 545 54 54","Öğrenci işleri","18,00","12");
        l.derseGir("11,00");


        // Polimorfizm (Çok biçimlilik)
        // Çalışna sınıfına akademisyen gibi davran deniyor
        // Worker sınıfındaki giris metodu Academician sınıfında Override edildiği için kullanabiliyoruz.
        //Worker a1 = new Academician("Celal","Şengör","celalşengör@gmail.com","0545 434 23 23","Jeoloji","Prof Dr.");
        //a1.giris();

        //Polimorfizm örneği
        // Worker ata sınıfında bulunan giris metodu Overridinng edilmiş alt sınıfların giris metodları Worker sınıfına ait bir metodda giris metodu çağırılarak
        // Alt sınıfların Overriding edilmiş metodlarını çağırmış yapın Polimorfizim örneği kullanmış olundu.
        System.out.println("Polimorfizm Örneği");
        Worker[] loginUser = {it1,w1};
        Worker.girisYapanlar(loginUser);

        // Abstraction Nedir ?
        // Abstraction (Soyutlama) verilen örnekteki sınıflar içerisinde genel sınıflar ve genel sınıflardan üretilen asıl nesne üretilmesi doğru olan sınıflar vardır.
        // Örneği Worker - Academician ve Officer bunlar genel sınıflardır ve bu sınıflardan nesne üretme mantıklı değildir çünkü akademisyen sınıfının altında bulunan
        // Lecture - Assistant - LabAssitant Academician sınıfının alt dallarıdır Academician daha genel bir Sınıftır ve amacı altındaki sınıflara kalıtım miras sağlamaktır.
        // Academican - Worker ve Officer metodlarında nesne üretimini engellemek için de Abstruction devreye girer.
        // Bir metodu abstraction yapılacaksa metodun bulunduğu sınıfta Abstruction olmalı.
        // Abstruction edilmiş metoddan nesne üretemessin.


    }
}
