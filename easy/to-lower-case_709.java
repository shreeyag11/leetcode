/* Implement function ToLowerCase() that has a string 
parameter str, and returns the same string in lowercase.
*/
// Example 1:

// Input: "Hello"
// Output: "hello"
// Example 2:

// Input: "here"
// Output: "here"
// Example 3:

// Input: "LOVELY"
// Output: "lovely"

class Solution {
    public String toLowerCase(String str) {
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++)
            if(ch[i]>=65 && ch[i]<=90)
                ch[i] = (char)((int)ch[i]+32);
        return String.valueOf(ch);
    }
}