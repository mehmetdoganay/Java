    # Encapsulation Example - Book Class

Bu örnek, kapsülleme (encapsulation) ilkesini uygulamak yazılmış `Book` sınıfını içerir. Kapsülleme, sınıf içindeki verilerin gizlenmesi ve sadece belirlenmiş metotlar aracılığıyla erişilmesi anlamına gelir. Bu sınıf, kitap ismi ve sayfa sayısı gibi özellikleri saklamak ve yönetmek için kullanılır.

## Kullanım

1. `Book` sınıfı, `Encapsulation` paketi altında bulunur. Sınıf, `name` (kitap adı) ve `pageNumber` (sayfa sayısı) adında özel sınıf değişkenleri içerir.

2. Kurucu metot ile `name` ve `pageNumber` değerleri atanır:

    ```java
    public Book(String name, int pageNumber) {
        this.name = name;
        this.pageNumber = pageNumber;
    }
    ```

3. `getName` metodu ile kitap ismine erişebilirsiniz:

    ```java
    public String getName() {
        return this.name;
    }
    ```

4. `setName` metodu ile kitap ismini değiştirebilirsiniz:

    ```java
    public void setName(String name) {
        this.name = name;
    }
    ```

5. `getPageNumber` metodu ile sayfa sayısına erişebilirsiniz:

    ```java
    public int getPageNumber() {
        return this.pageNumber;
    }
    ```

6. `setPageNumber` metodu ile sayfa sayısını değiştirebilirsiniz. Bu metot içinde negatif değerler 0'a eşitlenir:

    ```java
    public void setPageNumber(int pageNumber) {
        if (pageNumber < 0) {
            pageNumber = 0;
        }
        this.pageNumber = pageNumber;
    }
    ```

## Örnek

```java
public class Main {

    public static void main(String[] args) {
        Book book = new Book("Java Programming", 300);
        
        System.out.println("Kitap Adı: " + book.getName());
        System.out.println("Sayfa Sayısı: " + book.getPageNumber());

        book.setName("Advanced Java Programming");
        book.setPageNumber(-50);

        System.out.println("Yeni Kitap Adı: " + book.getName());
        System.out.println("Yeni Sayfa Sayısı: " + book.getPageNumber());
    }
}
