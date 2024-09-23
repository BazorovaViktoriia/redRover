public class Salary {
    public double getSum(Employee[] employeeArray){
        double salary=0;
        for(int i=0; i< employeeArray.length; i++){
            salary+=employeeArray[i].getSalary();
        }
        return salary;
    }
}
