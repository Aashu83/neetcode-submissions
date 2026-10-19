class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones)
        {
            q.offer(stone);
        }
        while(q.size() > 1)
        {
            int stone1 = q.poll();
            int stone2 = q.poll();
            if(stone1 > stone2) q.offer(stone1 - stone2);
        }
        return (q.size() == 1) ? q.peek() : 0; 
    }
}
