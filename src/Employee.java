public class Employee {

    public Employee(String name, int childrenCNT, double salary) {
        this.name = name;
        this.childrenCNT = childrenCNT;
        this.salary = salary;
    }

    String name;
    int childrenCNT;
    double salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getChildrenCNT() {
        return childrenCNT;
    }
}
