package com.company;

public class CurrencyConversionAginstMenu {
    public void currencyTo(int what) {
        System.out.println("\n");

        switch (what) {
            case 1:
                System.out.println("Choose the currency you want to convert to");
                System.out.println("  1. US Dollar");
                System.out.println("  2. Euro");
                break;
            case 2:
                System.out.println("Choose the currency you want to convert to");
                System.out.println("  1. Pound Sterling");
                System.out.println("  2. Euro");
                break;
            case 3:
                System.out.println("Choose the currency you want to convert to");
                System.out.println("  1. Pound Starling");
                System.out.println("  2. Dollar");
                break;
        }
    }

    public boolean isValid2(int ch) {
        if (ch < 1 | ch > 2) return false;
        else return true;
    }
}