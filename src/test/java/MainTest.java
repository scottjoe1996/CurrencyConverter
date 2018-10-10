import com.company.CurrencyConversionMenu;
import com.company.InvalidChoice;
import org.testng.annotations.Test;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTest {

    @Test
    public void tryCatchCurrencyFrom() {
        int currencyFrom = 0;

        CurrencyConversionMenu currencyConversionMenu = new CurrencyConversionMenu();

        try {
            currencyFrom = new Scanner(System.in).nextInt();
        } catch (InputMismatchException exc) {
            System.out.println(exc);
        }
        try {
          currencyConversionMenu.displaySelectCurrencyMenu(currencyFrom);
        if (currencyConversionMenu.isValid(currencyFrom)) {
          throw new InvalidChoice();
        }
        } catch (InvalidChoice exc) {
            System.out.print(exc);
        }
    }
}