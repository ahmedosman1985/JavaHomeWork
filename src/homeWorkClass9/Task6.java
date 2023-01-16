package homeWorkClass9;

public class Task6 {
    public static void main(String[] args) {

        //Create an array of countries. While retrieving all values from an array print capital for each country choose
        // any five countries.

        String [] country={"Egypt","USA","France","Turkey","Thailand"};

        for (int i = 0; i < country.length ; i++) {

            System.out.println(country[i]);

            switch (country[i]){
                case "Egypt":
                    System.out.println("The capital of "+country[0]+ " is "+"Cairo");
                    break;

                        case "USA":
                            System.out.println("The capital of "+country[1]+ " is "+"Washington DC");
                            break;

                            case "France":
                                System.out.println("The capital of "+country[2]+ " is "+"Cairo");
                                break;

                                case "Turkey":
                                    System.out.println("The capital of "+country[3]+ " is "+"Istanbul");
                                    break;

                                    case "Thailand":
                                        System.out.println("The capital of "+country[4]+ " is "+"Bangkok");
                                        break;

                                    default:
                                        System.out.println("End of Countries");

                                }

    }
}}
