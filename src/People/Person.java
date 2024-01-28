package People;

public class Person implements Payable, Comparable<Person>{

    // Person class's members(attributes):
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;

    // Person(): default constructor for assigning the ID. No parameters, no return values
    public Person() {
        id = id_gen++;
    }

    // Person(String name, String surname): parametrised constructor for the name, surname. String name, String surname - are parameters. No return values
    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    // getId(): getter for ID. No parameters, returns integer ID
    public int getId() {
        return id;
    }

    // getName(): getter for the name. No parameters, returns String name
    public String getName(){
        return name;
    }

    // getSurname(): getter for the surname. No parameters, returns String surname
    public String getSurame(){
        return surname;
    }

    // setName(String name): setter for the name. String name - parameter. No return values
    public void setName(String name) {
        this.name = name;
    }

    // setSurname(String surname): setter for the surname. String surname - parameter. No return values
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    // toString(): method for printing the information about Person's instance. No parameters, returns integer ID, String name, String surname
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' ;
    }

    // getPaymentAmount(): overriding the method from Payable interface. No parameters, returns 0
    @Override
    public double getPaymentAmount() {
        return 0;
    }

    // compareTo(Person person): comparing the current and selected persons. Person person(instance) is a parameter, returns 1 or 0, logic values
    @Override
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
}
