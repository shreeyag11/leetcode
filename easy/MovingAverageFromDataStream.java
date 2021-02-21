package easy;

public class MovingAverageFromDataStream {

    int[] arr;
    int sum, ptr, len;

    /** Initialize your data structure here. */
        public MovingAverage(int size) {
            arr = new int[size];
            sum = 0;
            ptr = 0;
            len = 0;
        }

    public double next(int val) {
        ptr %= arr.length;
        sum = sum + val - arr[ptr];
        arr[ptr] = val;
        ptr++;
        if (len < arr.length)
            len++;
        double res = ((double) sum / (double) len);
        return res;
    }

    /**
     * Your MovingAverage object will be instantiated and called as such:
     * MovingAverage obj = new MovingAverage(size); double param_1 = obj.next(val);
     */
}
