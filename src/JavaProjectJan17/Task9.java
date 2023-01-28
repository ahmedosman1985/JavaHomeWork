package JavaProjectJan17;

public class Task9 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array?

        int numbers[]={12,28,35,46,99,75,15,56};
        int max=numbers[0];
        for (int i = 1; i <numbers.length ; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            }

        }
        System.out.println("Maximum : "+ max);
        // minimum
        int min=numbers[0];
        for (int i = 1; i <numbers.length ; i++) {
            if(numbers[i]<min){
                min=numbers[i];
    }
}
        System.out.println("Minimum : "+min);


    }}
