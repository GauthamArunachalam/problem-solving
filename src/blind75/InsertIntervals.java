package blind75;

import utils.InputDataReader;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();

        for (int[] interval : intervals) {
            if (newInterval == null || interval[1] < newInterval[0]) {
                ans.add(interval);
            } else if (newInterval[1] < interval[0]) {
                ans.add(newInterval);
                ans.add(interval);
                newInterval = null;
            } else {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }
        if (newInterval != null) {
            ans.add(newInterval);
        }
        return ans.toArray(new int[ans.size()][2]);
    }

    public static void main(String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        int[][] intervals = inputDataReader.read2DIntArr();
        int[] newInterval = inputDataReader.readIntArr();
        int ans[][] = insert(intervals, newInterval);
        for (int[] interval : ans) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }
}
