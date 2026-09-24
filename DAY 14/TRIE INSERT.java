class TrieNode {
    TrieNode[] child = new TrieNode[26];
    boolean end;
}

class Trie {

    TrieNode root = new TrieNode();

    void insert(String word) {

        TrieNode curr = root;

        for (char ch : word.toCharArray()) {

            int index = ch - 'a';

            if (curr.child[index] == null) {
                curr.child[index] = new TrieNode();
            }

            curr = curr.child[index];
        }

        curr.end = true;
    }
}
