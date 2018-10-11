import com.company.CurrencyConversionMenu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CurrencyConversionMenuTest {

    @Test
    public void testThatFalseIsReturnedIfInputIsOne() {
        CurrencyConversionMenu currencyConversionMenu = new CurrencyConversionMenu();
        assertFalse(currencyConversionMenu.verifyInput(1));
    }

    @Test
    public void testThatFalseIsReturnedIfInputIsTwo() {
        CurrencyConversionMenu currencyConversionMenu = new CurrencyConversionMenu();
        assertFalse(currencyConversionMenu.verifyInput(2));
    }

    @Test
    public void testThatIntAreTheSame() {
        int q = 20;
        CurrencyConversionMenu currencyConversionMenu = new CurrencyConversionMenu();
        assertEquals(q, currencyConversionMenu.mathCompare(-10));
    }

    @Test
    public void tryCatch() {

    }
}
