class UndergroundSystem {

    HashMap<Integer, Event> arrivals;
    HashMap<String, Average> averages;

    public UndergroundSystem() {
        arrivals = new HashMap<>();
        averages = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        arrivals.put(id, new Event(id, stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        Event e = arrivals.get(id);
        arrivals.remove(id);
        String str = e.stationName + "," + stationName;
        int diff = t - e.t;
        Average avg = averages.containsKey(str) ? averages.get(str) : new Average();
        avg.updateTotal(diff);
        averages.put(str, avg);
    }

    public double getAverageTime(String startStation, String endStation) {
        String s = startStation + "," + endStation;
        return averages.get(s).getAverage();
    }

    class Event {
        private int id;
        private String stationName;
        private int t;

        public Event(int id, String stationName, int t) {
            this.id = id;
            this.stationName = stationName;
            this.t = t;
        }
    }

    class Average {
        private double total = 0;
        private int count = 0;

        public void updateTotal(int diff) {
            ++count;
            total += diff;
        }

        public double getAverage() {
            return total / count;
        }
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t); obj.checkOut(id,stationName,t); double param_3
 * = obj.getAverageTime(startStation,endStation);
 */
