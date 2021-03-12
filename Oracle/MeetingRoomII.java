public class MeetingRoomII {
        public int minMeetingRooms(int[][] intervals) {
            if(intervals.length == 0)
                return 0;
            
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
            
            PriorityQueue<Integer> minHeap = new PriorityQueue<>(intervals.length, (a,b) -> a - b);
            
            minHeap.add(intervals[0][1]);
            for(int i = 1; i < intervals.length; i++) {
                if(intervals[i][0] >= minHeap.peek())
                    minHeap.poll();
                minHeap.add(intervals[i][1]);
            }
            return minHeap.size();
        }
}
