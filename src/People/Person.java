package People;

public class Person implements Payable, Comparable<Person>{

    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;
    public Person() {
        id = id_gen++;
    }
    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }
    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurame(){
        return surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' ;
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
}
