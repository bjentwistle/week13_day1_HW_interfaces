public class CreditCard extends PaymentCard implements IChargeable{

    private double availableCredit;
    private double transactionPercentage;

    public CreditCard(String name, int cardNumber, String expiryDate, int securityNum, double availableCredit, double transactionPercentage){
        super(name, cardNumber, expiryDate, securityNum);
        this.availableCredit = availableCredit;
        this.transactionPercentage = transactionPercentage;
    }

    public double getAvailableCredit(){
        return availableCredit;
    }

    //logTransactions from Parent can be used in test file.

//    public double addsPercentAndReturnsAvail(double transaction, double percentage){
//      double cost = transaction * percentage;
//      return availableCredit -= cost;
//    }

    @Override
    public double charge(double amount) {
        double cost = amount * transactionPercentage;
        return availableCredit -= cost;
    }
}
