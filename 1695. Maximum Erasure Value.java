class Solution {
    public int maximumUniqueSubarray(int[] a) {
        Map<Integer,Integer> mymap = new HashMap<Integer,Integer>();
        int s=0,n=a.length;
        int[] num = new int[n+1];
        num[0] = 0;
        
        // the working array
        for(int i=1;i<=n;++i) num[i] = a[i-1] ;
        
        int[] sum = new int[n+1];
        sum[0] = 0;
        sum[1] = num[1];
        
        // prefix sum array
        for(int i=2;i<=n;++i) sum[i] = sum[i-1]+num[i];
        
        int f=0;
        for(int i=1;i<=n;++i){
            
            if(mymap.containsKey(num[i])){
                
                if(mymap.get(num[i]) > f) f=mymap.get(num[i]) ;
            }
            mymap.put(num[i],i);
            s = Math.max(s,sum[i]-sum[f]);
        }
        return s;
    }
}