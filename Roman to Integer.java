class Solution {
    public int romanToInt(String s) {
        // Create a dictionary to map Roman numerals to their corresponding values.
        Map<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);
        
        int result = 0;
        int prevValue = 0; // Initialize prevValue to zero.

        // Traverse the Roman numeral string from right to left.
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanToInteger.get(s.charAt(i));

            // If the previous value is less than the current value, it means subtraction is needed.
            if (prevValue <= currentValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }
}
