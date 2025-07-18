package com.larionov.easy.p0383;
/*
Given two strings ransomNote and magazine,
return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true

Constraints:
1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
*/
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alphabet = new int[26];

        for(char c : ransomNote.toCharArray()) {
            int startFrom = c - 'a';
            int found = magazine.indexOf(c, startFrom);
            if(found == -1) return false;
            alphabet[c-'a'] = found + 1;
        }
        return true;
    }

}
