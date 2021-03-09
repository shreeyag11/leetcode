class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        queue.addAll(map.keySet());

        while (!queue.isEmpty() && k > 0) {
            int key = queue.poll();
            if (map.get(key) > 1) {
                map.put(key, map.get(key) - 1);
                queue.add(key);
            }
            k--;
        }
        return queue.size();
    }
}