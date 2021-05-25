class Solution {
public:
    int heightChecker(vector<int>& heights) {
        int c=0;
        vector<int>a(heights.size());
        for(int i =0;i<heights.size();++i)
            a[i]=heights[i];
        sort(a.begin(),a.end());
        for(int i=0;i<a.size();++i){
            if(heights[i]!=a[i]) c++;
        }
        return c;
    }
};