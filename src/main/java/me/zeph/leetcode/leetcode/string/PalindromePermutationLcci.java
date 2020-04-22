package me.zeph.leetcode.leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class PalindromePermutationLcci {

  public boolean canPermutePalindrome(String s) {
    if (s == null) {
      return false;
    }
    char[] chars = s.toCharArray();
    Set<Character> set = new HashSet<>();
    for (char c : chars) {
      if (set.contains(c)) {
        set.remove(c);
      } else {
        set.add(c);
      }
    }
    return set.size() <= 1;
  }
}
