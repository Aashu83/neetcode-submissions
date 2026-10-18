class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n == 0) return 0;
        int l = 0;
        int ans = Integer.MIN_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int r=0;r<n;r++)
        {
           map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0) + 1);
           while(map.get(s.charAt(r)) > 1)
           {
            map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0) - 1);
            l++;
           }
           ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}
