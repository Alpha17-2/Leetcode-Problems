class Solution {
public:
    int countQuadruplets(vector<int>& a) {
        int ans=0;
        int n=a.size();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int sum = a[i]+a[j]+a[k];
                    for(int m=k+1;m<n;m++){
                        if(a[m]==sum)
                            ans++;
                    }
                }
            }
        }
        return ans;
    }
};