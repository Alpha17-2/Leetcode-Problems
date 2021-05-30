class Solution {
public:
    bool check(vector<char> v){
    if(v[0]!=v[1] && v[1]!=v[2] && v[0]!=v[2]) return true;
    return false;
    }
    int countGoodSubstrings(string s) {
       vector<char> myset(3);
        myset[0] = s[0];
        myset[1] = s[1];
        myset[2] = s[2];
        int c = 0;
        if(check(myset))
            ++c;
        for(int i=3;i<s.size();++i){
        myset.erase(myset.begin());
        myset.push_back(s[i]);
        if(check(myset))++c;
        }
        return c;
    }
};