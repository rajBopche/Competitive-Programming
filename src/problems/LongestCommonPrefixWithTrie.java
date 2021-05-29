package problems;

import java.util.ArrayList;

public class LongestCommonPrefixWithTrie {

    public String longestCommonPrefix(ArrayList<String> A) {
        if (A.size() == 0) return "";
        if (A.size() == 1) return A.get(0);
        Trie trie = new Trie();
        for (String str : A) {
            trie.insert(str);
        }
        return getLongestCommonPrefix(trie, A.size());
    }

    private String getLongestCommonPrefix(Trie trie, int totalNoOfStrings) {
        Trie.TrieNode current = trie.root;
        StringBuilder lcp = new StringBuilder();
        int index = 0;
        while (index != 26) {
            Trie.TrieNode temp = current.children[index];
            if (temp != null) {
                if (temp.wordCount == totalNoOfStrings) {
                    lcp.append(temp.data);
                    current = temp;
                    index = 0;
                } else {
                    return lcp.toString();
                }
            } else {
                ++index;
            }
        }
        return lcp.toString();
    }
}

class Trie {

    TrieNode root = new TrieNode();

    static class TrieNode {
        char data;
        boolean isEndOfWord;
        TrieNode[] children = new TrieNode[26]; //since 26 alphabets in english
        int wordCount;
    }

    public void insert(String key) {
        TrieNode currentNode = root;
        int wordLength = key.length();
        for (int i = 0; i < wordLength; ++i) {
            char currentChar = key.charAt(i);
            int index = currentChar - 'a';
            if (currentNode.children[index] == null) {
                currentNode.children[index] = new TrieNode();
            }
            currentNode = currentNode.children[index];
            ++currentNode.wordCount;
            currentNode.data = currentChar;
        }
        currentNode.isEndOfWord = true;
    }
}

