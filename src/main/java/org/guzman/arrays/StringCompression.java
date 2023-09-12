package org.guzman.arrays;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StringCompression {

  public static String execute(String string) {
    var aux = string.toCharArray();
    var res = new char[string.length()];

    var r = 0;
    int count = 0;
    char letter = ' ';

    for (int i = 0; i < aux.length; i++) {
      if (count == 0) {
        letter = aux[i];
      }

      if (r >= aux.length) {
        return string;
      }

      if (letter == aux[i]) {
        count++;
      }

      var lastCharacter = i+1 == aux.length;
      if (!lastCharacter && letter == aux[i+1]) {
        continue;
      }

      var number = Integer.toString(count).toCharArray();
      if (number.length + 1 + r >= aux.length) {
        return string;
      }

      copyArrayInArray(number, res, r);
      r += number.length;
      res[r++] = letter;

      count = 0;
    }

    return new String(res).trim();
  }

  private static void copyArrayInArray(char[] array1, char[] array2, int start) {
    var aux = start;
    for (var c : array1) {
      array2[aux++] = c;
    }
  }
}
