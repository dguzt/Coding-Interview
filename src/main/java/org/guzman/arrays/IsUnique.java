package org.guzman.arrays;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IsUnique {

  public static boolean execute(String string) {
    var limit = 256;
    if (string.length() >= limit) {
      return false;
    }

    var alphabet = new int[limit];

    for (var c: string.toCharArray()) {
      var count = alphabet[Character.getNumericValue(c)];

      if (count == 0) {
        alphabet[Character.getNumericValue(c)]++;
        continue;
      }

      return false;
    }

    return true;
  }
}
