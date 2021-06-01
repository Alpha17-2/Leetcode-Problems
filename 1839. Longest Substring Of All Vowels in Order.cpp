class Solution {
public:
    int longestBeautifulSubstring(string s) {       
    int n = s.size();
    int ans = 0;
    int a[n];
    for(int i=0;i<n;++i)
        a[i]=0;
    map<char, char> m;
    m['e'] = 'a';
    m['i'] = 'e';
    m['o'] = 'i';
    m['u'] = 'o';
    for (int i = 0; i < n;++i){
        char c = s[i];
            // edge case => 'a'
            if(c=='a')
            {
                if(i>0 && s[i-1]==c)
                    a[i] = a[i - 1] + 1;
                else
                    a[i] = 1;
            }
            else if(c=='u')
            {
                if(i>0){
                    if( (s[i-1] == 'u' || s[i-1] ==m[c]) && a[i-1]>0)
                        a[i] = a[i-1]+1;
                    else
                        a[i] = 0;
                }
                else
                    a[i] = 0;
                ans = max(ans, a[i]);
                
            }
            else
            {
                 if((i>0)  && (s[i-1]==c || s[i-1]==m[c]) && a[i-1]>0)
                    a[i] = a[i - 1] + 1;
            }
    }   
        return ans;
    }
};