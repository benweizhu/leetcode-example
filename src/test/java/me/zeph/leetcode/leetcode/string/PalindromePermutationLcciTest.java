package me.zeph.leetcode.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromePermutationLcciTest {
  @Test
  void should_convert_space_to_special_code() {
    PalindromePermutationLcci palindromePermutationLcci = new PalindromePermutationLcci();
    assertTrue(palindromePermutationLcci.canPermutePalindrome("tacocat"));
    assertTrue(palindromePermutationLcci.canPermutePalindrome("tacooocat"));
    assertFalse(palindromePermutationLcci.canPermutePalindrome("abc"));
    assertTrue(palindromePermutationLcci.canPermutePalindrome("aa"));
  }
}