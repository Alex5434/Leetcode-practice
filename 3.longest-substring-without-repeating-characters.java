/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start

import java.util.*;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int maxLimit = 1;
        int left = 0;
        for (int right = left+1; right < s.length(); right++) {

            while (right >= left) {
                System.out.println("LEFT : " + left + " RIGHT: " + right);
                left++;
            }

            System.out.println();

            // HashSet<Character> charSet = new HashSet<>();
            // int parser = left;
            // int maxCount = 1;
            // while (parser<=right && !charSet.contains(s.charAt(parser))) {
            //     System.out.println("JJJJJJJJJJJJ");
            //     charSet.add(s.charAt(parser));
            //     parser++;
            //     maxCount++;
            // }
            // left++;

            // int rightMost = right;
            // while(rightMost == left && !set.contains(s.charAt(right))){
            //     rightMost++;
                // System.out.println("LEFT : " + left + " RIGHT: " + right);

                // while(left != right){
                    // left++;
                // }
            // }
            // left++;
            // System.out.println();
        }

        return 1;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}
// @lc code=end

