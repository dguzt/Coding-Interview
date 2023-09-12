package org.guzman.arrays;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RotateMatrix {

  public static int[][] execute(int[][] image, int n) {
    var squares = n / 2;
    for (int square = 0; square < squares; square++) {
      rotateSquare(square, image, n);
    }

    return image;
  }

  private static void rotateSquare(int square, int[][] image, int n) {
    var keepCell = image[square][square];
    for (var i = square; i < n - 1 - square; i++) {
      var row = i;
      var col = i;
      var cell = image[row][col];
    }
  }

  private static int[] rotateIndexes(int row, int col, int n) {
    var indexes = new int[2];
    indexes[0] = col;
    indexes[1] = n - 1 - row;
    return indexes;
  }
}
