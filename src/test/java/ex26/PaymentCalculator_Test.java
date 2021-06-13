package ex26;

import org.junit.jupiter.api.Test;

import static ex26.main26.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PaymentCalculator_Test {
    @Test
    void is_Rate_Being_Divided_Correctly() {
        //given
        balance_in = "5000";
        rate_in = "12";
        payment_in = "100";
        double rate = Double.parseDouble(main26.rate_in);
        double i = 0;

        //when
        double actual = i = (rate / 100) / 365;
        double expect = 3.2876712328767124E-4;

        //then
        assertEquals(expect, actual);
    }
}
