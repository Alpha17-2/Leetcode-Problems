class Solution {
    public int minStoneSum(int[] piles, int k) {
        int n = piles.length;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((integer, t1) -> t1 - integer);
        for (int i = 0; i < n; i++) {
            priorityQueue.add(piles[i]);
        }
        for (int i = 0; i < k; i++) {
            int peek = priorityQueue.peek();
            priorityQueue.poll();
            priorityQueue.add(peek % 2 == 0 ? (peek / 2) : (peek / 2) + 1);
        }
        int ans = 0;
        while (!priorityQueue.isEmpty()) {
            int pileValue = priorityQueue.peek();
            System.out.println(pileValue);
            ans += pileValue;
            priorityQueue.poll();
        }
        return ans;
    }
}