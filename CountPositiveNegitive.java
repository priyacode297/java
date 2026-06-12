class CountPositiveNegativeZero {
   static int zeros;
       static int negitiveCount;
         static int postiveCount;
    public static void main(String[] args) {
        int [] nums = {-1,-2,-3,-4,0,0,1,2,3,4};
        for (int i = 0; i < nums.length; i++){
            if(nums[i]==0){
                 zeros++;
            }
            else if(nums[i] < 0){
                negitiveCount++;
            }
            else {
                postiveCount++;
            }
            
        }
        System.out.println("The negitive numbesr are:" + negitiveCount);
        System.out.println("The positive numbers are:" + postiveCount);
        System.out.println("The zeros are:" + zeros);
    }
}