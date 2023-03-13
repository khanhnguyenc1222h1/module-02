import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void findNextDay1Month1() {
        String date = "1/1/1018";
        String expected = "";
        int result = NextDayCalculator.findNextDay(day,month);
        assertEquals(expected,result);
    }
}