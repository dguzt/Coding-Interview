package org.guzman.arrays;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ZeroMatrix {

  public static int[][] execute(int[][] matrix) {
    var rowLength = matrix.length;
    var colLength = matrix[0].length;

    var zeroRowFlags = new boolean[rowLength];
    var zeroColFlags = new boolean[colLength];

    var res = new int[rowLength][colLength];

    for (int r = 0; r < rowLength; r++) {
      for (int c = 0; c < colLength; c++) {
        if (matrix[r][c] == 0) {
          zeroRowFlags[r] = true;
          zeroColFlags[c] = true;
        }
      }
    }

    for (int r = 0; r < rowLength; r++) {
      for (int c = 0; c < colLength; c++) {
        if (zeroRowFlags[r] || zeroColFlags[c]) {
          continue;
        }

        res[r][c] = matrix[r][c];
      }
    }

    return res;
  }
}
