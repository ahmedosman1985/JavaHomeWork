package homeWorkClass9;

public class Task5 {
    public static void main(String[] args) {
        //Create an array of size 5 on integers and calculate the sum of all elements in an array.

        int [] numbers=new int[5];
        numbers[0]=20;
        numbers[1]=30;
        numbers[2]=40;
        numbers[3]=50;
        numbers[4]=60;

        int sum=0;

        for (int i = 0; i < numbers.length ; i++) {
            sum=sum+numbers[i];

        }
        System.out.println(sum);
            }
}
