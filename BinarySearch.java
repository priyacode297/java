class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8};
        int target = 5;
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            int mid = (start + end)/2;
            if(target < nums[mid]){
                end = mid -1;
            }
             else if(target >nums[mid]){
                start = mid+1;
            }
            else{
                System.out.println(mid);
                 return;
            }
        }
        System.out.println("Not found");
    }
}