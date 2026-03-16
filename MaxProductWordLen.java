Given a string array words, return the maximum value of length(word[i]) * length(word[j])
where the two words do not share common letters. If no such two words exist, return 0.

Example 1:
Input: words = ["abcw","baz","foo","bar","xtfn","abcdef"]
Output: 16
Explanation: The two words can be "abcw", "xtfn".

Example 2:
Input: words = ["a","ab","abc","d","cd","bcd","abcd"]
Output: 4
Explanation: The two words can be "ab", "cd".

Example 3:
Input: words = ["a","aa","aaa","aaaa"]
Output: 0
Explanation: No such pair of words.

Constraints: 
 2 <= words.length <= 1000 
 1 <= words[i].length <= 1000 
 words[i] consists only of lowercase English letters


--------------------------------------------------------------------------------------------------------------------

import java.util.*;

class Solution {

    public int maxProduct(String[] words) {
        int maxLen = 0;

        for (int first = 0; first < words.length; first++) {
            for (int second = first + 1; second < words.length; second++) {

                if (!hasCommon(words[first], words[second])) {

                    int product = words[first].length() * words[second].length();
                    maxLen = Math.max(maxLen, product);

                }
            }
        }

        return maxLen;
    }

    private boolean hasCommon(String firstWord, String secondWord) {

        for (char letter : firstWord.toCharArray()) {

            if (secondWord.indexOf(letter) != -1) {
                return true;
            }

        }

        return false;
    }
}

public class Main {

    public static void main(String[] args) {

        String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};

        Solution obj = new Solution();

        int result = obj.maxProduct(words);

        System.out.println("Maximum Product: " + result);

    }
}
