class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        List<Integer> stonelist = new ArrayList<>();
        for(int stone : stones)
        {
            stonelist.add(stone);
        }
        while(stonelist.size() > 1)
        {
            Collections.sort(stonelist);
            int curr = stonelist.remove(stonelist.size() - 1) -
            stonelist.remove(stonelist.size() - 1);
            if(curr != 0) stonelist.add(curr);
        }
        return (stonelist.size() == 0) ? 0 : stonelist.get(0);
    }
}
