class PrintDuplicateElements {
    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 1};

        for (int i = 0; i < nums.length; i++) {

            boolean foundBefore = false;

            for (int k = 0; k < i; k++) {
                if (nums[i] == nums[k]) {
                    foundBefore = true;
                    break;
                }
            }

            if (foundBefore) {
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println(nums[i]);
                    break;
                }
            }
        }
    }
}