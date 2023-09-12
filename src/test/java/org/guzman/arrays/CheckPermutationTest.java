package org.guzman.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckPermutationTest {

  @Test
  void checkPermutationsForStrings() {
    var string1 = "asdfghjklaa";
    var string2 = "lkjhgfdsaaa";

    var res = CheckPermutation.execute(string1, string2);
    assertTrue(res);
  }
}
