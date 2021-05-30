class Solution {
public:
    int minPairSum(vector<int>& nums) {
        int ans = 0;
        sort(nums.begin(),nums.end());
        int n = nums.size();
        for(int i=0;i<n/2;++i){
            ans = max(ans , nums[i]+nums[n-i-1]);
        }
        return ans;
    }
};