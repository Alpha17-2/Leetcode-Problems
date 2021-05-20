class Solution {
public:
    bool isNStraightHand(vector<int>& a, int n) {
       if(a.size()%n!=0) return false;
        map<int,int> m;
        int index = 0;
        for(auto x:a) m[x]++;
        int groupCount = 0;
        for(groupCount=0;groupCount<a.size()/n;groupCount++){
            if(m.empty())
                break;
            index = 0;
            vector<int> list;
            for (auto x : m)
            {
                if (index != 0 && (x.first - list[index - 1] != 1))
                        return false;
                list.push_back(x.first);
                index++;
                --m[x.first];
                if(m[x.first]==0)
                    m.erase(x.first);
                if(m.empty())
                    break;
                if(index==n)
                    break;
            }
        }
        return (groupCount == a.size() / n && index == n) ? true : false;
    }
};