class Solution {
public:
    bool lemonadeChange(vector<int>& a) {
        int n=a.size();
        if(n==0) return true;
        if(a[0]!=5) return false;
        stack<int>coin_of_five;
        stack<int>coin_of_ten;
        stack<int>coin_of_fifteen;
            coin_of_five.push(5);
            bool ans=true;
            for(int i=1;i<n;i++) 
            {
            if(a[i]==10)
                {
                    if(!coin_of_five.empty())
                    {
                        coin_of_ten.push(10);
                        coin_of_five.pop();
                    }
                    else
                    {
                        ans=false;
                        break;
                    }
                }
            else if(a[i]==15)
                {
                    if(!coin_of_ten.empty())
                    {
                        coin_of_fifteen.push(15);
                        coin_of_ten.pop();
                    }
                    else if(!coin_of_five.empty())
                    {
                        coin_of_five.pop();
                        if(coin_of_five.empty())
                        {
                            ans=false;
                            break;
                        }
                        else
                        {
                            coin_of_fifteen.push(15);
                            coin_of_five.pop();
                        }
                    }
                    else
                    {
                        ans=false;
                        break;
                    }
            }
        else
            coin_of_five.push(5);
        }
            return ans;
    }
};