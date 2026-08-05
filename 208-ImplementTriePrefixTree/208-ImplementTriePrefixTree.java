// Last updated: 8/5/2026, 1:57:50 PM
class Trie {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isWord;
    }

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {

        TrieNode node = root;

        for (char c : word.toCharArray()) {

            if (node.children[c - 'a'] == null)
                node.children[c - 'a'] = new TrieNode();

            node = node.children[c - 'a'];
        }

        node.isWord = true;
    }

    public boolean search(String word) {

        TrieNode node = find(word);

        return node != null && node.isWord;
    }

    public boolean startsWith(String prefix) {

        return find(prefix) != null;
    }

    private TrieNode find(String s) {

        TrieNode node = root;

        for (char c : s.toCharArray()) {

            if (node.children[c - 'a'] == null)
                return null;

            node = node.children[c - 'a'];
        }

        return node;
    }
}