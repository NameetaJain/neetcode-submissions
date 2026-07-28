class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int start = 0, end = heights.length - 1;
        int width = heights.length - 1;
        for(int i = 0; i < heights.length; i++){

            int area = width * Math.min(heights[start], heights[end]);
            maxArea = Math.max(maxArea, area);

            if(heights[start] < heights[end])
                start++;
            else
                end--;
            width--;
        }

        return maxArea;
    }
}
