class Solution {
    public int[] processQueries(int[] a, int m) {
            int n=a.length;
            LinkedList<Integer> mylist =new LinkedList<>();
            for(int i=1;i<=m;i++){
                mylist.add(i);
            }
            int[] ans =new int[n];
            for(int i=0;i<n;++i){
                int query = a[i];
                int index = mylist.indexOf(query);
                //System.out.println(index);
                mylist.remove(index);
                mylist.addFirst(query);;
                ans[i]=index;
            }
        return ans;
    }
}