package org.guzman.arrays;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CheckPermutation {

  public static boolean execute(String string1, String string2) {
    if (string1.length() != string2.length()) {
      return false;
    }

    var characters1 = new int[256];
    var characters2 = new int[256];

    for (var c : string1.toCharArray()) {
      characters1[Character.getNumericValue(c)]++;
    }

    for (var c : string2.toCharArray()) {
      characters2[Character.getNumericValue(c)]++;
    }

    for (var i : characters1) {
      if (characters1[i] != characters2[i]) {
        return false;
      }
    }

    return true;
  }
}
