// Last updated: 8/5/2026, 1:57:38 PM
class WordDictionary {

    class TrieNode {
        TrieNode[] child = new TrieNode[26];
        boolean isWord;
    }

    TrieNode root = new TrieNode();

    public WordDictionary() {}

    public void addWord(String word) {

        TrieNode node = root;

        for (char c : word.toCharArray()) {

            if (node.child[c - 'a'] == null)
                node.child[c - 'a'] = new TrieNode();

            node = node.child[c - 'a'];
        }

        node.isWord = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int index, TrieNode node) {

        if (node == null)
            return false;

        if (index == word.length())
            return node.isWord;

        char c = word.charAt(index);

        if (c == '.') {

            for (TrieNode next : node.child)
                if (dfs(word, index + 1, next))
                    return true;

            return false;
        }

        return dfs(word, index + 1, node.child[c - 'a']);
    }
}