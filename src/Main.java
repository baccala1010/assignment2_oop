//Import needed packages and Java functions
import java.util.ArrayList;
import java.util.Collections;
import People.Person;
import People.Student;
import People.Employee;
import People.Payable;

public class Main {
    public static void main(String[] args){
        //creating an Arraylist that will contain Employee's and Student's instances
        ArrayList<Person> inhabitans = new ArrayList<>();

        // creating Employee's and Student's instances
        Employee emp1 = new Employee("John", "Lennon", "Rhythm guitarist", 170000.00);
        Employee emp2 = new Employee("Richie", "Blackmore", "Lead guitarist", 148870.00);
        Employee emp3 = new Employee("Nick", "Mason", "Drummer", 139430.00);
        Student stud1 = new Student("Kurt", "Cobain", 2.91);
        Student stud2 = new Student("Ozzy", "Osbourne", 2.34);
        Student stud3 = new Student("Victor", "Tsoi", 2.67);

        // addition these instances into created Arraylist inhabitans
        inhabitans.add(emp1);
        inhabitans.add(emp2);
        inhabitans.add(emp3);
        inhabitans.add(stud1);
        inhabitans.add(stud3);
        inhabitans.add(stud2);


        // sorting these instances by an ID
        Collections.sort(inhabitans);

        // printing in data about instances and how much do they gain
        printData(inhabitans);
        // printing the result of comparing 2 instances
        System.out.println(emp1.compareTo(emp2));
    }

    // printData(Iterable<Person> people): printing data about several person'n(instance's) income
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + " gains " + person.getPaymentAmount() + " tenge");
        }
    }

}