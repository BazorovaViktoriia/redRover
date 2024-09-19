public class TaxPayment {

    double taxPayment;
    double NDS1 = 0.23;
    double NDS2 = 0.18;
    double NDS3 = 0.13;

    public double[] whiteSalary(Employee[] array) {
        double[] arrayNDS = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() > 10000 && array[i].getChildrenCNT() > 0) {
                taxPayment = (array[i].getSalary() - 1000) * NDS1;
                arrayNDS[i] = taxPayment;
            }
            if (array[i].getSalary() > 10000 && array[i].getChildrenCNT() == 0) {
                taxPayment = array[i].getSalary() * NDS1;
                arrayNDS[i] = taxPayment;
            }
            if (array[i].getSalary() >= 5000 && array[i].getSalary() <= 10000 && array[i].getChildrenCNT() > 0) {
                taxPayment = (array[i].getSalary() - 1000) * NDS2;
                arrayNDS[i] = taxPayment;
            }
            if (array[i].getSalary() >= 5000 && array[i].getSalary() <= 10000) {
                taxPayment = array[i].getSalary() * NDS2;
                arrayNDS[i] = taxPayment;
            }
            if (array[i].getSalary() < 5000 && array[i].getChildrenCNT() > 0) {
                taxPayment = (array[i].getSalary() - 1000) * NDS3;
                arrayNDS[i] = taxPayment;
            }
            if (array[i].getSalary() < 5000) {
                taxPayment = array[i].getSalary() * NDS3;
                arrayNDS[i] = taxPayment;
            }

        }
        return arrayNDS;
    }
}