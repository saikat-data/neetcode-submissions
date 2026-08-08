class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for(int weight : weights){
            left = Math.max(left,weight);
            right += weight;
        }
       while(left<right){
        int mid = left +(right-left)/2;
        int reDay = 1;
        int cuWeight = 0;
        for(int weight : weights){
            if(cuWeight+weight>mid){
                reDay++;
                cuWeight = 0;
            }
            cuWeight +=weight;
        }
        if(reDay>days){
            left = mid +1;

        }
        else {
            right = mid;
        }
       }
        return left;


        
        
    }
}