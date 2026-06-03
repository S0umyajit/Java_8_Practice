package test3;

class Employee {
    int id;
    String name;
    int age;
    String dept;
    double salary;

    // Constructor
    public Employee(int id, String name, int age, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDept() { return dept; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', age=" + age + ", dept='" + dept + "', salary=" + salary + "}";
    }
}