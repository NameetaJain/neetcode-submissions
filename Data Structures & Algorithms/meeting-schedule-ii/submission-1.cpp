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
     
        vector<int> rooms;
        for (Interval itval: intervals)
        {
            bool flgRoomFound = false;
            for (int i=0; i<rooms.size(); ++i)
            {
                if (rooms[i] <= itval.start)
                {
                    rooms[i] = itval.end;
                    flgRoomFound = true;
                    break;
                }
            }
            if (!flgRoomFound)
            {
                rooms.push_back(itval.end);
            }
        }
        return rooms.size();
    }
};
