// Given two non-empty strings s1 and s2, consisting only of lowercase English letters, determine whether they are anagrams of each other or not.
// Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.

// Examples:

// Input: s1 = "geeks" s2 = "kseeg"
// Output: true 
// Explanation: Both the string have same characters with same frequency. So, they are anagrams.
// Input: s1 = "allergy", s2 = "allergyy" 
// Output: false 
// Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams. 
// Input: s1 = "listen", s2 = "lists" 
// Output: false 
// Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.

import java.util.*;

class Anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1,s2);
    }
}