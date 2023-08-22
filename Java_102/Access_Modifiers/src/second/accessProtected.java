package second;
import first.*;

public class accessProtected {
    public static void main(String[] args) {
        AccessPrivate accessPrivate = new AccessPrivate();
        accessPrivate.setValue();
        // accessPrivate.setPrivateValue();  *Private olduğu için hiç bir şekilde erişilemez kendi sınıfında olmadığı sürece
        //accessPrivate.setProtectedValue(); * Protected sadece kendi package içerisinde kullanılablir.

    }
}
