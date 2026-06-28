
import java.util.Arrays;

class ReverseArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int a = 0;
        int b = nums.length - 1;
        int temp;

        while (a < b) {

            temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;

            a++;
            b--;
        }

        System.out.println(Arrays.toString(nums));
    }
}
