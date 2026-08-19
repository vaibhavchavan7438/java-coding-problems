package array.easy;

import java.util.Arrays;

public class MoveZeroesToRight {
    public static void main(String[] args) {
        int[] arr={2,3,0,5,4,0,0,0,76,34,342,24};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
        }

        while(index<nums.length){
            nums[index]=0;
            index++;
        }
    }
}
