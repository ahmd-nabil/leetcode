package PrefixAndSuffixSearch;

import java.util.ArrayList;
import java.util.List;

public class TwoTriesSolution {
    class WordFilter {
        private TrieNode preTrie;
        private TrieNode sufTrie;

        public WordFilter(String[] words) {
            preTrie = new TrieNode();
            sufTrie = new TrieNode();
            for(int i=0; i<words.length; i++) {
                preTrie.insert(words[i], i);
                sufTrie.insert(new StringBuilder(words[i]).reverse().toString(), i);
            }
        }

        public int f(String prefix, String suffix) {
            List<Integer> preIndices = preTrie.starsWith(prefix);
            List<Integer> sufIndices = sufTrie.starsWith(new StringBuilder(suffix).reverse().toString());
            int i = preIndices.size() - 1, j = sufIndices.size() - 1;
            while(i >= 0 && j >= 0) {
                if(preIndices.get(i) > sufIndices.get(j))
                    i--;
                else if(preIndices.get(i) < sufIndices.get(j))
                    j--;
                else
                    return preIndices.get(i);
            }
            return -1;
        }

        private class TrieNode {
            private TrieNode[] t;
            private List<Integer> indices;

            public TrieNode() {
                t = new TrieNode[26];
                indices = new ArrayList<>();
            }

            public void insert(String word, int i) {
                TrieNode cur = this;
                for(char c: word.toCharArray()) {
                    if(cur.t[c - 'a'] == null)
                        cur.t[c - 'a'] = new TrieNode();
                    cur = cur.t[c - 'a'];
                    cur.indices.add(i);
                }
            }

            public List<Integer> starsWith(String s) {
                TrieNode cur = this;
                for(char c: s.toCharArray()) {
                    if(cur.t[c - 'a'] == null)
                        return new ArrayList<>();
                    cur = cur.t[c - 'a'];
                }
                return cur.indices;
            }
        }
    }
}
