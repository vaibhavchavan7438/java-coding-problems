package array.easy;

import java.sql.SQLOutput;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {34,45,23,11,435,565,22,112};
        int largest=Integer.MIN_VALUE;
        int sLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            }
            else if (arr[i]>sLargest && largest!=sLargest){

                sLargest=arr[i];

            }

        }
        System.out.println(sLargest);
    }
}
