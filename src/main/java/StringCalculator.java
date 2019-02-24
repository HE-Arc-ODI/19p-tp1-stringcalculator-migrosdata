/**
 * The class add numbers stored in a string
 * @author Antoine Induni
 *
 *  this code isn't refactored!!
 */
public class StringCalculator {
    public int Add(String numbers) {
        if(numbers != null && numbers.isEmpty()) {
            return 0;
        }

        //TODO: remove this part
        if (!numbers.contains("\n") && numbers.matches("^[0-9]+")) {
            return Integer.parseInt(numbers);
        } else {
            int sum = 0;
            StringBuilder errorMessageBuilder = new StringBuilder();
            String delimiters = ",|\n";
            if (numbers.startsWith("//")) {
                delimiters = numbers.substring(2, numbers.indexOf("\n"));
                //Coding horror
                delimiters = delimiters.replace("[","");
                delimiters = delimiters.replace("]","");
                //TODO: extract method to manage meta character
                delimiters = delimiters.replace("*", "\\*");
                numbers = numbers.substring(numbers.indexOf("\n") + 1);
            }
            String[] parts = numbers.split(delimiters);
            for (int i = 0; i < parts.length; i++) {
                int number = Integer.parseInt(parts[i]);

                if (number > 1000) {
                    number = 0;
                }

                if (number < 0) {
                    errorMessageBuilder.append(number);
                    errorMessageBuilder.append(",");
                }
                sum+= number;
            }

            if(errorMessageBuilder.length() > 0 ){
                String errorMessage = errorMessageBuilder.toString();
                errorMessage = errorMessage.substring(0, errorMessage.length() - 1);
                throw new IllegalArgumentException(errorMessage);
            }
            return sum;
        }
    }
}
