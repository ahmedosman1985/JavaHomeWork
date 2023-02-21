package JavaProject1;

public class Task7 {
    public static void main(String[] args) {
        //Write a java program to check whether a given number is prime or not

        int given=59;
        boolean isPrime=true;

        if(given>1) {
            for(int i=2; i<given; i++){

                if(given%i==0){
                    isPrime=false;
                    break;
                }
            }
        } else {
            isPrime=false;
        }

        System.out.println("Given number "+given+" is Prime? "+isPrime);

    }
}