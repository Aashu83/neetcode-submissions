class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxarea = Integer.MIN_VALUE;
        int l = 0;
        int r = n-1;
        while(l < r)
        {
            int len = r - l;
            int h = Math.min(heights[l],heights[r]);
            maxarea = Math.max(maxarea,len*h);
            if(heights[l] < heights[r]) l++;
            else r--;
        }
        return maxarea;
    }
}
