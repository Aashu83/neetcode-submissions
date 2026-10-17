class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        return (set.size() != n);
    }
}