package org.example.reorderwords;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

/*
  Reorder words using numeric positions, and reverse characters

  Given:
  s = ""

  Output:
  "how are you"

  Each token ends with a digit representing word order; token text is reversed.
*/
public class ReorderWords {

  public static String reorderWords(String original) {
    if (isNull(original) || original.isBlank()) {
      return "";
    }

    return Arrays.stream(original.split("\\s+"))
        .map(String::strip)
        .sorted(Comparator.comparingInt(
            s -> Integer.parseInt(s.substring(s.length() - 1))))
        .map(string -> new StringBuilder(string.substring(0, string.length() - 1))
            .reverse().toString())
        .collect(Collectors.joining(" "));
  }
}
