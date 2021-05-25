
// O(n^2) approach 

class Solution {
public:
    int maxSatisfaction(vector<int>& a) {
        int n=a.size();
        sort(a.begin(),a.end());
        int mx = 0;
        for(int i=0;i<n;++i){
            int sum = 0;
            int index = 1;
            for(int j=i;j<n;++j,index++) {
                sum = sum + (index*a[j]);
            }
            mx=max(sum,mx);
        }
        return mx;        
    }
};

// O(nlogn) approach

class Solution {
public:
    int maxSatisfaction(vector<int>& satisfaction) {
        
        sort(satisfaction.begin(),satisfaction.end());
        int n = satisfaction.size();
        
        int Cumulative_sum = 0; // From back
        
        int ans = 0;
        int cur = 0;
        for(int i = n-1;i>=0;i--)
        {
            cur += Cumulative_sum + satisfaction[i];
            Cumulative_sum += satisfaction[i];   
            ans = max(ans,cur);
        }
        return ans;      
    }
};
