//Car adında bir sınıf oluşturduk.
class Car {
    // Bu sınıfı modelleyelim.
    // Sınıfa nitelik verelim (Arabanın özelliklerini tanımlayalım)
    String type;
    String model;
    String color;
    String packet;
    int topSpeed;
    int price;
    int modelSeriNo;
    // !!!
    // bu şekilde aracın özelliklerini tanımladım ama değer vermedim.
    // Verebilirm ama Car classından nesne oluşturup değerler vermek daha doğru.
    // Çünkü burada belirtilen özellikleri bherhangi farklı birçok araç için tekrar tekrar kullanabilirm.
    // Ki Zaten Classlardaki amaçlardan biri de budur.

    void increasePrice(int increment)
    {
        price += increment;
    }
    // Burada da nitelik vermekten farklı olarak bir işlem yapıldı.
    // Yani bir metod yazdım ve nitelik olarak tanımladığım fiyatı
    // Metod yazarak günlecelleme işlemi yaptırabilirim.
}
//Şimdi Main adında yeni bir class oluşturduk ve o class içerisinde Buradaki Car classından bir nesne oluşuturacağız.
