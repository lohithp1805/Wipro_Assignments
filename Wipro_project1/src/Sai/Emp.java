package Sai;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

class Developer extends Employee {
    public Developer(int id, String name, double salary) {
        super(id, name, salary);
    }

    void display() {
        super.display();
        System.out.println("I'm a Developer");
    }
}

class Manager extends Employee {
    public Manager(int id, String name, double salary) {
        super(id, name, salary);
    }

    void display() {
        super.display();
        System.out.println("I'm a Manager");
    }
}

public class Emp {
    public static void main(String[] args) {
        Employee e1 = new Developer(100, "Teja", 25000);
        Employee e2 = new Manager(103, "Poorna", 50000);
        e1.display();
        e2.display();
    }
}
