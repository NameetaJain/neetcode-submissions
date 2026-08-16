/**
 * Definition of Interval:
 * class Interval {
 * public:
 *     int start, end;
 *     Interval(int start, int end) {
 *         this->start = start;
 *         this->end = end;
 *     }
 * }
 */

class Solution {
public:
    int minMeetingRooms(vector<Interval>& intervals) 
    {
        sort(intervals.begin(), intervals.end(),
     [](const Interval &a, const Interval &b) {
         return a.start < b.start;
     });

        priority_queue<int, vector<int>, greater<int>> rooms;
        for (Interval itval: intervals)
        {
            if (rooms.size() == 0)
            {
                rooms.push(itval.end);
                continue;
            }

            if (rooms.top()<=itval.start)
            {
                rooms.pop();
            }
                rooms.push(itval.end);
        }
        return rooms.size();
    }
};
