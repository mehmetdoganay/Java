// Bu class örneğinde constructor metodları kullanacağız.
class Computer {
    String cpu;
    String gpu;
    String motherboard ;
    String ram ;

    // Burada bir metod oluşturduk (Kurucu metod)
    Computer(String motherboard, String ram, String cpu, String gpu)
    {
        this.cpu = "AMD 5500H"; // Varsayılan değer.
        this.gpu = "GTX 4090"; // Varsayılan değer.
        this.motherboard = "MSI abc"; // Varsayılan değer.
        this.ram = "GeForce xyz"; // Varsayılan değer.
        // classın nitelikleri olan bu 4 değeri kurucu metod içerisinde this anahtar kelimesi ile varsayılan bir değer Ataması yaptık.
        // Bu atama class için tanımlarkende yapılabilirdi ama bu işemlere varsayılan değer ataması kurucu metod üzerinden yukarıdaki gibi yapılır.

        //Bu kurucu metodun içine Computer Classına ait 2 niteliğini aynı tür ve isimde verdim.
        //İsimlendirme aynı isimde yapılır.
    }

    Computer(){
        System.out.println("Boş kurucu metot");
    }

    void printInfo()
    {
        System.out.println("Ram: \t" + this.ram);
        System.out.println("Motherbord: \t" + this.motherboard);
        System.out.println("CPU: \t" + this.cpu);
        System.out.println("GPU: \t" + this.gpu);
    }
}
