class Solution {
public:
    int finalValueAfterOperations(vector<string>& s) {
        int n=s.size();
        int ans = 0;
        for(int i=0;i<n;i++){
            if(s[i]=="++X"||s[i]=="X++") ++ans;
            else --ans;
        }
        return ans;
    }
};