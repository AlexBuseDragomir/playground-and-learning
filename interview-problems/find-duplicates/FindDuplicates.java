package org.example.findduplicates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Objects.isNull;

/*
  Find duplicates in integer list/array

  Examples referenced:
  {1,2,3,2,1,7}
  {1,1,2,3,3}

  Generic: Find duplicates in list of integers
*/
public class FindDuplicates {

  public static List<Integer> findDuplicates(List<Integer> numbers) {
    final List<Integer> duplicates = new ArrayList<>();

    if (isNull(numbers) || numbers.size() < 2) {
      return duplicates;
    }

    final Map<Integer, Integer> frequencyMap = new HashMap<>();

    for (Integer number : numbers) {
      if (isNull(number)) {
        continue;
      }

      int frequency = frequencyMap.merge(number, 1, Integer::sum);

      if (frequency == 2) {
        duplicates.add(number);
      }
    }

    return duplicates;
  }
}
