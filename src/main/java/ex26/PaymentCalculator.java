/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex26;

public class PaymentCalculator {

    public static void calculateMonthsUntilPaidOff() {
        double balance = Double.parseDouble(main26.balance_in);
        double rate = Double.parseDouble(main26.rate_in) / 100;
        double payment = Double.parseDouble(main26.payment_in);

        double i = rate / 365;

        double n = (-(1/30) * Math.log10(1 + balance / payment) * (1 - Math.pow(1 + i, 30))) / Math.log10(1 + i) ;


        main26.output = n;

    }
}

