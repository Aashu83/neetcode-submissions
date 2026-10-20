class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String str = Arrays.toString(arr);
            map.putIfAbsent(str,new ArrayList<>());
            map.get(str).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
