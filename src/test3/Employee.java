package test3;

class Employee {
    int id;
    String name;
    String dept;
    double salary;

    // Constructor
    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    // Getters (Very useful if you plan to use Streams on this list later)
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDept() { return dept; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', dept='" + dept + "', salary=" + salary + "}";
    }
}