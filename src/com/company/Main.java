package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        int currencyFrom, choice;

        CurrencyConversionMenu currencyConversionMenu = new CurrencyConversionMenu();
        CurrencyConversionAginstMenu currencyConversionAginstMenu = new CurrencyConversionAginstMenu();
        CurrencyCalculation currencyCalculation = new CurrencyCalculation();

        Scanner scanner = new Scanner(System.in);
        currencyConversionMenu.displayCurrencyMenu();

        do {
            currencyFrom = scanner.nextInt();
            try {
                currencyConversionMenu.displaySelectCurrencyMenu(currencyFrom);
                if (!currencyConversionMenu.isValid(currencyFrom)) {
                    throw new
                            InvalidChoice();
                }
            } catch (InvalidChoice exc) {
                System.out.print(exc);
            }

        } while (!currencyConversionMenu.isValid(currencyFrom));

        
        Double amount = scanner.nextDouble();

        currencyConversionAginstMenu.currencyTo(currencyFrom);
        choice = (char) System.in.read();


        switch (currencyFrom) {
            case 1:
                currencyCalculation.pound(choice, amount);
                break;
            case 2:
                currencyCalculation.dollar(choice, amount);
                break;
            case 3:
                currencyCalculation.euro(choice, amount);
                break;
        }

    }
}