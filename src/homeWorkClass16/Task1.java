package homeWorkClass16;

public class Task1 {
    /*Create a method that will accept an array as parameters and will return a sum of all elements from that array.
     Method should be visibly only within same package and accessible by the creating an instance of the class.

    return type--> int
    name-->sumArrayElements
    parameters --> int [] arr

    */

    int summArrayElements(int[]arr){
        int sum=0;
        for(int num:arr){
            sum=sum+num;
        }return sum;
    }

    public static void main(String[] args) {

        int [] arr={10,20,30,40};
        Task1 task=new Task1();
        System.out.println(task.summArrayElements(arr));
    }
}

