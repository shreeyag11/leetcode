public class LetterCombinationsOfPhoneNumber {
    public List<String> letterCombinations(String digits) {
        String[] dict = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> result = new ArrayList<>();
        if (digits.length() == 0)
            return result;
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            result = combine(dict[digits.charAt(i) - '0'], result);
        }
        return result;
    }

    private List<String> combine(String digits, List<String> l) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            for (String x : l) {
                result.add(x + digits.charAt(i));
            }
        }
        return result;
    }
}

// Given a string containing digits from 2-9 inclusive, return all possible
// letter combinations that the number could represent. Return the answer in any
// order.

// A mapping of digit to letters (just like on the telephone buttons) is given
// below. Note that 1 does not map to any letters.

// Example 1:

// Input: digits = "23"
// Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
// Example 2:

// Input: digits = ""
// Output: []
// Example 3:

// Input: digits = "2"
// Output: ["a","b","c"]

// Constraints:

// 0 <= digits.length <= 4
// digits[i] is a digit in the range ['2', '9'].