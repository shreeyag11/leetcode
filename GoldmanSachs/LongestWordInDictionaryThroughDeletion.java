package GoldmanSachs;

public class LongestWordInDictionaryThroughDeletion {
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary);
        String res = "";
        for (String word : dictionary) {
            if (isSubsequence(word, s)) {
                if (word.length() > res.length())
                    res = word;
            }
        }
        return res;
    }

    private boolean isSubsequence(String first, String second) {
        if (second.length() < first.length())
            return false;

        int i = 0, j = 0;
        // ale -> first , abpcplea -> second
        while (i < first.length()) {
            if (j == second.length())
                return false;
            if (first.charAt(i) == second.charAt(j))
                i++;
            j++;
        }

        return true;
    }
}
