package org.example.meetingroomscheduling;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Objects.isNull;

/*
  Interval / Scheduling Algorithms
  Minimum number of conference rooms required

  Given meeting intervals [start, end], return minimum rooms required.

  Examples:
  [[4,5],[7,8],[10,11],[6,8],[7,9]]
  [[9,10],[4,9],[5,17]]
*/
public class MeetingRoomScheduling {

  public static Integer getNumberOfRoomsNeeded1(List<Interval> timeIntervals) {
    if (isNull(timeIntervals) || timeIntervals.isEmpty()) {
      return 0;
    }

    if (timeIntervals.size() == 1) {
      return 1;
    }

    final Map<Integer, Integer> hourFrequency = new HashMap<>();
    int maxRooms = 0;

    for (Interval interval : timeIntervals) {
      for (int i = interval.start; i < interval.end; i ++) {
        hourFrequency.merge(i, 1, Integer::sum);

        if (hourFrequency.get(i) > maxRooms) {
          maxRooms = hourFrequency.get(i);
        }
      }
    }

    return maxRooms;
  }

  public static Integer getNumberOfRoomsNeeded2(List<Interval> timeIntervals) {
    if (isNull(timeIntervals) || timeIntervals.isEmpty()) {
      return 0;
    }

    if (timeIntervals.size() == 1) {
      return 1;
    }

    int[] hourlyLoad = new int[25];
    int maxRooms = 0;

    for (Interval interval : timeIntervals) {
      for (int i = interval.start; i < interval.end; i++) {
        hourlyLoad[i]++;

        if (hourlyLoad[i] > maxRooms) {
          maxRooms = hourlyLoad[i];
        }
      }
    }

    return maxRooms;
  }

  public record Interval(int start, int end) {
    public static Interval of(int start, int end) {
      return new Interval(start, end);
    }
  }
}
