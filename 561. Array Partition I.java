class Solution {
    public int arrayPairSum(int[] a) {
        Arrays.sort(a);
        int sum=0;
        for(int i=0;i<a.length;i+=2)
            sum+=a[i];        
        return sum;
    }
}