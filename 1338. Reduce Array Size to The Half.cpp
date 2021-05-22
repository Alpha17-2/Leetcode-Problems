class Solution {
public:
    int minSetSize(vector<int>& a) {
        int n = a.size();
        int half = n/2;
        unordered_map<int,int> m;
        vector<int> p;
        for(auto x:a){
            m[x]++;
        }
        for(auto x:m){
            p.push_back(x.second);
        }
        sort(p.rbegin(),p.rend());
        int c=0,sum=0,i=0,k=p.size();
        while(sum<half && i<k){
            sum+=p[i];
            c++;
            i++;
        }
        return c;
    }
};