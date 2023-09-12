package org.guzman.arrays;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OneWay {

  public static boolean execute(String string1, String string2) {
    var charset1 = string1.toCharArray();
    var charset2 = string2.toCharArray();

    var diffSize = string1.length() - string2.length();
    if (Math.abs(diffSize) >= 2) {
      return false;
    }

    var largeSet = diffSize >= 0 ? charset1 : charset2;
    var smallSet = diffSize >= 0 ? charset2 : charset1;

    var i1 = 0;
    var i2 = 0;
    var sameLength = charset1.length == charset2.length;

    var edited = false;
    while (i2 < smallSet.length) {

      if (largeSet[i1] == smallSet[i2]) {
        i1++;
        i2++;
        continue;
      }

      if (edited) {
        return false;
      }

      edited = true;

      i1++;
      if (sameLength) {
        i2++;
      }
    }

    return true;
  }
}
