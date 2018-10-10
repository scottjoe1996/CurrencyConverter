package com.company;

public class CurrencyConversionMenu {
    public void displaySelectCurrencyMenu(int what) {
        System.out.println();
        switch (what) {
            case 1:
                System.out.println("You have chosen Pound Sterling, how much do you want to convert?");
                break;
            case 2:
                System.out.println("You have chosen US Dollar, how much do you want to convert?");
                break;
            case 3:
                System.out.println("You have chosen Euro, how much do you want to convert?");
                break;
        }
        System.out.println();

    }

    public void displayCurrencyMenu() {
        System.out.println("Choose the currency you want to convert from:"); // Exchange rates as of 08/10/2018
        System.out.println("  1. Pound sterling");
        System.out.println("  2. US Dollar");
        System.out.println("  3. Euro");
        System.out.println();
    }

    public boolean isValid(int ch) {
        if (ch == 1 | ch == 2 | ch == 3) return false;
        else return true;
    }
}
