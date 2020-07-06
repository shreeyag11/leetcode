// Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

// The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

// You may assume the integer does not contain any leading zero, except the number 0 itself.

// Example 1:

// Input: [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Example 2:

// Input: [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.

class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        int i = digits.length - 1;
        int carry = 0;
        while (i > 0) {
            carry = digits[i] / 10;
            if (carry > 0) {
                digits[i] %= 10;
                digits[i - 1] += carry;
            } else
                break;
            i--;
        }
        if (digits[0] / 10 > 0) {
            int[] new_arr = new int[digits.length + 1];
            new_arr[0] = 1;
            return new_arr;
        }
        return digits;
    }
}