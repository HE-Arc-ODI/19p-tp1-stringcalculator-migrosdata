public class StringCalculator {
    public int Add(String numbers) {
        if(numbers != null && numbers.isEmpty()) {
            return 0;
        }

        if (!numbers.contains(",")) {
            return Integer.parseInt(numbers);
        } else {
            int sum = 0;
            String[] parts = numbers.split(",");
            for (int i = 0; i < parts.length; i++) {
                sum+= Integer.parseInt(parts[i]);
            }
            return sum;
        }
    }
}
