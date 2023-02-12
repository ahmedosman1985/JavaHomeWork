package homeWorkClass23;

public class ComputerTester {
    public static void main(String[] args) {

        Computer [] phones={new Apple(),new Dell(),new HP(),new Lenovo()};

        for (Computer phone:phones) {
            phone.latestModel();
            phone.assistant();
            phone.operatingSystem();
        }



    }


    }

