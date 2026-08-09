package array.easy;

import java.util.Arrays;

public class Remove_Duplicates_From_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        int ind=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[ind]){
                ind++;
                nums[ind]=nums[i];
            }
        }
        return ind+1;
    }

    public static void main(String[] args) {

        int[] arr={1,1,3,4,4,4,4,8};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}
