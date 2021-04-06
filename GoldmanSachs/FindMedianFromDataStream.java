package GoldmanSachs;

public class FindMedianFromDataStream {
    class MedianFinder {

        List<Integer> list;

        /** initialize your data structure here. */
        public MedianFinder() {
            list = new ArrayList<>();
        }

        public void addNum(int num) {
            if (list.isEmpty())
                list.add(num);
            else {
                insert(list, num);
            }
        }

        private void insert(List<Integer> list, int num) {
            int j = list.size() - 1;
            while (j >= 0 && list.get(j) > num) {
                j--;
            }
            list.add(j + 1, num);
        }

        public double findMedian() {
            int size = list.size();

            double avg = 0;
            if (size % 2 == 0) {
                avg = list.get(size / 2);
                avg += list.get((size / 2) - 1);
                return avg / 2;
            } else {
                avg = list.get(size / 2);
                return avg;
            }
        }
    }

    /**
     * Your MedianFinder object will be instantiated and called as such:
     * MedianFinder obj = new MedianFinder(); obj.addNum(num); double param_2 =
     * obj.findMedian();
     */
}
