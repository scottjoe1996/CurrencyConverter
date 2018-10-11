import com.company.CurrencyConversionMenu;
import com.company.InvalidChoice;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.awt.AWTException;

public class MainTest {

    @Test
    public void tryCatchWrongIntCurrencyFrom() {
        int currencyFrom = 0;
        String actual = "";

        String expected = "Invalid choice, your options are 1, 2 or 3";

        CurrencyConversionMenu currencyConversionMenu = new CurrencyConversionMenu();

        try {
            currencyConversionMenu.displaySelectCurrencyMenu(currencyFrom);
            if (currencyConversionMenu.isValid(currencyFrom)) {
                throw new InvalidChoice();
            }
        } catch (InvalidChoice exc) {
            actual = "Invalid choice, your options are 1, 2 or 3";
        }
        Assert.assertEquals(actual, expected);
    }

}