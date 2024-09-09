public class Options {
    public static String[] arrayEmployers;
    public static Worker[] arrayWorkers;

    public static String findEmployeeByName(String name) {
        for (String str : arrayEmployers) {
            if (str.equals(name))
                return str;
        }
        return "имя не найдено";
    }

    public static String findEmployeeByNameByContains(String name) {
        for (String str : arrayEmployers) {
            if (str.contains(name))
                return str;
        }
        return "имя не найдено";
    }

    public static Double salary() {
        double salary = 0;
        for (Worker worker : arrayWorkers) {
            salary = worker.getSalary() + salary;
        }
        return salary;
    }

    public static Double minSalary() {
        double minSalary = 0;
        for (int i = 0; i < arrayWorkers.length; i++) {
            if (minSalary > arrayWorkers[i].getSalary()) {
                minSalary = arrayWorkers[i].getSalary();
            }
        }
        return minSalary;
    }


}
