package medium;

public class DesignStackWithIncOperation {

    int[] arr;
    int ptr = -1;

    public CustomStack(int maxSize) {
            arr = new int[maxSize];
        }

    public void push(int x) {
        if (ptr == arr.length - 1)
            return;
        else {
            ptr++;
            arr[ptr] = x;

        }
    }

    public int pop() {
        if (ptr < 0)
            return -1;
        else {
            int temp = arr[ptr];
            arr[ptr] = 0;
            ptr--;
            return temp;
        }
    }

    public void increment(int k, int val) {
        int i = 0;
        while (i < k && i < arr.length) {
            arr[i] = arr[i] + val;
            i++;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such: CustomStack
 * obj = new CustomStack(maxSize); obj.push(x); int param_2 = obj.pop();
 * obj.increment(k,val);
 */
