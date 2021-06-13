package ex26;

import org.junit.jupiter.api.Test;

import static ex26.main26.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class main_test {
    @Test
    void is_Equation_Working() {
        //given
        balance_in = "5000";
        rate_in = "12";
        payment_in = "100";
        PaymentCalculator.calculateMonthsUntilPaidOff();

        //when
        String actual = main26.output;
        String expect = "It will take you 70 months to pay off this card.";

        //then
        assertEquals(expect, actual);
    }


    @Test
    void is_Equation_Working2() {
        //given
        balance_in = "13";
        rate_in = "24";
        payment_in = "100";
        PaymentCalculator.calculateMonthsUntilPaidOff();

        //when
        String actual = main26.output;
        String expect = "It will take you 1 months to pay off this card.";

        //then
        assertEquals(expect, actual);
    }
}