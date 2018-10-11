//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class CurrencyCalculationsSwitchTestPound {
//
//    @Test
//    public void poundTest() {
//        int switchtest;
//        double amount = 100;
//        String actualcase1 = "", actualcase2 = "";
//
//        String expectedcase1 = "\n" + amount + " pounds converts to " + amount * 1.3 + " US dollars";
//        String expectedcase2 = "\n" + amount + " pounds converts to " + amount * 1.14 + " euros";
//        for (switchtest = 1; switchtest <= 2; switchtest++) {
//            switch (switchtest) {
//                case 1:
//                    actualcase1 = "\n" + amount + " pounds converts to " + amount * 1.3 + " US dollars";
//                    break;
//                case 2:
//                    actualcase2 = "\n" + amount + " pounds converts to " + amount * 1.14 + " euros";
//            }
//        }
//        Assert.assertEquals(actualcase1, expectedcase1);
//        Assert.assertEquals(actualcase2, expectedcase2);
//    }
//}
