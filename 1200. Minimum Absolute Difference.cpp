class Solution {
public:
    vector<vector<int>> minimumAbsDifference(vector<int>& a) {
        int n=a.size();
        sort(a.begin(),a.end());
        int m=INT_MAX;
        for(int i=1;i<n;++i){
            m = min(a[i]-a[i-1],m);
        }
        
        vector<vector<int>> ans ;
        
        for(int i=1;i<n;++i){
            if(a[i]-a[i-1]==m){
                ans.push_back({a[i-1],a[i]});
            }
        }
        return ans;
    }
};