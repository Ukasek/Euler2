import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void shouldWorkFor2() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.euler2(2);
        //then
        Assertions.assertThat(result).isEqualTo(0);

    }

    @Test
    public void shouldWorkFor12() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.euler2(12);
        //then
        Assertions.assertThat(result).isEqualTo(10);

    }

    @Test
    public void shouldWorkFor10() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.euler2(10);
        //then
        Assertions.assertThat(result).isEqualTo(10);

    }

}
