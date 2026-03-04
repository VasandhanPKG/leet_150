class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{binary(nums, target, true), binary(nums, target, false)};
    }

    private int binary(int[] nums, int target, boolean findFirst) {
        int s = 0, e = nums.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target > nums[mid]) {
                s = mid + 1;
            } else if (target < nums[mid]) {
                e = mid - 1;
            } else {
                ans = mid;
                if (findFirst) {
                    e = mid - 1; // keep searching left
                } else {
                    s = mid + 1; // keep searching right
                }
            }
        }
        return ans;
    }
}