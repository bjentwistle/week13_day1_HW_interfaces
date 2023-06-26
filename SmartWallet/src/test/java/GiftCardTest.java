import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {
    private GiftCard giftcard;

    @Before
    public void before() {
        giftcard = new GiftCard("WHSMith", 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("WHSMith", giftcard.getName());
    }

    @Test
    public void hasBalance() {
        assertEquals(10.00, giftcard.getBalance(), 0.0);
    }

    @Test
    public void canReduceBalance() {
        assertEquals(5.00, giftcard.charge(5.00), 0.0);
    }


}
