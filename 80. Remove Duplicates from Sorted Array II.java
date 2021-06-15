class Solution {
    public int removeDuplicates(int[] a) {
        
        int n=a.length;
        int ans = 2;
        for(int i=2;i<n;i++){
            if(a[i]!=a[ans-2])
                a[ans++]=a[i];
        }
        return ans;
    }
}