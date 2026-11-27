# Longest Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` which consists of lowercase or uppercase letters, return the length of the  **longest palindrome**  that can be built with those letters.

Letters are  **case sensitive**, for example, `"Aa"` is not considered a palindrome.

 

Original
Java
 **Example 1:** 

```
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

```

 **Example 2:** 

```
Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.

```

 

 **Constraints:** 

- 1 <= s.length <= 2000
- s consists of lowercase and/or uppercase English letters only.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 78.21%)  
**Memory:** 42.5 MB (beats 87.25%)  
**Submitted:** 2026-11-27T04:43:31.410Z  

```java
class Solution {
    public int longestPalindrome(String s) {
        // ASCII characters up to 'z' (122) fit comfortably in size 128
        int[] counts = new int[128];
        for (char c : s.toCharArray()) {
            counts[c]++;
        }

        int length = 0;
        boolean hasOdd = false;

        for (int count : counts) {
            length += (count / 2) * 2;
            if (count % 2 == 1) {
                hasOdd = true;
            }
        }

        return hasOdd ? length + 1 : length;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/longest-palindrome/)