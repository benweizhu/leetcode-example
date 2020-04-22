package me.zeph.leetcode.leetcode.string;

import java.util.HashSet;

public class IsUniqueLcci {

  public boolean is(String str) {
    HashSet<Character> sameChar = new HashSet<>();
    for (int i = 0; i < str.length(); i++) {
      if (!sameChar.add(str.charAt(i))) {
        return false;
      }
    }
    return true;
  }

}
