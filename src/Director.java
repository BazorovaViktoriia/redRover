public class Director {
    int workers;
    Worker worker = new Worker();

    public int getNumberOfSubordinates() {
        return workers;
    }

    public double getSalary() {
        double stavka = worker.getSalary() * ((double) getNumberOfSubordinates() / 100 * 9);
        return getNumberOfSubordinates() == 0 ? worker.getSalary() : stavka;
    }
}
