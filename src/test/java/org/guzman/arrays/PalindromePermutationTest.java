package org.guzman.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromePermutationTest {

  @ParameterizedTest
  @MethodSource("args")
  void testExecute(String input, boolean expected) {
    var actual = PalindromePermutation.execute(input);

    assertEquals(expected, actual);
  }

  private static Stream<Arguments> args() {
    return Stream.of(
        Arguments.of("asd asd", true),
        Arguments.of("Tact Coa", true),
        Arguments.of("asd dsa asd", false)
    );
  }
}
