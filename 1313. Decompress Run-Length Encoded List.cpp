class Solution {
public:
    vector<int> decompressRLElist(vector<int>& a) {
        vector<int>ans;
        for(int i=0;i<a.size();i+=2){
            int value = a[i+1];
            int freq =a[i];
            for(int j=0;j<freq;j++) ans.push_back(value);
        }
        return ans;
    }
};