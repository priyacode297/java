class FrequencyOfEachElement {
    public static void main(String[] args) {

        int[] nums = {1, 7, 9, 1, 6, 7, 8};

        for (int i = 0; i < nums.length; i++) {

            // Check if the current element appeared before
            boolean foundBefore = false;

            for (int k = 0; k < i; k++) {
                if (nums[i] == nums[k]) {
                    foundBefore = true;
                    break;
                }
            }

            // Skip if already printed
            if (foundBefore) {
                continue;
            }

            // Count frequency
            int count = 1;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            System.out.println(nums[i] + " = " + count + " times");
        }
    }
}