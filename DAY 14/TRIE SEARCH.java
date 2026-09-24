boolean search(String word) {

    TrieNode curr = root;

    for (char ch : word.toCharArray()) {

        int index = ch - 'a';

        if (curr.child[index] == null) {
            return false;
        }

        curr = curr.child[index];
    }

    return curr.end;
}
