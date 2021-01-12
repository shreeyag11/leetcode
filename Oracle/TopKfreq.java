package Oracle;

public class TopKfreq {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        Queue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> count : map.entrySet()) {
            minHeap.offer(count);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int[] res = new int[minHeap.size()];
        int i = 0;
        while (!minHeap.isEmpty()) {
            res[i++] = minHeap.poll().getKey();
        }
        return res;
    }

}
