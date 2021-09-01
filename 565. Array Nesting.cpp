class Solution {
public:
    int arrayNesting(vector<int>& a) {
        int n=a.size();
       vector<bool> visited(n,false);
       int ans = INT_MIN;
       for(int i=0;i<n;i++){
         int count = 1;
         int currentIndex = a[i];
         visited[i]=true;
         while(currentIndex>=0 && currentIndex<n && !visited[currentIndex]){
             count++;
             visited[currentIndex]=true;
             currentIndex=a[currentIndex];
         }
         ans = max(count,ans);  
       }
        return ans;
    }
};