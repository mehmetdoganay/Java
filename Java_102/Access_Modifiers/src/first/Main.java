package first;

public class Main {
    public static void main(String[] args) {
        AccessPrivate accessPrivate = new AccessPrivate();

        // accessPrivate.setPrivateValue(); Exept= java: setPrivateValue() has private access in first.AccessPrivate
        accessPrivate.setValue();
        accessPrivate.setProtectedValue();



    }

}
