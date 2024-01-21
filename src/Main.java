import java.util.ArrayList;
import java.util.Collections;
import People.Person;
import People.Student;
import People.Employee;
import People.Payable;

public class Main {
    public static void main(String[] args){
        ArrayList<Person> inhabitans = new ArrayList<>();
        Employee emp1 = new Employee("John", "Lennon", "Rhythm guitarist", 170000.00);
        Employee emp2 = new Employee("Richie", "Blackmore", "Lead guitarist", 148870.00);
        Employee emp3 = new Employee("Nick", "Mason", "Drummer", 139430.00);
        Student stud1 = new Student("Kurt", "Cobain", 2.91);
        Student stud2 = new Student("Ozzy", "Osbourne", 2.34);
        Student stud3 = new Student("Victor", "Tsoi", 2.67);

        inhabitans.add(emp1);
        inhabitans.add(emp2);
        inhabitans.add(emp3);
        inhabitans.add(stud1);
        inhabitans.add(stud3);
        inhabitans.add(stud2);


        Collections.sort(inhabitans);

        printData(inhabitans);
        System.out.println(emp1.compareTo(emp2));
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + " gains " + person.getPaymentAmount() + " tenge");
        }
    }

}