import java.util.Arrays;

public class overlapping_Intervals {
    public static int eraseOverlapIntervals(int[][] intervals) {
        // Sort intervals by their end time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int end = Integer.MIN_VALUE;

        for (int[] interval : intervals) {
            if (interval[0] >= end) {
                count++; // This interval doesn't overlap, keep it
                end = interval[1]; // Update end to current interval's end
            }
        }

        // Total intervals - non-overlapping = number of intervals to remove
        return intervals.length - count;
    }

    public static void main(String[] args) {
        int[][] intervals = {
            {1, 6},
            {2, 3},
            {2, 4},
            {3, 4},
            {4, 5},
            {5, 9},
            {6, 7},
            {8, 9}
        };

        int result = eraseOverlapIntervals(intervals);
        System.out.println("Minimum number of intervals to remove: " + result);
    }

}
