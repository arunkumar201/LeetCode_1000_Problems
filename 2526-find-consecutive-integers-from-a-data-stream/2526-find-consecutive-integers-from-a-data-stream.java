class DataStream {
     HashMap<Integer,Integer> mp;
    int v=0;
    int k=0;
    int count=0;
    public DataStream(int value, int k) {
        this.v=value;
        this.k=k;

    }
    public boolean consec(int num) {
        if(num==v) count++;
        else count=0; 
        return count>=k;
           
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */