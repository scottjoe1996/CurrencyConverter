package com.company;

public class CurrencyCalculation {
    public void pound(int whatTo, double amount) {
        switch (whatTo) {
            case 1:
                System.out.println("\n" + amount + " pounds converts to " + amount * 1.3 + " US dollars");
                break;
            case 2:
                System.out.println("\n" + amount + " pounds converts to " + amount * 1.14 + " euros");
        }
        System.out.println("\n");
    }

    public void dollar(int whatTo, double amount) {
        switch (whatTo) {
            case 1:
                System.out.println("\n" + amount + " dollars converts to " + amount * 0.77 + " pounds");
                break;
            case 2:
                System.out.println("\n" + amount + " dollars converts to " + amount * 0.87 + " euros");
        }
        System.out.println("\n");
    }

    public void euro(int whatTo, double amount) {
        switch (whatTo) {
            case 1:
                System.out.println("\n" + amount + " euros converts to " + amount * 0.88 + " pounds");
                break;
            case 2:
                System.out.println("\n" + amount + " euros converts to " + amount * 1.15 + " US dollars");
        }
        System.out.println("\n");
    }

}