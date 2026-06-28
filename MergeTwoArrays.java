import java.util.Arrays;

class MergeTwoArrays {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int[] nums2 = {5, 6, 7, 8};

        int k = 0;
        int[] nums3 = new int[nums.length + nums2.length];

        for (int i = 0; i < nums.length; i++) {
            nums3[k] = nums[i];
            k++;
        }

        for (int j = 0; j < nums2.length; j++) {
            nums3[k] = nums2[j];
            k++;
        }

        System.out.println(Arrays.toString(nums3));
    }
}
