package People;

public class Student extends Person{

    // Student class's specific members(attributes):
    private double GPA;
    private static final double scholarship = 36600.00;

    // Student(): default constructor for assigning the ID. No parameters, no return values
    // super() - method for inheritance from parent class Person
    public Student(){
        super();
    }

    // Student(String name, String surname, double GPA): parametrised constructor for the name, surname and GPA. String name, String surname, double GPA - are parameters. No return values
    public Student(String name, String surname, double GPA){
        this();
        setName(name);
        setSurname(surname);
        setGPA(GPA);
    }

    // setGPA(double GPA): setter for the GPA. double GPA - parameter. No return values
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    // getGPA(): getter for the GPA. No parameters, returns double GPA
    public double getGPA() {
        return GPA;
    }

    // getPaymentAmount(): overriding method from Payable interface. No parameters, returns double scholarship(36600.00) if student's GPA is greater than 2.67, otherwise returns 0.00
    @Override
    public double getPaymentAmount() {
        return (GPA > 2.67) ? scholarship : 0.00;
    }

    // toString(): method for printing the information about Student's instance. No parameters, returns integer ID, String name, String surname, double GPA, double scholarship
    @Override
    public String toString() {
        return "Student: " + "\"" + super.toString() + "\"" + "GPA: " + getGPA() + "\"" + "Scholarship: " + getPaymentAmount();
    }
}
