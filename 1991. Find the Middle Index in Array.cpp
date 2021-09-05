class Solution {
public:
    int findMiddleIndex(vector<int>& a) {
        int n=a.size();
        if(n==1) return 0;
        int leftSum[n];
        int rightSum[n];
        leftSum[0]=a[0];
        rightSum[n-1]=a[n-1];
        for(int i=1;i<n;i++)
            leftSum[i]=leftSum[i-1]+a[i];
        for(int i=n-2;i>=0;i--)
            rightSum[i]=rightSum[i+1]+a[i];
         if(n>1 && rightSum[1]==0)
            return 0;
        for(int i=1;i<n-1;i++){
            if(leftSum[i-1]==rightSum[i+1])
            {
                return i;
            }   
        }
         if(n>1 && leftSum[n-2]==0)
            return n-1;
        return -1;
}
};