package array.easy;

import java.util.Arrays;

public class RightRotateByKPlaces {

    public static void main(String[] args) {
        int[] arr = {34,45,23,11,435,565,22,112};
        rotate(arr,3);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k%len;

        // while (k > 0) {
        //     int temp = nums[len - 1];
        //     for (int i = len - 1; i > 0; i--) {
        //         nums[i] = nums[i - 1];

        //     }
        //     nums[0]=temp;

        // }

        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);





    }

    public static void reverse(int[] nums, int left, int right){
        // int left=0;
        // int right=nums.length-1;

        while(left<right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;right--;
        }

    }

}
