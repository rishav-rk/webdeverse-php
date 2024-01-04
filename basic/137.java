
//Write a Java program to convert Roman number to an integer number
class oneHundredThirtySeven {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter a Roman numeral: ");
            String romanNumeral = input.readLine();

            int result = romanToInteger(romanNumeral);

            System.out.println("Integer value of Roman numeral: " + result);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    public static int romanToInteger(String romanNumeral) {
        int result = 0;

        if (romanNumeral == null || romanNumeral.isEmpty()) {
            return result;
        }

        java.util.Map <Character, Integer> romanValues = new java.util.HashMap <Character, Integer> ();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char currentChar = romanNumeral.charAt(i);
            int currentValue = romanValues.get(currentChar);

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }
}