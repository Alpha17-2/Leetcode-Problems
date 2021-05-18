class Solution {
    public boolean validMountainArray(int[] a) {
      int index = -1 , n=a.length;
        for(int i=1;i<n;++i)
      {
          if(a[i]>a[i-1])
              continue;
          else
          {
              if(a[i]==a[i-1]) //Not strictly increasing
                  return false;
              else
              {
                  if(i<2)
                      return false; // Decreasing order
                  index = i; // Valid Pivot found
                  break;
              }
          }
      }
        if(index == -1) // Not found any pivot
            return false;
        
        for(int i=index+1;i<n;++i)
        {
            if(a[i]>=a[i-1])
                return false;
        }
        return true;
    }
}