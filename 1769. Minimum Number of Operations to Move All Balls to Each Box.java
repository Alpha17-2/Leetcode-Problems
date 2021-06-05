class Solution {
    public int[] minOperations(String s) {
      int n=s.length();
            int[] ans=new int[n];
            List<Integer> list =new ArrayList<>();
            for (int i=0;i<n;++i) if(s.charAt(i)=='1') list.add(i);
            for(int i=0;i<n;++i){
                int sum = 0;
                for (int j = 0; j <list.size() ; j++) {
                    sum+=Math.abs(list.get(j)-i);
                }
                ans[i]=sum;
            }
        return ans;
    }
}