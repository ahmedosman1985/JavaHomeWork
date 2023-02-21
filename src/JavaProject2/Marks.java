package JavaProject2;

public abstract class Marks {
    double subject1;
    double subject2;
    double subject3;

    public Marks(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    abstract void getPercentage();
}
    class A extends Marks{

        public A(double subject1, double subject2, double subject3) {
            super(subject1, subject2, subject3);
        }
        //assuming that each subject score is out of 100
        @Override
        void getPercentage() {
            System.out.println("The score of student A is "+((subject1+subject2+subject3)/300*100)+"%");
        }
    }


    class B extends Marks{
        double subject4;

        public B(double subject1, double subject2, double subject3, double subject4) {
            super(subject1, subject2, subject3);
            this.subject4 = subject4;
        }
        //assuming that each subject score is out of 100
        @Override
        void getPercentage() {
            System.out.println("The score of student B is "+(((subject1+subject2+subject3+subject4)/400)*100)+"%");
        }
    }
