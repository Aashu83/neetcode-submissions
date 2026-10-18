class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            int[] count = new int[26];
            for(char c : s.toCharArray())
            {
                count[c - 'a'] ++;
            }
            String countS = Arrays.toString(count);
            map.computeIfAbsent(countS,k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
