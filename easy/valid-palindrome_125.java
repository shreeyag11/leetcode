// Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

// Note: For the purpose of this problem, we define empty string as valid palindrome.

// Example 1:

// Input: "A man, a plan, a canal: Panama"
// Output: true
// Example 2:

// Input: "race a car"
// Output: false
 

// Constraints:

// s consists only of printable ASCII characters.

class ValidPalindrome {
    public boolean isPalindrome(String s) {
          String newStr = "";
        String[] str = s.toLowerCase().split(" |_|\\W+");
        
        for(String a: str){
            newStr = newStr+a;
        }
        int i=0, j=newStr.length()-1;
        while(i<j)
        {
            if(newStr.charAt(i)!=newStr.charAt(j))
            {
               return false;
            }
             i++;
             j--;
        }
        
        return true;
    }
}