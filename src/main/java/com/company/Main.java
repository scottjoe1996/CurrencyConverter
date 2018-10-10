package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currencyFrom, choice;
        Double amount;

        CurrencyConversionMenu currencyConversionMenu = new CurrencyConversionMenu();
        CurrencyConversionAgainstMenu currencyConversionAgainstMenu = new CurrencyConversionAgainstMenu();
        CurrencyCalculation currencyCalculation = new CurrencyCalculation();

        currencyFrom = 0;
        currencyConversionMenu.displayCurrencyMenu();

        do {
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
        } while (currencyConversionMenu.isValid(currencyFrom));
        amount = 0.0;
        do {
            try {
                amount = new Scanner(System.in).nextDouble();
                System.out.println();
            } catch (InputMismatchException exc) {
                System.out.println("Characters are invalid, please input a positive number");
            }
            try {
                if (amount < 0)
                    throw new Exception("Negative numbers are invalid.\n");
            } catch (Exception e) {
                System.out.println(e.toString());
                currencyConversionMenu.displaySelectCurrencyMenu(currencyFrom);
            }
        } while (amount <= 0.0);


        currencyConversionAgainstMenu.currencyTo(currencyFrom);
        choice = 0;
        do {
            try {
                choice = new Scanner(System.in).nextInt();
            } catch (InputMismatchException exc) {
                System.out.println(exc);
            }
            try {
                if (currencyConversionAgainstMenu.isValid2(choice)) {
                    throw new Exception("\nYou can only choose 1 or 2.\n");
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        } while (currencyConversionAgainstMenu.isValid2(choice));

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