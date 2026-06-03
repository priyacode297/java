import java.util.Scanner;

class CountOddNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.println("Enter the five numbers:");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                count++;
            }
        }

        System.out.println("The Odd numbers are: " + count);
    }
}