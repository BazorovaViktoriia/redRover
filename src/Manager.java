public class Manager {
    int workers;
    Worker worker;

    public double getNumberOfSubordinates() {
        return workers;
    }

    public void setNumberOfSubordinates(int workers) {
        this.workers = workers;
    }

    public double getSalary() {
        double stavka = worker.getSalary() * (getNumberOfSubordinates() / 100 * 3);
        return workers == 0 ? worker.getSalary() : stavka;
    }
}
