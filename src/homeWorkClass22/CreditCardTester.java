package homeWorkClass22;

public class CreditCardTester {

    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        creditCard.calculateInterest(10000,3.14);

        Visa visa=new Visa();
        visa.calculateInterest(12000,1.8);

        AX ax=new AX();
        ax.calculateInterest(5000,2.8);


    }
}
