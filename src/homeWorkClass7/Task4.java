package homeWorkClass7;

public class Task4 {
    public static void main(String[] args) {
        //Create a boolean variable workDay and assign true create int variable day and assign it to 1
        //As long as it is workDay print “I need a day off” and increase day.
        //Once day is 6 print “I do not need a day off any more”
       // for (int i = 0; i < ; i++) {
        
        boolean workDay=true;


        for (int day=1 ; day <=7 ; day++) {
            if (day<=5){
                System.out.println("I need a day off");
            }else {
                System.out.println("I do not need a day off anymore");
            }
            
        }

        }
    }

