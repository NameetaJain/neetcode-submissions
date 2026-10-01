class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        int[] interval;

        if(intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        int s = intervals[0][0], e = intervals[0][1];

        for(int i = 1; i < intervals.length; i++){
            if(e >= intervals[i][0]){
                e = Math.max(e,intervals[i][1]);
                continue;
            } else {
                interval = new int[]{s,e};
                result.add(interval);
                s = intervals[i][0];
                e = intervals[i][1];
            }
        }

        interval = new int[]{s,e};
        result.add(interval);
        return result.toArray(new int[result.size()][]);
    }
}
