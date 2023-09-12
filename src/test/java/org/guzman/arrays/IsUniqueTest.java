package org.guzman.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsUniqueTest {

  @ParameterizedTest
  @MethodSource("args")
  void testChangeSpacesForUrlAcceptedChars_Solution2(String input, boolean expected) {
    var actual = IsUnique.execute(input);

    assertEquals(expected, actual);
  }

  private static Stream<Arguments> args() {
    return Stream.of(
        Arguments.of("asdfghjkl", true),
        Arguments.of("qwedsazxcvfrtgbnhyujm", true),
        Arguments.of("aaaaaaaaaaa", false),
        Arguments.of("xdcfvgbx", false),
        Arguments.of("azxszasx", false)
    );
  }
}
