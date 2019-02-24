public class StringCalculator {
    public int Add(String numbers) {
        if(numbers != null && numbers.isEmpty()) {
            return 0;
        }

        if (!numbers.contains(",")) {
            return Integer.parseInt(numbers);
        } else {
            String[] parts = numbers.split(",");
            return Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
        }
    }
}
