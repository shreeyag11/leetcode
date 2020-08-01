// Given a word, you need to judge whether the usage of capitals in it is right or not.

// We define the usage of capitals in a word to be right when one of the following cases holds:

// All letters in this word are capitals, like "USA".
// All letters in this word are not capitals, like "leetcode".
// Only the first letter in this word is capital, like "Google".
// Otherwise, we define that this word doesn't use capitals in a right way.

// Example 1:

// Input: "USA"
// Output: True

// Example 2:

// Input: "FlaG"
// Output: False

// Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.

class DetectCapital {
    public boolean detectCapitalUse(String word) {
        String lower = word.toLowerCase();
        String upper = word.toUpperCase();
        if (lower.equals(word))
            return true;
        else if (upper.equals(word))
            return true;
        else if (upper.charAt(0) == word.charAt(0)) {
            if (word.substring(1).equals(lower.substring(1)))
                return true;
        }
        return false;
    }
}