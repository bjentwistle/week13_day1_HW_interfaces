import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    CreditCard creditCard;
    @Before
    public void setUp(){
        creditCard = new CreditCard("Visa Credit", 54321, "Oct 2027", 908,  100);
    }
    @Test
    public void canGetAvailableCredit(){
        assertEquals(100.00, creditCard.getAvailableCredit(), 0.0);
    }

    @Test
    public void reducesAvailableCredit(){
        assertEquals(89.80, creditCard.addsPercentAndReturnsAvail(10.00, 1.02), 0.0);
    }

//    @Test
//    public void canLogTransactions(){
//        double transaction1 = 10.00;
//        double transaction2 = 30.00;
//        creditCard.logTransactions(transaction1);
//        creditCard.logTransactions(transaction2);
//        assertEquals(2, creditCard.getTransactions().size());
//    }
}
