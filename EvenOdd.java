class OddEven {
    public static void main(String[] args) {
        int Even = 0;
        int Odd = 0;
        int [] nums = {2,4,5,6,7};
        for ( int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 0){
                Even++;
            }else
            Odd++;
        }
        System.out.println("The even numbers are:" + Even);
        System.out.println("The odd numbers are:" + Odd);
    }
}
        