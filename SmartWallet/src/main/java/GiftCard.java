public class GiftCard extends Card implements IChargeable {

    private double balance;

    public GiftCard(String name, double balance) {
        super(name);
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public double charge(double amount) {
            return balance -= amount;
    }

}
