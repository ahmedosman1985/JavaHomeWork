package homeWorkClass19;

public class TeacherTester {
    public static void main(String[] args) {

        Teacher teacher1=new Teacher();
        teacher1.name="Ahmed";
        teacher1.id=1234;
        teacher1.salary=5000;
        teacher1.subject="Arabic";

        teacher1.printTeacherInfo();

        System.out.println("**************");

        MathTeacher teacher2=new MathTeacher();
        teacher2.name="Diana";
        teacher2.salary=2000;
        teacher2.printName();
        teacher2.attendance();

        System.out.println("**********");

        ChemistryTeacher teacher3=new ChemistryTeacher();
        teacher3.name="Peter";
        teacher3.subject="Chemistry";

        teacher3.printName();
        teacher3.printSubject();

        teacher3.attitude();

        System.out.println("****************");

        PianoTeacher teacher4=new PianoTeacher();
        teacher4.name="Rania";
        teacher4.id=5854;

        teacher4.printName();
        teacher4.printID();
        teacher4.activity();



    }




}
