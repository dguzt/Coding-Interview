package org.guzman.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OneWayTest {

  @ParameterizedTest
  @MethodSource("args")
  void testExecute(String input1, String input2, boolean expected) {
    var actual = OneWay.execute(input1, input2);

    assertEquals(expected, actual);
  }

  private static Stream<Arguments> args() {
    return Stream.of(
        Arguments.of("pale", "ple", true),
        Arguments.of("pales", "pale", true),
        Arguments.of("pale", "bale", true),
        Arguments.of("pale", "bake", false),
        Arguments.of("pxxe", "bxxe", true),
        Arguments.of("pxxe", "bxx", false),
        Arguments.of("pxxe", "pxe", true),
        Arguments.of("paless", "pales", true)
    );
  }
}
