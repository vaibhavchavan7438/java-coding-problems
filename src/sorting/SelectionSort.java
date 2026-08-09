package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {34,45,23,11,435,565,22,112};

        for(int i=0;i<arr.length;i++){
            int mini=i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[mini];
            arr[mini]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
