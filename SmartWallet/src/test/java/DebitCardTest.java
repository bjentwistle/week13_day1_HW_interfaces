import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard;

    @Before
    public void setUp(){
        debitCard = new DebitCard("RBSDebit", 12345, "Sep2025", 987,  76543,"20-45-30", 1000);
    }

    @Test
    public void canLogTransactions(){
        double transaction1 = 10.00;
        double transaction2 = 30.00;
        debitCard.logTransactions(transaction1);
        debitCard.charge(transaction1);
        debitCard.logTransactions(transaction2);
        debitCard.charge(transaction2);
        assertEquals(2, debitCard.getTransactions().size());
        assertEquals(960.00, debitCard.getBalance(), 0.0);

    }
    @Test
    public void canGetBalance(){
        assertEquals(1000.00, debitCard.getBalance(), 0.0);
    }


}
