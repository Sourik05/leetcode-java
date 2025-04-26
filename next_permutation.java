class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        // Step 1: Find the first decreasing element from the right
        int pos = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pos = i;
                break;
            }
        }

        if (pos != -1) { // If a decreasing element is found
            // Step 2: Find the smallest element larger than nums[pos] to the right of it
            for (int i = n - 1; i > pos; i--) {
                if (nums[i] > nums[pos]) {
                    // Swap the elements
                    int temp = nums[i];
                    nums[i] = nums[pos];
                    nums[pos] = temp;
                    break;
                }
            }
        }

        // Step 3: Reverse the suffix to get the smallest lexicographical order
        reverse(nums, pos + 1, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}