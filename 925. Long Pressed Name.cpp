class Solution {
public:
    bool isLongPressedName(string name, string type) {
        int np = 0,tp=0;
        while(np<name.size()){
            if(name[np] == type[tp]){
                np++;
            }
            else
            {
                if(type[tp] == name[np])
                    np++;
                else if(np>0 && type[tp] == name[np-1])
                {
                    
                }
                else
                    return false;
            }
            tp++;
        }
        for(int i=tp;i<type.size();++i) 
            if(type[i]!=name[name.size()-1]) return false;
        
        return true;
    }
};