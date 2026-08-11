package array.easy;

import java.util.Arrays;

public class RightRotateByOne {
    public static void main(String[] args) {
        int[] arr = {34,45,23,11,435,565,22,112};
        rotate(arr,1);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
        int len=nums.length;
        k=len%k;
        int temp=nums[len-1];
        for(int i=len-1;i>0;i--){
            nums[i]=nums[i-1];

        }
        nums[0]=temp;




    }
}
