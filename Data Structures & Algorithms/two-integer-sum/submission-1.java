class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int x = target - nums[i];
            if(map.containsKey(x))
            {
                ans[0] = map.get(x);
                ans[1] = i;
            }
            else map.put(nums[i],i);
        }
        Arrays.sort(ans);
        return ans;
    }
}
