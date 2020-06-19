// A self-dividing number is a number that is divisible by every digit it contains.

// For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

// Also, a self-dividing number is not allowed to contain the digit zero.

// Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

// Example 1:
// Input: 
// left = 1, right = 22
// Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
// Note:

// The boundaries of each input argument are 1 <= left <= right <= 10000 


import java.util.ArrayList;
import java.util.List;

class Solutions {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<>();
        for(int i=left; i<=right; i++)
            if(selfDivide(i))
                l.add(i);
        return l;
    }
    public boolean selfDivide(int num){
        int n = num;
        while(num>0){
            int m = num % 10;
            if(m == 0)
                return false;
            if(n % m != 0)
                return false;
            num /= 10;
        }
        return true;
    }
}


