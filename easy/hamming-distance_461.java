// The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

// Given two integers x and y, calculate the Hamming distance.

// Note:
// 0 ≤ x, y < 231.

// Example:

// Input: x = 1, y = 4

// Output: 2

// Explanation:
// 1   (0 0 0 1)
// 4   (0 1 0 0)
//        ↑   ↑

// The above arrows point to positions where the corresponding bits are different.

class Hamming {
    public int hammingDistance(int x, int y) {
        String binaryX = String.format("%31s", Integer.toBinaryString(x)).replace(' ', '0');
        String binaryY = String.format("%31s", Integer.toBinaryString(y)).replace(' ', '0');
        int count = 0;
        for (int i = 0; i < 31; i++) {
            if (binaryX.charAt(i) != binaryY.charAt(i))
                count++;
        }
        return count;
    }
}