// You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

// The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

// Example 1:

// Input: J = "aA", S = "aAAbbbb"
// Output: 3
// Example 2:

// Input: J = "z", S = "ZZ"
// Output: 0
// Note:

// S and J will consist of letters and have length at most 50.
// The characters in J are distinct

/**
 * APPROACH USING 2 FOR LOOPS ---------TIME COMPLEXITY: O(m*n) -----------SPACE
 * COMPLEXITY: O(1)
 */

class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (J.charAt(i) == S.charAt(j))
                    count++;
            }
        }
        return count;
    }
}

/**
 * APPROACH USING HASHMAP ----TIME COMPLEXITY: O(m+n)---- SPACE COMPLEXITY: O(n)
 * ..HASHMAP OF STRING S
 */

// class Solution {
// public int numJewelsInStones(String J, String S) {
// int count=0;
// HashMap<Character, Integer> map = new HashMap<>();
// for(int i=0;i<S.length();i++){
// map.put(S.charAt(i),map.getOrDefault(S.charAt(i),0)+1);
// }
// for(int i=0;i<J.length();i++){
// if(map.containsKey(J.charAt(i)))
// count+=map.get(J.charAt(i));
// }
// return count;
// }
// }