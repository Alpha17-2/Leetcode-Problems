class Solution {
public:
    bool uniqueOccurrences(vector<int>& a) {
        unordered_map<int,int> m;
        unordered_set<int> s;
        for(auto x:a) m[x]++;
        for(auto x:m) s.insert(x.second);
        if(m.size()==s.size()) return true;
        else return false;
    }
};