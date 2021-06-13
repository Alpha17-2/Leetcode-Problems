class Solution {
public:
    bool makeEqual(vector<string>& s) {
        map<char,int> m;
        for(auto x:s){
            for(int i=0;i<x.size();i++){
                m[x[i]]++;
            }
        }
        int n = s.size();
        bool ans = true;
        for(auto x:m){
            if(x.second % n != 0 )
            {
                ans=false;
                break;
            }
        }
        return ans;
    }
};