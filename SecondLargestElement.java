// To find second largest element in an array
import java.util.Scanner;
class SecondLargestElement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int [] nums = new int [5];
        
        System.out.println("Enter the 5 numbers:");
       
        for(int i = 0; i < nums.length; i++) {
         nums[i] = sc.nextInt();
    }
    int largest = nums[0];
    int secondlargest = 0;
     
    for(int i=1; i < nums.length; i++) {
         
        if(largest < nums[i]){
             secondlargest = largest;
             largest = nums[i];
         
            }else if(nums[i] > secondlargest && nums[i] != largest) {
         secondlargest = nums[i];
     }
     
     }
     System.out.println("The second Largest element is:" + secondlargest);
  }
}