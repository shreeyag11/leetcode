package GoldmanSachs;

public class H-Index
{

    public int hIndex(int[] citations) {
        int n = 0;
        Arrays.sort(citations);
        while (n < citations.length && citations[citations.length - n - 1] > n) {
            n++;
        }
        return n;
    }
}
