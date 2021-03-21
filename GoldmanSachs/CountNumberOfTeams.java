package GoldmanSachs;

public class CountNumberOfTeams {
    public int numTeams(int[] rating) {
        int count = 0;
        for (int i = 0; i < rating.length; i++) {
            int lessLeft = 0, greaterLeft = 0, lessRight = 0, greaterRight = 0;
            for (int j = 0; j < rating.length; j++) {
                if (i < j) {
                    // Right
                    if (rating[i] < rating[j]) {
                        greaterRight++;
                    }
                    if (rating[i] > rating[j]) {
                        lessRight++;
                    }
                }
                if (i > j) {
                    // Left
                    if (rating[i] < rating[j]) {
                        greaterLeft++;
                    }
                    if (rating[i] > rating[j]) {
                        lessLeft++;
                    }
                }
            }
            count += (greaterRight * lessLeft) + (lessRight * greaterLeft);
        }
        return count;
    }
}
