import java.util.ArrayList;

public class PaymentCard extends Card{

    private int cardNumber;
    private String expiryDate;
    private int securityNum;
    private ArrayList<Double> transactions; //this doesn't need to be in the constructor arguments!

    public PaymentCard(String name, int cardNumber, String expiryDate, int securityNum){
        super(name);
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNum = securityNum;
        this.transactions = new ArrayList<Double>(); //declare the arraylist here.
    }

    public void logTransactions(double transaction){//as long as this method is public then all children can use it.
        transactions.add(transaction);
    }

    public ArrayList<Double> getTransactions() { //as long as this method is public then all children can use it.
        return transactions;
    }
}
