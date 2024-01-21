package People;

public class Student extends Person{

    private double GPA;
    private static final double scholarship = 36600.00;
    public Student(){
        super();
    }
    public Student(String name, String surname, double GPA){
        this();
        setName(name);
        setSurname(surname);
        setGPA(GPA);
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public double getPaymentAmount() {
        return (GPA > 2.67) ? scholarship : 0.00;
    }

    @Override
    public String toString() {
        return "Student: " + "\"" + super.toString() + "\"" + "GPA: " + getGPA();
    }
}
