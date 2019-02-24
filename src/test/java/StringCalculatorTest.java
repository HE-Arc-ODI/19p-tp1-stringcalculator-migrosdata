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

    @Test
    public void testTwoNumbers() {
        // Arrange
        int expected = 5;
        StringCalculator stringCalculator = new StringCalculator();
        // Act
        int actual = stringCalculator.Add("3,2");
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testUnknownAmountOfNumbers() {
        // Arrange
        int expected = 10;
        StringCalculator stringCalculator = new StringCalculator();
        // Act
        int actual = stringCalculator.Add("3,2,1,1,2,1");
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testNewLinesBetweenNumbers() {
        // Arrange
        int expected = 6;
        StringCalculator stringCalculator = new StringCalculator();
        // Act
        int actual = stringCalculator.Add("1\n2,3");
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testDifferentDelimitersSupport() {
        // Arrange
        int expected = 3;
        StringCalculator stringCalculator = new StringCalculator();
        // Act
        int actual = stringCalculator.Add("//;\n1;2");
        // Assert
        assertEquals(expected, actual);
    }
}
