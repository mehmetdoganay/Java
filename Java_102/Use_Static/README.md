# <span style="color:#0080FF">Static Metodlar</span> vs. <span style="color:#8000FF">Instance Metodlar</span>

Java programlamada, "<span style="color:#0080FF">static</span>" anahtar kelimesi ile tanımlanan metotlar ve "<span style="color:#8000FF">non-static</span>" (instance) metotlar arasında bazı önemli farklar bulunmaktadır.

## <span style="color:#FFA500">Erişim Yolu</span>

- Static metotlar sınıf adıyla doğrudan çağrılabilir: <span style="color:#0080FF">SinifAdi.staticMetod()</span>
- Instance metotları ise bir nesne örneği üzerinden çağrılır: <span style="color:#8000FF">nesne.instanceMetod()</span>

## <span style="color:#FFA500">Bellek Kullanımı</span>

- Static metotlar bellekte sadece bir kopya bulundurur.
- Instance metotları ise her nesne örneği için ayrı bir kopya olarak bellekte yer kaplar.

## <span style="color:#FFA500">this Referansı</span>

- Static metotlar içinde "<span style="color:#0080FF">this</span>" kelimesi kullanılamaz, çünkü static metotlar nesne örneği olmadan çağrıldığı için anlamsızdır.
- Instance metotlarında ise "<span style="color:#8000FF">this</span>", mevcut nesneyi temsil eder.

## <span style="color:#FFA500">Bağlam</span>

- Static metotlar genellikle yardımcı fonksiyonlar, araç metotları veya sabit hesaplamalar gibi durumlar için kullanılır.
- Instance metotları ise nesne durumuna erişmek veya nesne üzerinde işlem yapmak için kullanılır.

## <span style="color:#FFA500">Çağrı Yolu</span>

- Static metotlar compile-time'da hangi metodu çağıracağınızı belirler.
- Instance metotları ise runtime'da hangi nesne üzerinden çağrılacağını belirler.

## <span style="color:#FFA500">Kalıtım</span>

- Static metotlar kalıtım yoluyla türetilen alt sınıflarda override edilemez, aynı isimli metotlar alt sınıfta kopya olarak görünür.
- Instance metotları ise alt sınıflarda override edilebilir.

Projenizin gereksinimlerine bağlı olarak, hangi tür metodları kullanmanız gerektiğini seçmelisiniz. Genel işlevleri ve nesne durumunu temsil eden metotlar için instance metotları tercih edilirken, genel hizmetler ve yardımcı fonksiyonlar için static metotlar kullanışlı olabilir.

# <span style="color:#FFA500">Static Metodlar vs. Instance Metodlar - Örnek Kod</span>
# 

Aşağıda, Java programlama dilinde static ve instance metodların nasıl kullanıldığını gösteren örnek bir kod bulabilirsiniz.

```java
public class MetodOrnek {

    // Static metot örneği
    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    // Instance metot örneği
    public int carp(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    public static void main(String[] args) {
        // Static metot kullanımı
        int toplam = MetodOrnek.topla(5, 3);
        System.out.println("Toplam: " + toplam);

        // Bir nesne örneği oluşturarak instance metot kullanımı
        MetodOrnek ornek = new MetodOrnek();
        int carpim = ornek.carp(4, 2);
        System.out.println("Çarpım: " + carpim);
    }
}
