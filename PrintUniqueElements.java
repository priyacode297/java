class PrintUniqueElements {
    public static void main(String[] args) {
    int [] nums = {1,2,4,6,7,1,2};
    
    for (int i = 0; i < nums.length; i++){
        int count = 0;
        for (int j = 0; j < nums.length; j++){
            
            if(i!=j && nums[j]==nums[i]){
                count = 1;
                break;
            }
        }
        if(count==0){
            System.out.println(nums[i]);
        }
    }
    }

}