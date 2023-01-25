class Solution {
     static int[] pair =new int[]{-1,-1};

   static int[] Binary_Search(int t,int[] a){
        int l=0;
        int h=a.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(a[mid]==t){
                pair[0]=a[mid];
                pair[1]=a[mid];
                break;
            }
            if(a[mid]<t){
               pair[0]=a[mid];
                l=mid + 1;
            }else{
                pair[1]=a[mid];
                  h=mid -1;
            }
        }
        return pair;
    }

    public static int findRadius(int[] houses, int[] heaters){
        Arrays.sort(heaters);
        int radius =Integer.MIN_VALUE;
        for(int i=0;i<houses.length; i++){
            int housePos=houses[i];
            pair= Binary_Search(housePos,heaters);
            int dis1=(pair[0]==-1) ? Integer.MAX_VALUE : housePos-pair[0];
            int dis2=(pair[1]==-1) ? Integer.MAX_VALUE : pair[1]-housePos;
            int mid=Math.min(dis1,dis2);
            radius=Math.max(radius,mid);
            pair[0]=-1;
            pair[1]=-1;
         
        }
       return radius;
    }
}