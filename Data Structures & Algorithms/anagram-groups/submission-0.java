class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedS = String.valueOf(chars);
            map.computeIfAbsent(sortedS,k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
