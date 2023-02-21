package JavaProject1;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        //)Write a java program to find the second largest number in the array

        int [] numbers={18,15,49,102,47};
        Arrays.sort(numbers);
        System.out.println("Second highest number in array is "+numbers[numbers.length-2]);

        System.out.println("************");

        int largestNumber=0;
        int secondLargest=0;
        int [] arr={18,15,49,102,47};
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>largestNumber){
                secondLargest=largestNumber;
                largestNumber=arr[i];
            }else if(arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The second largest no in the above array is "+secondLargest);



    }
}
