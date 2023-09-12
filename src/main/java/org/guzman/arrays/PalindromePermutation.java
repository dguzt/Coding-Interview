package org.guzman.arrays;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PalindromePermutation {

  public static boolean execute(String string) {
    var alphabet = new int[256];
    var aux = string.toCharArray();

    for (int i = 0; i < string.length(); i++) {
      var c = aux[i];
      if (c == ' ') {
        continue;
      }

      alphabet[Character.getNumericValue(c)]++;
    }

    var alreadyAnOdd = false;

    for (int i = 0; i < 256; i++) {
      var isEven = alphabet[i] % 2 == 0;
      if (isEven) {
        continue;
      }

      if (alreadyAnOdd) {
        return false;
      }

      alreadyAnOdd = true;
    }

    return true;
  }
}
