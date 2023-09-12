package org.guzman.arrays;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StringRotation {

  public static boolean execute(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }

    var a1 = s1.toCharArray();
    var a2 = s2.toCharArray();
    var init = a1[0];
    var last = a1[a1.length - 1];
    var len = a1.length;

    // not proud of this :(
    if (arePartiallyEquals(a1, a2, 0, 0, len)) {
      return true;
    }

    for (var i2 = 0; i2 < len - 1; i2++) {
      var unionFound = a2[i2] == last && a2[i2+1] == init;
      if (!unionFound) {
        continue;
      }

      var charsRemained = a2.length - 1 - i2;
      // coded in two variables for reading purposes
      var rightCheck = arePartiallyEquals(a1, a2, 0, i2+1, charsRemained);
      var leftCheck = arePartiallyEquals(a1, a2, charsRemained, 0, i2);
      if (rightCheck && leftCheck) {
        return true;
      }
    }

    return false;
  }

  public static boolean executeOfficialSolution(String s1, String s2) {
    var len = s1.length();
    if (len == s2.length() && len > 0) {
      var s1s1 = s1 + s1;
      return s1s1.contains(s2);
    }

    return false;
  }

  private static boolean arePartiallyEquals(char[] a1, char[] a2, int i1, int i2, int cantToCompare) {
    for (int j = 0; j < cantToCompare; j++) {
      if (a1[i1+j] != a2[i2+j]) {
        return false;
      }
    }

    return true;
  }
}
