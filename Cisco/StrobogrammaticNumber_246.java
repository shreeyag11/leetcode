import java.util.*;

class Strobogrammatic {
    public boolean isStrobogrammatic(String num) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('1', '1');
        map.put('6', '9');
        map.put('9', '6');
        map.put('8', '8');
        map.put('0', '0');
        String temp = "";
        for (char ch : num.toCharArray()) {
            if (map.containsKey(ch)) {
                temp = map.get(ch) + temp;
            } else
                return false;
        }
        return temp.equals(num);
    }
}