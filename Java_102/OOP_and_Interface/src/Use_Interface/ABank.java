package Use_Interface;

public class ABank implements IBank {
    private String bankName;
    private String terminalId;
    private String password;

    public ABank(String bankName,String terminalId,String password)
    {
        this.bankName = bankName;
        this.terminalId = terminalId;
        this.password = password;
    }

    String getBankName()
    {
        return bankName;
    }

    public void setBankName(String bankName)
    {
        this.bankName = bankName;
    }

    String getTerminalId()
    {
        return bankName;
    }

    public void setTerminalId(String terminalId)
    {
        this.terminalId = terminalId;
    }

    String  getPassword()
    {
        return  bankName;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }


    // Bu iki metod  IBank adındaki İnterface içierisinde olışturulmuş metodları implemente etmiştir.
    // yani kendi classına uygun biçimde düzenleyip kullanmak için Interade oluşuturulan şablon metodları kullanmıştır.
    @Override
    public boolean connect(String ipAddress) {
        if(ipAddress == hostİpAddress)
        {
            return true;
        }
        return false;
    }

    @Override
    public boolean payment(String price, String carNumber, String expriyDate, String cvcNumber) {
        return false;
    }

}
