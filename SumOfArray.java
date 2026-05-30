import java.util.Scanner;
class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []  nums = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
         int result = 0;
        for ( int i = 0; i < nums.length; i++){
            result = result + nums[i]; 
        }
        System.out.println( " The sum of element is:" + result);
    }
}