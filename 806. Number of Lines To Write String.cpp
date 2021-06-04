class Solution {
public:
    vector<int> numberOfLines(vector<int>& w, string s) {
        int lines = 1 , left=0 ,cc = 0;
        for(int i=0;i<s.size();++i){
           if(cc + w[s[i]-'a']>100){
               lines++;
               cc=0;
           }
            cc+=w[s[i]-'a'];
        }
    
        vector<int> ans(2);
        ans[0]=lines;
        ans[1]=cc;
        return ans;
    }
};