import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {
    @Before
    public void setup(){
    }

    @Test
    public void testEmptyString() {
        // Arrange
        int expected = 0;
        StringCalculator stringCalculator = new StringCalculator();
        // Act
        int actual = stringCalculator.Add("");
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testOneNumber() {
        // Arrange
        int expected = 1;
        StringCalculator stringCalculator = new StringCalculator();
        // Act
        int actual = stringCalculator.Add("1");
        // Assert
        assertEquals(expected, actual);
    }
}
