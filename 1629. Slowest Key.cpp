class Solution {
public:
    char slowestKey(vector<int>& a, string s) {
        map<char,int> freq;
        for(int i=0;i<s.size();i++){
            if(i==0){
                freq[s[i]]=a[i];
            }
            else{
                freq[s[i]]=max(freq[s[i]],a[i]-a[i-1]);
            }
        }
        char ans=' ';
        int max = 0;
        for(auto x:freq){
            if(x.second>max){
                max=x.second;
                ans=x.first;
            }
            else if(x.second==max && x.first>ans){
                ans = x.first;
            }
        }
        return ans;
        
    }
};