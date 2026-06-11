class PreeviousAndNextElement {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,6};
        int target = 3;

        for(int i = 0; i < nums.length; i++) {

            if(target == nums[i]) {

                if(i > 0) {
                    System.out.println("Previous: " + nums[i - 1]);
                } else {
                    System.out.println("No previous element");
                }

                if(i < nums.length - 1) {
                    System.out.println("Next: " + nums[i + 1]);
                } else {
                    System.out.println("No next element");
                }

                break;
            }
        }
    }
}