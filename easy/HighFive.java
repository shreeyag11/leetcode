package easy;

public class HighFive {
    public int[][] highFive(int[][] items) {
        TreeMap<Integer, PriorityQueue<Integer>> map = new TreeMap<>();
        for (int i = 0; i < items.length; i++) {
            if (map.containsKey(items[i][0])) {
                map.get(items[i][0]).offer(items[i][1]);
            } else {
                PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
                pq.offer(items[i][1]);
                map.put(items[i][0], pq);
            }
        }
        List<int[]> res = new ArrayList<>();
        for (int id : map.keySet()) {
            int sum = 0, l = 0;
            while (l < 5) {
                sum += map.get(id).poll();
                l++;
            }
            res.add(new int[] { id, sum / 5 });
        }
        int[][] ans = new int[res.size()][];
        return res.toArray(ans);
    }
}
