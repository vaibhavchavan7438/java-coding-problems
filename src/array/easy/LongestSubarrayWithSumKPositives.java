package array.easy;

public class LongestSubarrayWithSumKPositives {
    public static void main(String[] args) {
        //nums = [10, 5, 2, 7, 1, 9], k = 15
        int[] nums={10, 5, 2, 7, 1, 9};
        System.out.println(longestSubarrayFinder(nums,15));


    }
    public static int longestSubarrayFinder(int[] nums, int k){
        int currSum=0;
        int left=0;
        int max=0;
        for (int right = 0; right < nums.length; right++) {
            currSum+=nums[right];
            if(currSum==k){
                max=Math.max(right-left+1,max);
            } else if (currSum>k) {
                currSum-=nums[left];
                left++;
            }
        }
        return max;


    }
}
