package Use_Interface;

public class BBank implements IBank{

    private String bankName;
    private String terminalId;
    private String password;

    public BBank(String bankName, String terminalId, String password) {
        this.bankName = bankName;
        this.terminalId = terminalId;
        this.password = password;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress)
    {
        System.out.println("Kullanıcı ip: " + ipAddress);
        System.out.println("Makina ip: " + this.hostİpAddress);
        if(ipAddress == hostİpAddress)
        {
            return true;
        }
        return false;
    }

    @Override
    public boolean payment(String price,String cardNumber,String expriyDate,String cvcNumber) {
        System.out.println("Ödeme işlemi bekleniyor");
        System.out.print(".");
        System.out.print(".");
        System.out.println(".");
        System.out.println("Ödeme işlemi başarılı");
        return true;
    }
}
