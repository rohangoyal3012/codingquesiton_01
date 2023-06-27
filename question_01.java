public class question_01 {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int currentPos = 0; currentPos < nums.length; currentPos++) {
            if (nums[currentPos] != 0) {
                nums[insertPos] = nums[currentPos];
                insertPos++;
            }
        }

        for (int i = insertPos; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        Solution solution = new Solution();
        solution.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
