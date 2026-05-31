import java.util.Scanner;

class AverageOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter" + " "+ n +" "+ "elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            result = result + nums[i];
        }

        double average = (double) result / n;

        System.out.println("The Average is: " + average);
    }
}
