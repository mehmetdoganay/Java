// Bu class örneğinde constructor metodları kullacağız.
class Computer {
    String cpu = "AMD 5500H";
    String gpu;
    String motherboard = "MSI abc"; // Varsayılan değer.
    String ram = "GeForce xyz"; // Varsayılan değer.

    // Burada bir metod oluşturduk (Kurucu metod)
    Computer(String motherboard, String ram, String cpu)
    {
        //Bu kurucu metodun içine Computer Classına ait 2 niteliğini aynı tür ve isimde verdim.
        //İsimlendirme aynı isimde yapılır.
        System.out.println(motherboard + ram);
        System.out.println(cpu); // Burada girilen parametre değerini yazdırır.
        System.out.println(this.cpu); // this kullanılırsa bu yerelde classın içinde tanımlanan varsayılan değeri gösterir.

    }
}
