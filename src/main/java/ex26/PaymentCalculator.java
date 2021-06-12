/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex26;

import java.text.DecimalFormat;

public class PaymentCalculator {

    public static void calculateMonthsUntilPaidOff() {
        double b = Double.parseDouble(main26.balance_in);
        double rate = Double.parseDouble(main26.rate_in);
        double p = Double.parseDouble(main26.payment_in);

        double i = (rate / 100) / 365;
        double n = (Math.log(1 + b/p * (1 - Math.pow(1 + i, 30))) / Math.log(1 + i) / -30) + 1;

        DecimalFormat df = new DecimalFormat("0");
        main26.output = "It will take you " + df.format(n) + " months to pay off this card.";
    }
}