package org.guzman.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringRotationTest {

  @ParameterizedTest
  @MethodSource("args")
  void textExecute(String s1, String s2, boolean expected) {
    var actual = StringRotation.execute(s1, s2);

    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("args")
  void textExecuteOfficialSolution(String s1, String s2, boolean expected) {
    var actual = StringRotation.executeOfficialSolution(s1, s2);

    assertEquals(expected, actual);
  }

  private static Stream<Arguments> args() {
    return Stream.of(
        Arguments.of("waterbottle", "erbottlewat", true),
        Arguments.of("mayonesa", "yonesama", true),
        Arguments.of("thepowerofintroverts", "rtsthepowerofintrove", true),
        Arguments.of("wawawawawawa", "awawawawawaw", true),
        Arguments.of("moriarty", "oriartym", true),
        Arguments.of("sugar", "sugar", true),
        Arguments.of("quiet", "etque", false),
        Arguments.of("oneaway", "awaione", false),
        Arguments.of("rotatematrix", "matrizrotate", false),
        Arguments.of("zeromatrix", "meromatrim", false),
        Arguments.of("palindromepermutation", "ppermutationalindrome", false)
    );
  }
}
