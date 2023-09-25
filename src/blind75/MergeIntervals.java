package blind75;

import utils.InputDataReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        List<int[]> mergedInterval = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        mergedInterval.add(intervals[0]);
        for (int i=1; i<intervals.length; i++) {
            int currStart = intervals[i][0];
            if (currStart <= mergedInterval.get(mergedInterval.size()-1)[1]) {
                mergedInterval.get(mergedInterval.size()-1)[1] = Math.max(mergedInterval.get(mergedInterval.size()-1)[1], intervals[i][1]);
            } else {
                mergedInterval.add(intervals[i]);
            }
        }
        return mergedInterval.toArray(new int[mergedInterval.size()][2]);
    }

    public static void main(String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        int[][] intervals = inputDataReader.read2DIntArr();

        int[][] ans = merge(intervals);
        for (int[] interval : ans) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }
}
