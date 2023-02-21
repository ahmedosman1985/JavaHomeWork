package JavaProject1;

public class Task11 {
    public static void main(String[] args) {
        //Write a program to print out duplicate elements from an Array of Strings?

        int[] arr={10,15,10,6,8,12};

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j]){
                    System.out.println("The duplicate number is "+arr[j]);
                }
            }
        }
    }
}
