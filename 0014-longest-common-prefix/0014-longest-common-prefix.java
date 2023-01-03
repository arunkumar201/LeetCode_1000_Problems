class Solution {
public:
      string longestCommonPrefix(vector<string>& strs) {
        int n=strs.size();
        string s="";
        if(strs[0].length()==0 || n==1){
            return strs[0];
        }
        for(int i=0;i<strs[0].length();i++){
            int f=1;
            for(int j=1;j<n;j++){
                if(strs[0][i]!=strs[j][i]){
                    f=0;
                    break;
                    
                }
               
            }

          if(f==0){
              break;
          }else{
              s+=strs[0][i];
          }
            
        }
        return s;
        
    }
};