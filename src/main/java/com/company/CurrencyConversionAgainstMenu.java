package com.company;

public class CurrencyConversionAgainstMenu {
    public void currencyTo(int what) {

        switch (what) {
            case 1:
                System.out.println("Choose the currency you want to convert to");
                System.out.println("  1. US Dollar");
                System.out.println("  2. Euro");
                System.out.println();
                break;
            case 2:
                System.out.println("Choose the currency you want to convert to");
                System.out.println("  1. Pound Sterling");
                System.out.println("  2. Euro");
                System.out.println();
                break;
            case 3:
                System.out.println("Choose the currency you want to convert to");
                System.out.println("  1. Pound Starling");
                System.out.println("  2. Dollar");
                System.out.println();
                break;
        }
    }

    public boolean isValid2(int ch) {
        if (ch == 1 | ch == 2) return false;
        else return true;
    }
}