package GoldmanSachs;

public class H-IndexII
{

    public int hIndex(int[] citations) {
        int n = 0;
        while (n < citations.length && citations[citations.length - n - 1] > n)
            n++;
        return n;
    }
}
