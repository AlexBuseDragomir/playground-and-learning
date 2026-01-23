package org.example.findnumberinlist;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import static java.util.Objects.isNull;

/*
  Second-highest number (with/without streams, from list)

  Examples:
  int[] {2,1,4,5,30,29} → find 2nd highest

  Java code to find the 2nd largest value from List
  Also: Second-largest duplicate number
*/
public class FindNumberInList {

  // Considers only distinct numbers
  public static Integer findSecondHighestNumber1(List<Integer> numbers) {
    if (isNull(numbers) || numbers.size() < 2) {
      return null;
    }

    Integer largest = null;
    Integer secondLargest = null;

    for (Integer number : numbers) {
      if (isNull(number)) {
        continue;
      }

      if (isNull(largest) || number > largest) {
        secondLargest = largest;
        largest = number;

      } else if (!Objects.equals(number, largest) && (isNull(secondLargest) || number > secondLargest)) {
        secondLargest = number;
      }
    }

    return secondLargest;
  }

  // Considers duplicates as valid candidates
  public static Integer findSecondHighestNumber2(List<Integer> numbers) {
    if (isNull(numbers) || numbers.size() < 2) {
      return null;
    }

    Integer largest = null;
    Integer secondLargest = null;

    for (Integer number : numbers) {
      if (isNull(number)) {
        continue;
      }

      if (isNull(largest) || number > largest) {
        secondLargest = largest;
        largest = number;

      } else if (isNull(secondLargest) || number > secondLargest) {
        secondLargest = number;
      }
    }

    return secondLargest;
  }

  // Considers only distinct numbers
  public static Integer findSecondHighestNumber3(List<Integer> numbers) {
    return numbers.stream()
        .filter(Objects::nonNull)
        .distinct()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst()
        .orElse(null);
  }

  // Considers duplicates as valid candidates
  public static Integer findSecondHighestNumber4(List<Integer> numbers) {
    return numbers.stream()
        .filter(Objects::nonNull)
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst()
        .orElse(null);
  }
}
