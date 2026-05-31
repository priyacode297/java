import java.util.Arrays; 
import java.util.Scanner;
class LinearSearch{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int i; 
        int[] nums = new int [5];
        System.out.println("Enter the 5 numbers:");
        for(i=0; i < 5; i++){
        nums[i] = sc.nextInt();}
        System.out.println("Enter the search element:");
         int target = sc.nextInt();
       
       for(i = 0; i < nums.length; i++){
           if(target == nums[i]){
               System.out.println("Target is found at index:" + i);
               break;
           }
       }
         if( i == nums.length){
           System.out.println("traget doesn't found");
       }
    }
}