package me.zeph.leetcode.leetcode;

import me.zeph.leetcode.leetcode.string.IsUniqueLcci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsUniqueLcciTest {

  @Test
  void should_return_false() {
    IsUniqueLcci isUniqueLcci = new IsUniqueLcci();
    assertFalse(isUniqueLcci.is("leetcode"));
  }

  @Test
  void should_return_true() {
    IsUniqueLcci isUniqueLcci = new IsUniqueLcci();
    assertTrue(isUniqueLcci.is("abc"));
  }
}