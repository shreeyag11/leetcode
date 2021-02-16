package easy;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            String val = String.valueOf(s);
            if (!map.containsKey(val)) {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                map.put(val, temp);
            } else {
                map.get(val).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
    }
}
