import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WalletTest {

    Wallet wallet;
    IChargeable creditCard;
    IChargeable debitCard;
    IChargeable giftCard;

    @Before
    public void setUp(){
        wallet = new Wallet();
        creditCard = new CreditCard("Visa Credit", 54321, "Oct 2027", 908,  100, 1.02);
        debitCard = new DebitCard("RBSDebit", 12345, "Sep2025", 987,  76543,"20-45-30", 1000);
        giftCard = new GiftCard("WHSMith", 10.00);
    }

    @Test
    public void canAddNewChargeable(){
        wallet.addNewCard(creditCard);
        wallet.addNewCard(debitCard);
        wallet.addNewCard(giftCard);
        assertEquals(3, wallet.getNumChargeables());
    }

    @Test
    public void hasSelectedChargeable(){
        wallet.addNewCard(creditCard);
        wallet.setSelectedChargeable(0);
        assertEquals(true, wallet.isSelectedChargeable(creditCard));
    }

    @Test
    public void canPayWithSelectedChareable(){
        wallet.addNewCard(giftCard);
        wallet.setSelectedChargeable(0);
        assertEquals(0.0, wallet.payWithSelectedChargeable(10.00), 0.0);

    }
}
