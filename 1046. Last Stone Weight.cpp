class Solution {
public:
    int lastStoneWeight(vector<int>& stones) {
        
        priority_queue<int> p;
        int destory = 0 , todestroy = stones.size()-1;
        
        for(auto x:stones)
            p.push(x);
        
        int ans=p.top();
        
        while(!p.empty())
        {
            int t1=p.top();
            p.pop();
            if(p.empty())
            {
                ans=t1;
                break;
            }
            int t2=p.top();
            p.pop();
            if(t1==t2)
                p.push(0);
            else
                p.push(abs(t1-t2));
        }
        return ans;
    }
};