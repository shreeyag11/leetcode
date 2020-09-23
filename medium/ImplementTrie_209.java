package medium;

public class ImplementTrie_209 {
    class Trie {

        class TrieNode {
            TrieNode[] child = new TrieNode[26];
            boolean end;
        }

        TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {
            TrieNode trieNode = root;
            for (Character c : word.toCharArray()) {
                int index = c - 'a';
                if (trieNode.child[index] == null) {
                    trieNode.child[index] = new TrieNode();
                }
                trieNode = trieNode.child[index];
            }
            trieNode.end = true;
        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search(String word) {
            TrieNode trieNode = root;
            for (Character c : word.toCharArray()) {
                int index = c - 'a';
                if (trieNode.child[index] == null)
                    return false;
                trieNode = trieNode.child[index];
            }
            return trieNode != null && trieNode.end;
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            TrieNode trieNode = root;
            for (Character c : prefix.toCharArray()) {
                int index = c - 'a';
                if (trieNode.child[index] == null)
                    return false;
                trieNode = trieNode.child[index];
            }
            return true;
        }
    }

    /**
     * Your Trie object will be instantiated and called as such: Trie obj = new
     * Trie(); obj.insert(word); boolean param_2 = obj.search(word); boolean param_3
     * = obj.startsWith(prefix);
     */
}
