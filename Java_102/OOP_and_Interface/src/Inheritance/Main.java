package Inheritance;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("Mehmet","Doğanay","mehmetdganay@gmail.com","0545 555 55 55");
        w1.print();
        w1.giris();
        w1.yemekhane();
        w1.cikis();

        // Kalıtım yapılan akademisyen sınıfından nesne üretimi

        Academician academician1 = new Academician("İlber","Ortaylı","ilberortaylı@gmail.com","0545 555 55 55","Tarih"," Prof Dr. ");
        academician1.print();
        academician1.giris();
        academician1.yemekhane();
        academician1.cikis();

        It it1 = new It("Ali","Demir","alidemir@gmail.com","0555 555 55 55","IT1","35","Backand");
        it1.print();
        it1.giris();
        it1.cikis();
        it1.calis();
    }
}
