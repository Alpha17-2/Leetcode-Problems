class Solution {
    public int totalFruit(int[] a) {
        int n=a.length;
        int start = 0;
            int ans = 0;
            Map<Integer,Integer> last_indices = new HashMap<>();
            for (int i = 0; i <n ; i++) {
                last_indices.put(a[i],i);
                if(last_indices.size()>2){
                    int lastTreeIndex = Collections.min(last_indices.values());
                    last_indices.remove(a[lastTreeIndex]);
                    start = lastTreeIndex + 1;
                }
                ans = Math.max(ans,i-start+1);
            }
        return ans;
    }
}