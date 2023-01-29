package homeWorkClass15;

public class Task4 {
    //Create a method that will say Hello in different language based on the country
    // that will passed when method is executed

    String hello(String str){
        String usa="Hello";
        String france="Salut";
        String spain="Hola";
        if (str.equalsIgnoreCase("USA")){
            return usa;
        } else if (str.equalsIgnoreCase("france")) {
            return france;
        } else{
        }return spain;

    }}
