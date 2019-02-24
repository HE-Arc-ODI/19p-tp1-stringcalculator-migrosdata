public class StringCalculator {
    public int Add(String numbers) {
        if(numbers != null && numbers.isEmpty()) {
            return 0;
        }

        if (!numbers.contains(",")) {
            return Integer.parseInt(numbers);
        }

        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }
}
