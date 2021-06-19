class Solution {
    public int longestOnes(int[] a, int k) {
        int count = 0,s=0 ,ans = 0,n=a.length;
            for (int i = 0; i <n ; i++) {
                if(a[i]==0)
                    count++;
                while(count>k)
                {
                    if(a[s]==0)
                        count--;
                    s++;
                }
                ans = Math.max(ans,i-s+1);
            }
            return ans;
    }
}