package homeWorkClass22;

public class CreditCard {
    //Create a class CreditCard and define variable balance and interest.
    // Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.

    double balance;
    double interest;

    void calculateInterest(double balance,double interest){
        this.balance=balance;
        this.interest=interest;
        System.out.println("The interest rate on the balance of "+balance+" based on interest rate "+interest+" is"+(balance*interest)/(100));
    }
}
class Visa extends CreditCard{

}
class AX extends CreditCard{
    @Override
    void calculateInterest(double balance,double interest){
        super.balance=balance;
        super.interest=interest;

        System.out.println("Your monthly interest will be "+(balance*interest/100));
    }
}