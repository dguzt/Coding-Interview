package org.guzman.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ZeroMatrixTest {

  @ParameterizedTest
  @MethodSource("arguments")
  void checkExecute(int[][] matrix, int[][] expected) {
    var actual = ZeroMatrix.execute(matrix);
    assertMatrixEquals(expected, actual);
  }

  private static Stream<Arguments> arguments() {
    var matrix1 = new int[][]{
        {0, 1, 2, 3},
        {0, 1, 2, 3},
        {0, 1, 2, 3},
    };

    var expected1 = new int[][]{
        {0, 0, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0},
    };

    var matrix2 = new int[][]{
        {0, 1, 1, 1},
        {1, 1, 1, 1},
        {0, 1, 1, 1},
    };

    var expected2 = new int[][]{
        {0, 0, 0, 0},
        {0, 1, 1, 1},
        {0, 0, 0, 0},
    };

    var matrix3 = new int[][]{
        {1, 1, 0, 1},
        {1, 1, 1, 1},
        {0, 1, 1, 1},
    };

    var expected3 = new int[][]{
        {0, 0, 0, 0},
        {0, 1, 0, 1},
        {0, 0, 0, 0},
    };

    var matrix4 = new int[][]{
        {0, 0, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1},
        {0, 0, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1},
        {0, 0, 1, 1, 1, 1},
    };

    var expected4 = new int[][]{
        {0, 0, 0, 0, 0, 0},
        {0, 0, 1, 1, 1, 1},
        {0, 0, 0, 0, 0, 0},
        {0, 0, 1, 1, 1, 1},
        {0, 0, 0, 0, 0, 0},
    };

    var matrix5 = new int[][]{
        {1, 1},
        {1, 1},
        {0, 1},
    };

    var expected5 = new int[][]{
        {0, 1},
        {0, 1},
        {0, 0},
    };


    var matrix6 = new int[][]{
        {1, 1},
        {1, 1},
        {1, 1},
    };

    var expected6 = new int[][]{
        {1, 1},
        {1, 1},
        {1, 1},
    };

    return Stream.of(
        Arguments.of(matrix1, expected1),
        Arguments.of(matrix2, expected2),
        Arguments.of(matrix3, expected3),
        Arguments.of(matrix4, expected4),
        Arguments.of(matrix5, expected5),
        Arguments.of(matrix6, expected6)
    );
  }

  private void assertMatrixEquals(int[][] expected, int[][] actual) {
    for (int i = 0; i < expected.length; i++) {
      assertArrayEquals(expected[i], actual[i]);
    }
  }
}
