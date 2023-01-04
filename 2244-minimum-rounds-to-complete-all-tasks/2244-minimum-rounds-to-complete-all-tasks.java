class Solution {
    public static int minimumRounds(int[] a) {
       int n=a.length;
       if(n<2) return -1;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:a){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int count=0;
    // multiple of 3 like 3,6,9,12,...
        //for that c+=freq/3;    
    //other case like 2,4,5,7,8,10,11,13,14,16,17,18,...
        //here the pssible forms are 3*k+1=4,7,10,...
        //and 3*k+2=2,5,8,11,...
        // General formula when freq%3!=0  
             //      count+=(freq/3)+1;
        //  For freq=8, min possible tasks are 3,3,2=3(count) tasks equas to [(8//3)+1]
        //  for freq=11 min possible tasks are 3,3,3,2=4(count)tasks equal to  [11/3]+1
        for(int freq:mp.values()){
          //Base Case if for a task which has freq 1 ,it means we can't take becouse 
            //we must take task that oeither 2 or 3 of the same dificulti lavel 
            if(freq==1){
              return  -1;
            }
          if(freq%3==0){
              count+=freq/3;
          }else{
              count+=(freq/3)+1;
          }
        }
        return count;
    }
}