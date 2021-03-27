package GoldmanSachs;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int size = (m + n);
        int val = size / 2 + 1;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < m; i++) {
            pq.offer(nums1[i]);
            if (pq.size() > val)
                pq.poll();
        }

        for (int i = 0; i < n; i++) {
            pq.offer(nums2[i]);
            if (pq.size() > val)
                pq.poll();
        }

        if (size % 2 != 0)
            return pq.peek();

        double ans = pq.peek();
        pq.poll();
        ans += pq.peek();

        return ans / 2;
    }

}
