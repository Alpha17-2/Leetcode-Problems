class Solution {
    public String maximumTime(String time) {
            
        char[] a = time.toCharArray();
        
        for(int i=0;i<a.length;++i)
        {
            if(a[i]=='?')
            {
                if(i==0)
                {
                    if(a[i+1]=='?')
                    {
                        a[i]='2';
                        a[i+1]='3';
                    }
                    else
                    {
                        if(a[i+1]-'0'>=4)
                            a[i]='1';
                        else
                            a[i]='2';
                    }
                }
                else if(i==1)
                {
                    if(a[i-1]=='2')
                        a[i]='3';
                    else 
                        a[i]='9';
                }
                else if(i==3)
                {
                    a[i]='5';
                }
                else if(i==4)
                {
                    a[i]='9';
                }
            }
        }
        String ans = "";
        for(int i=0;i<a.length;++i)
            ans+=a[i];
        return ans;
        
    }
}