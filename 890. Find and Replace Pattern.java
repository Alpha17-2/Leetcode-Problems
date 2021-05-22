class Solution {
    public List<String> findAndReplacePattern(String[] s, String p) {
        List<String> ans = new ArrayList<>();
        for(int i=0;i<s.length;++i){
            String st = s[i];
            Map<Character,Character> lf = new HashMap<>();
            Set<Character> set = new HashSet<>();
            boolean valid = true;
            for(int j=0;j<p.length();++j)
            {
                if(lf.containsKey(p.charAt(j)))
                {
                    if(lf.get(p.charAt(j))!=st.charAt(j))
                    {
                        valid=false;
                        break;
                    }
                }
                else{
                    if(set.contains(st.charAt(j))){
                        valid = false;
                        break;
                    }
                    else{
                      lf.put(p.charAt(j),st.charAt(j));
                      set.add(st.charAt(j));
                    }
                }
            }
            if(valid) ans.add(st);
        }
        return ans;
    }
}