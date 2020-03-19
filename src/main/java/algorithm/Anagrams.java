package algorithm;

import java.util.*;

public class Anagrams {

    public static void main(String[] args) {

    }

    final Map<String, List<String>> lookup = new HashMap<>();

    public Anagrams(final List<String> words) {
        for (final String word : words) {
            final String signature = alphabetize(word);

            if (lookup.containsKey(signature)) {
                lookup.get(signature).add(word);
            } else {
                final List<String> anagramList = new ArrayList<>();
                anagramList.add(word);
                lookup.put(signature, anagramList);
            }
        }
    }

    private String alphabetize(final String word) {
        final char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public List<String> getAnagrams(final String word) {
        final String signature = alphabetize(word);
        final List<String> anagrams = lookup.get(signature);
        return anagrams == null ? new ArrayList<>() : anagrams;
    }
}
