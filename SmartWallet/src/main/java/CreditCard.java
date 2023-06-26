public class CreditCard extends PaymentCard{

    private double availablecredit;

    public CreditCard(String name, int cardNumber, String expiryDate, int securityNum, double availablecredit){
        super(name, cardNumber, expiryDate, securityNum);
        this.availablecredit = availablecredit;
    }

    public double getAvailableCredit(){
        return availablecredit;
    }

    //logTransactions from Parent can be used in test file.

    public double addsPercentAndReturnsAvail(double transaction, double percentage){
      double cost = transaction * percentage;
      return availablecredit -= cost;
    }

}
