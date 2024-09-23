public class Employee {
    String name;
    String sex;
    int age;
    double salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isSameName(Employee employee){
        if(this.getName().equals(employee.getName())){
            return true;
        }
        return false;
    }
}
