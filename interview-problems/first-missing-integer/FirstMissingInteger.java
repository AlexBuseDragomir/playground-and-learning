package org.example.firstmissinginteger;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Objects.isNull;

/*
  First missing positive integer (unsorted array)
  Classic problem:

  Example: [3,4,-1,1] → 2
*/
public class FirstMissingInteger {

  public static Integer findFirstPositiveMissingInteger1(List<Integer> numbers) {
    if (isNull(numbers) || numbers.isEmpty()) {
      return 1;
    }

    final Set<Integer> foundNumbers = new HashSet<>(numbers);

    for (int i = 1; i <= numbers.size() + 1; i ++) {
      if (!foundNumbers.contains(i)) {
        return i;
      }
    }

    return null;
  }

  public static Integer findFirstPositiveMissingInteger2(List<Integer> numbers) {
    if (isNull(numbers) || numbers.isEmpty()) {
      return 1;
    }

    Set<Integer> foundNumbers = numbers.stream()
        .filter(n -> n > 0)
        .collect(Collectors.toSet());

    return IntStream.rangeClosed(1, numbers.size() + 1)
        .filter(i -> !foundNumbers.contains(i))
        .findFirst()
        .getAsInt();
  }

  public static Integer findFirstPositiveMissingInteger3(List<Integer> numbers) {
    if (isNull(numbers) || numbers.isEmpty()) {
      return 1;
    }

    numbers.removeIf(Objects::isNull);
    numbers.sort(Comparator.naturalOrder());

    int target = 1;

    for (int number : numbers) {
      if (number == target) {
        target++;
      } else if (number > target) {
        return target;
      }
      // If num < target, we just skip it (negatives or duplicates)
    }

    return target;
  }
}
