package Use_Interface;

public interface IBank {
    final String hostİpAddress = "127.1.1.1";
    public boolean connect(String ipAddress);
    public boolean payment(String price, String carNumber, String expriyDate, String cvcNumber );
}
