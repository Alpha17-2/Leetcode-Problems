class Solution {
    public int longestConsecutive(int[] a) {
        int n = a.length;
         Map<Integer,Boolean> mymap = new HashMap<>();
            for(int i=0;i<n;i++){
                int value = a[i];
                mymap.putIfAbsent(value,false);
            }

            int ans = 0;
            for(int i : mymap.keySet()) {
                if (!mymap.get(i)) {
                    int count = 1;
                    int currentValue = i;
                    // find values more than currentValue
                    int rightValue = currentValue + 1;
                    while(mymap.containsKey(rightValue) && !mymap.get(rightValue)){
                        mymap.put(rightValue,true);
                        rightValue++;
                        count++;
                    }
                    // find values less than currentValue
                    int leftValue = currentValue - 1;
                    while (mymap.containsKey(leftValue) && !mymap.get(leftValue)){
                        mymap.put(leftValue,true);
                        leftValue--;
                        count++;
                    }
                    ans = Math.max(ans,count);
                }

            }
        return ans;
        
    }
}