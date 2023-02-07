package homeWorkClass19;

public class Task1Electronics {
    //Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.

    String type;
    int price;
    String color;

    void item(){
        System.out.println("The item is "+type+"it's price is "+price);
    }

    }
      class bPhone extends Task1Electronics{

        String company;

        void details(){

            System.out.println("product type is "+type+" and company is "+company);
        }

        }

        class ModelC extends bPhone{
         String model;

         void product(){

             System.out.println("The product is "+model+" it's producing company is "+company+" and it's price is "+price);
         }

        }

