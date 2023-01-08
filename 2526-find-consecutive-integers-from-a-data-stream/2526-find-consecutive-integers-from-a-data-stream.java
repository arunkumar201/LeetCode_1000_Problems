class DataStream {

     HashMap<Integer,Integer> mp;
    int v=0;
    int k=0;
    public DataStream(int value, int k) {
        mp=new HashMap<Integer,Integer>();
        this.v=value;
        this.k=k;
    }
    
    public boolean consec(int num) {
        if(num==v){
            System.out.print(num);
             mp.put(num,mp.getOrDefault(num,0)+1);
            if(mp.get(num)>=k)  return true;
            else return false;  
        }
        else 
        {
             mp.put(v,0);
            return false; 
        }
           
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */