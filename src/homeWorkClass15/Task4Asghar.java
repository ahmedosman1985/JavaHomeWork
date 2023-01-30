package homeWorkClass15;

public class Task4Asghar {
    String sayHello(String countryName) {

        switch (countryName) {

            case "USA":
                return "Hello"; //in case of using return, break is not needed
            case "Kazakhstan":
                return "Salem";
            case "Italy":
                return "Ciao";
            case "China":
                return "Ni hao";
            default:
                return "Country not supported";

        }
    }
}
