# First Occurence

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two strings  **txt**  and  **pat**, return the 0-based index of the first occurrence of the substring  **pat**  in  **txt**. If pat is not found, return -1.

 **Examples :** 

```
Input: txt = "GeeksForGeeks", pat = "Fr"
Output: -1
Explanation: "Fr" is not present in the string "GeeksForGeeks" as substring.
```

```
Input: txt = "GeeksForGeeks", pat = "For"
Output: 5
Explanation: "For" is present as substring in "GeeksForGeeks" from index 5 (0 based indexing).

```

```
Input: txt = "GeeksForGeeks", pat = "gr"
Output: -1
Explanation: "gr" is not present in the string "GeeksForGeeks" as substring.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T06:18:31.376Z  

```java
class Solution {
    int firstOccurence(String txt, String pat) {

        int n = txt.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;

            while (j < m && txt.charAt(i + j) == pat.charAt(j)) {
                j++;
            }

            if (j == m) {
                return i;
            }
        }

        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/implement-strstr/1)