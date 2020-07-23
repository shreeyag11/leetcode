import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// Given an array of strings, group anagrams together.

// Example:

// Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
// Output:
// [
//   ["ate","eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]
// Note:

// All inputs will be in lowercase.
// The order of your output does not matter.

class Anagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] st = str.toCharArray();
            Arrays.sort(st);
            String temp = new String(st);
            if (!map.containsKey(temp)) {
                List<String> l1 = new ArrayList<>();
                l1.add(str);
                map.put(temp, l1);
            } else {
                map.get(temp).add(str);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }
}