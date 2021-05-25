class Solution {
public:
    string getSmallestString(int n, int k) {
        string s="";
        for(int i=0;i<n;++i) s+='a';
        if(n==k) return s;
        k-=n;
        int index=n-1;
        while(k>0){
            int newNumber = min(25,k);
            k-=newNumber;
            s[index] = s[index] + newNumber;
            index--;
        }
        return s;
    }
};
