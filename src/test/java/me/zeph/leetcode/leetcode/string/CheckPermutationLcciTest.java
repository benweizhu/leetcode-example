package me.zeph.leetcode.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPermutationLcciTest {

  @Test
  void should_return_true() {
    CheckPermutationLcci checkPermutationLcci = new CheckPermutationLcci();
    assertTrue(checkPermutationLcci.is("abc", "bca"));
  }

  @Test
  void should_return_false() {
    CheckPermutationLcci checkPermutationLcci = new CheckPermutationLcci();
    assertFalse(checkPermutationLcci.is("abc", "bad"));
  }
}