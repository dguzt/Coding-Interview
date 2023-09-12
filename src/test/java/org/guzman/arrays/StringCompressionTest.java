package org.guzman.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

  @ParameterizedTest
  @MethodSource("args")
  void testExecute(String input, String expected) {
    var actual = StringCompression.execute(input);

    assertEquals(expected, actual);
  }

  private static Stream<Arguments> args() {
    return Stream.of(
        Arguments.of("aaaabbbb", "4a4b"),
        Arguments.of("aabcccccaaa", "2a1b5c3a"),
        Arguments.of("zzzxxxzzz", "3z3x3z"),
        Arguments.of("zzzxxxzzzxzxz", "zzzxxxzzzxzxz"),
        Arguments.of("aabb", "aabb")
    );
  }
}
