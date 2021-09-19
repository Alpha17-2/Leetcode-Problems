class Solution {
public:
    int sumOfBeauties(vector<int>& a) {
        int n = a.size();
        vector<int> leftmax(n);
        vector<int> rightmin(n);
        int cl = INT_MIN,cr=INT_MAX;
        int ans = 0;
        for(int i=0;i<n;i++) {
            cl = max(a[i],cl);
            leftmax[i]=cl;
        }
        for(int i=n-1;i>=0;i--){
            cr = min(a[i],cr);
            rightmin[i] = cr;
        }
        for(int i=1;i<n-1;i++){
            if(a[i]>leftmax[i-1] && a[i]<rightmin[i+1])
                ans+=2;
            else if(a[i-1]<a[i] && a[i]<a[i+1])
                ans+=1;
        }
        return ans;
    }
};