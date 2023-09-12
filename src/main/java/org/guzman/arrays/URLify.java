package org.guzman.arrays;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class URLify {

  public static char[] execute(char[] string, int length) {
    var response = new char[length];

    var r = 0;
    for (int i = 0; i < length; i++) {
      if (string[i] == ' ') {
        response[r++] = '%';
        response[r++] = '2';
        response[r] = '0';

      } else {
        response[r] = string[i];
      }

      r++;
      if (r == length) {
        break;
      }
    }

    return response;
  }


  public static char[] executeAlternative(char[] string, int length) {
    var index = length - 1;
    var hook = length - 1;

    for (; index >= 0; index--) {
      if (string[index] != ' ') break;
    }

    for (; index >= 0; index--) {
      if (string[index] == ' ') {
        string[hook--] = '0';
        string[hook--] = '2';
        string[hook--] = '%';
        continue;
      }

      string[hook--] = string[index];
    }

    return string;
  }
}
