public class Main {
    public static void main(String[] args) {
        Car volvo = new Car();
        // Car classından bir volvo adında bir nesne oluşturduk.
        volvo.model = "XC90";
        volvo.color ="Black";
        volvo.packet = "X";
        volvo.type = "Jeep";
        volvo.modelSeriNo = 20230001;
        volvo.topSpeed = 280;
        volvo.price = 125000;
        // burada ise volvo nesnesine özelliklerini atadık.
        volvo.increasePrice(12000);
        // Car classında tanımladığım metodu kullandım.
        // Bu metodda fiyat yükseltme işlemi yapılıyordu.
        System.out.println( volvo.model + " New Price " + volvo.price);

        Car bmw = new Car();
        bmw.model = "316D";
        bmw.type = "Sedan";
        bmw.packet = "Premium";
        bmw.color = "Orange";
        bmw.modelSeriNo =202300002;
        bmw.topSpeed = 300;
        bmw.price = 150000;
        // Burada da niteliklerin hepsini bmw nesnesi için kullandık
        bmw.increasePrice(40000);
        // bmwnin fiyat niteliğini daha önce tanımlanan metod ile 40 bin tl yükselttim.
        System.out.println(bmw.model + " New Price " + bmw.price);

        Computer hp = new Computer("y model ","x model","intel i5","GTX 1650 TI");
        // burada değerleri girdik.

        Computer asus = new Computer(); // Boş kurucu metot oluşuturarak da bir nesne oluşturabiliriz.
    }
}
