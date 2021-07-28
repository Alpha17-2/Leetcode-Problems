class Solution {
    
    public String current(String prev){
        int count = 0;
        String ans = "";
        int i=0,n=prev.length();
        while(i<n){
            
            int j=i;
            while(j<n && i<n && prev.charAt(j)==prev.charAt(i)){
                j++;
                count++;
            }
            ans+=(String.valueOf(count)+prev.charAt(i));
            i=j;
            count = 0;
        }
        return ans;
    }
    public String countAndSay(int n) {
        n--;
        String ans="1";
        while(n-->0){
            ans = current(ans);
        }
        
        return ans;
    }
}