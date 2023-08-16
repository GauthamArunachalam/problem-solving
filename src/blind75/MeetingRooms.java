package blind75;

import utils.InputDataReader;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MeetingRooms {

    public static class Interval{
        private int start, end;

        public Interval(int start, int end){
            this.start = start;
            this.end = end;
        }

        public int getStart(){
            return this.start;
        }

        public int getEnd(){
            return this.end;
        }

        public static Interval createAInterval(InputDataReader inputDataReader){
            int startTime = inputDataReader.readSingleInt();
            int endTime = inputDataReader.readSingleInt();
            return new Interval(startTime, endTime);
        }
    }

    public static boolean canAttendMeetings(List<Interval> intervals){
        Comparator<Interval> comparator = (interval1, interval2) -> Integer.compare(interval1.getStart(), interval2.getStart());
        intervals.sort(comparator);

        for(int i=1;i<intervals.size();i++){
            if(intervals.get(i-1).getEnd() > intervals.get(i).getStart()){
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int n = inputDataReader.readSingleInt();
        List<Interval> intervals = new ArrayList<Interval>();
        for(int i=0;i<n;i++){
            intervals.add(Interval.createAInterval(inputDataReader));
        }

        System.out.println(canAttendMeetings(intervals));
    }
}
