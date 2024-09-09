public class Director {
    int workers;
    Worker worker = new Worker();

    public double getNumberOfSubordinates() {
        return workers;
    }

    public double getSalary() {
        double stavka = worker.getSalary() * (Manager.getNumberOfSubordinates() / 100 * 9);
        return getNumberOfSubordinates() == 0 ? worker.getSalary() : stavka;
    }
}
