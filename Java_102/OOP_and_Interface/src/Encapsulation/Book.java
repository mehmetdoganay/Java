package Encapsulation;

public class Book {
    // Kapsulleme işleme için Class değişkenlerini erişilemez yapıp sadece metodlar üzerinden erişilmeyi sağlamak.
    private String name;
    private int pageNumber;

    public Book(String name,int pageNumber)
    {
        this.name = name;
        this.pageNumber = pageNumber;
    }

    // name erişimi için getName metodu oluşturulur (getter ve setter) get getirmek anlamında.
    public String getName()
    {
        return this.name;
    }

    // setName değiştirmek anlamındadır set Metodlar void metodlardır geriyed değer döndürmez sadece değiştirir.
    public void setName(String name)
    {
        this.name = name; // içerideki değeri dışarıdaki ile değiştirdik.
    }

    // pageNumber get metodu
    public int getPageNumber()
    {
        return this.pageNumber;
    }
    public void setPageNumber(int pageNumber)
    {
        if(pageNumber < 0)
        {
            pageNumber = 0;
        }
        this.pageNumber = pageNumber;
    }
}
