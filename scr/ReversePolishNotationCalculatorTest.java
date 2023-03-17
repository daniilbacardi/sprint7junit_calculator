import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReversePolishNotationCalculatorTest {
    static ReversePolishNotationCalculator calculator;

    @BeforeAll
    public static void beforeAll() {
        calculator = new ReversePolishNotationCalculator();
    }

    @Test
    public void shouldCalculateAddition() {
        assertEquals(9, calculator.calculatePolishNotation("4 5 +"));
    }

    @Test
    public void shouldCalculateSubtraction() {
        assertEquals(1, calculator.calculatePolishNotation("5 4 -"));
    }

    @Test
    public void shouldCalculateAdditionWithNegativeResult() {
        assertEquals(-1, calculator.calculatePolishNotation("4 5 -"));
    }

    @Test
    public void shouldCalculateMultiplication() {
        assertEquals(25, calculator.calculatePolishNotation("5 5 *"));
    }

    @Test
    public void shouldCalculateAdditionWithExtraSpaces() {
        assertEquals(20, calculator.calculatePolishNotation("4    5   *"));
    }

    @Test
    public void shouldCalculateMultiplicationWithNegativeNumbers() {
        assertEquals(20, calculator.calculatePolishNotation("-4 -5 *"));
    }

    @Test
    public void shouldCalculateMultiplicationWithNegativeNumber() {
        assertEquals(-20, calculator.calculatePolishNotation("4 -5 *"));
    }

    @Test
    public void shouldCalculateAdditionSubtractionAndMultiplication() {
        assertEquals(25, calculator.calculatePolishNotation("5 5 5 5 - + *"));
    }

    @Test
    public void shouldCalculateAdditionSubtractionAndMultiplicationANdExtraSpaces() {
        assertEquals(25, calculator.calculatePolishNotation("5  5   5   5  -   +     *"));
    }
}