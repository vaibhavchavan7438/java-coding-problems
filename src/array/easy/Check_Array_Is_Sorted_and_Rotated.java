package array.easy;

public class Check_Array_Is_Sorted_and_Rotated {
    public static void main(String[] args) {
    int[] arr={2,1,3,4};  //false
        //int[] arr={3,4,5,1,2}; //true
        System.out.println(check(arr));
    }

    public static boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }

        }
        if(count>0 && nums[0]<nums[nums.length-1]){
            return false;
        }
        return count<=1 ;
    }
}
