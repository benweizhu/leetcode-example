package me.zeph.leetcode.leetcode.string;

import java.util.Arrays;

public class CheckPermutationLcci {

  public boolean is(String s1, String s2) {
    char[] chars1 = s1.toCharArray();
    Arrays.sort(chars1);

    char[] chars2 = s2.toCharArray();
    Arrays.sort(chars2);

    return String.valueOf(chars1).equals(String.valueOf(chars2));
  }
}
