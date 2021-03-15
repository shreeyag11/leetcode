package GoldmanSachs;

public class RobotBoundedInCircle {
    public boolean isRobotBounded(String instructions) {
        int pos = 0;
        int x = 0;
        int y = 0;
        for (char ch : instructions.toCharArray()) {
            if (ch == 'L') {
                pos = (pos + 3) % 4;
            } else if (ch == 'R') {
                pos = (pos + 1) % 4;
            } else {
                if (pos == 0) {
                    y++;
                } else if (pos == 1) {
                    x++;
                } else if (pos == 2) {
                    y--;
                } else if (pos == 3) {
                    x--;
                }
            }
        }
        return (x == 0 && y == 0) || pos != 0;
    }
}
