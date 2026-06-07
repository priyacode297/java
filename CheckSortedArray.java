class CheckSoretdArray {
    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 3, 7};

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] > nums[i + 1]) {
                ascending = false;
            }

            if (nums[i] < nums[i + 1]) {
                descending = false;
            }
        }

        if (ascending || descending) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}