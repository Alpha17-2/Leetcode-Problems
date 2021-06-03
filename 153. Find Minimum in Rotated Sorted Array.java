class Solution {
    public int findMin(int[] a) {
        int n=a.length;
        int start=0,last=n-1;
        int pivot=-1;
        while(start<=last)
        {
            int mid=start+(last-start)/2;
            if(mid!=n-1 && a[mid]>a[mid+1])
            {
                pivot=mid;
                break;
            }
            if(a[mid]>=a[start])
                start=mid+1;
            else
                last=mid-1;
        }
        return a[pivot+1];       
    }
}