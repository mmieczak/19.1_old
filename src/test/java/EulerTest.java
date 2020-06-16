import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EulerTest {
    @Test
    void whenUpperLimitIs10_Return23() {
        //given
        int upperLimit = 10;
        //when
        int result = Euler.sumOfMultiplesOfThreeAndFive(upperLimit);
        //then
        int expectedResult = 23;
        Assertions.assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void whenUpperLimitIs11_Return33() {
        //given
        int upperLimit = 11;
        //when
        int result = Euler.sumOfMultiplesOfThreeAndFive(upperLimit);
        //then
        int expectedResult = 33;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void whenUpperLimitIs12_Return33() {
        //given
        int upperLimit = 12;
        //when
        int result = Euler.sumOfMultiplesOfThreeAndFive(upperLimit);
        //then
        int expecresult = 33;
        Assertions.assertEquals(expecresult, result);
    }

    @Test
    void whenUpperLimitIs13_Return45() {
        //given
        int upperLimit = 13;
        //when
        int result = Euler.sumOfMultiplesOfThreeAndFive(upperLimit);
        //then
        int expecresult = 45;
        Assertions.assertEquals(expecresult, result);
    }

    @Test
    void whenUpperLimitIs16_Return60() {
        //given
        int upperLimit = 16;
        //when
        int result = Euler.sumOfMultiplesOfThreeAndFive(upperLimit);
        //then
        int expecresult = 60;
        Assertions.assertEquals(expecresult, result);
    }
}
