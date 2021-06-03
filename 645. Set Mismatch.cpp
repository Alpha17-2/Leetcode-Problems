class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        unordered_map<int,int> mymap;
        int n=nums.size();
        for(auto x:nums)
            mymap[x]++;
        
        vector<int>ans(2);
        int twice=0;
        int zero=0;
        for(int i=1;i<=n;++i)
        {
            if(mymap[i]==2)
                twice=i;
            else if(mymap[i]==0)
                zero=i;
            else
                continue;
        }
        ans[0]=twice;
        ans[1]=zero;
        return ans;
        
    }
};