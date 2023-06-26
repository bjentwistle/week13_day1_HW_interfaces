public class DebitCard extends PaymentCard implements IChargeable {

    private final int accountNum;
    private final String sortCode;
    private double balance;

    public DebitCard(String name, int cardNumber, String expiryDate, int securityNum, int accountNum, String sortCode, double balance){
        super(name, cardNumber, expiryDate, securityNum);
        this.accountNum = accountNum;
        this.sortCode = sortCode;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }
    //logTransactions from Parent can be used in test file.

    @Override
    public double charge(double amount) {
        return balance -= amount;
    }
}
