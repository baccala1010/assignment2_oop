package People;

public class Employee extends Person{

    // Person class's specific members(attributes):
    private String position;
    private double salary;

    // Employee(): default constructor for assigning the ID. No parameters, no return values
    // super() - method for inheritance from parent class Person
    public Employee(){
        super();
    }

    // Employee(String name, String surname, String position, double salary): parametrised constructor for the name, surname, position and salary. String name, String surname, String position, double salary - are parameters. No return values
    public Employee(String name, String surname, String position, double salary){
        this();
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }

    // setPosition(String position): setter for the position. String position - parameter. No return values
    public void setPosition(String position) {
        this.position = position;
    }

    // setSalary(double salary): setter for the salary. double salary - parameter. No return values
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // getPosition(): getter for the position. No parameters, returns String position
    public String getPosition() {
        return position;
    }

    // getSalary(): getter for the salary. No parameters, returns double salary
    public double getSalary() {
        return salary;
    }

    // getPaymentAmount(): overriding method from Payable interface. No parameters, returns double salary
    @Override
    public double getPaymentAmount() {
        return salary;
    }

    // toString(): method for printing the information about Student's instance. No parameters, returns integer ID, String name, String surname, String position, double salary
    @Override
    public String toString() {
        return "Employee: " + "\"" + super.toString() + "position: " + getPosition() + " " + "salary: "+ getPaymentAmount();
    }
}
