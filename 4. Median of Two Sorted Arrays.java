class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n=a.length;
        int m=b.length;
        int t=n+m;
        int[] c=new int[t];
        int ind=0;
        for(int i=0;i<n;++i)
            c[ind++]=a[i];
        for(int i=0;i<m;++i)
            c[ind++]=b[i];
        Arrays.sort(c);
        double ans=0.0;
        int f1=t/2;
        if(t%2==0)
            ans = (c[f1]+c[f1-1])/(double)2;
        else
            ans = (double)c[f1];
        return ans;
    }
}