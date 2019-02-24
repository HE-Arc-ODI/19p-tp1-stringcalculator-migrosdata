public class StringCalculator {
    public int Add(String numbers) {
        if(numbers != null && numbers.isEmpty()) {
            return 0;
        }

        if (!numbers.contains("\n") && numbers.matches("^[0-9]+")) {
            return Integer.parseInt(numbers);
        } else {
            int sum = 0;
            String delimiters = ",|\n";
            if (numbers.startsWith("//")) {
                delimiters = numbers.substring(2, numbers.indexOf("\n"));
                numbers = numbers.substring(numbers.indexOf("\n") + 1);
            }
            String[] parts = numbers.split(delimiters);
            for (int i = 0; i < parts.length; i++) {
                int number = Integer.parseInt(parts[i]);

                if (number < 0) {
                    throw new IllegalArgumentException(Integer.toString(number));
                }
                sum+= Integer.parseInt(parts[i]);
            }
            return sum;
        }
    }
}
