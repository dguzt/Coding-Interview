package org.guzman.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class URLifyTest {

  @ParameterizedTest
  @MethodSource("argsForURLify")
  void testChangeSpacesForUrlAcceptedChars_Solution1(String input, String expected) {
    var actual = URLify.execute(input.toCharArray(), input.length());

    assertArrayEquals(expected.toCharArray(), actual);
  }

  @ParameterizedTest
  @MethodSource("argsForURLify")
  void testChangeSpacesForUrlAcceptedChars_Solution2(String input, String expected) {
    var actual = URLify.executeAlternative(input.toCharArray(), input.length());

    assertArrayEquals(expected.toCharArray(), actual);
  }

  private static Stream<Arguments> argsForURLify() {
    return Stream.of(
        Arguments.of("Mr John Smith    ", "Mr%20John%20Smith"),
        Arguments.of("Au Au Au Au      ", "Au%20Au%20Au%20Au"),
        Arguments.of("1 2 3 4 5 6          ", "1%202%203%204%205%206"),
        Arguments.of("Azure", "Azure"),
        Arguments.of("/", "/"),
        Arguments.of("", "")
    );
  }
}
