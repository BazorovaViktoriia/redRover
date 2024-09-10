public class Options {
    public static String[] arrayEmployers;
    public static Worker[] arrayWorkers;
    public static Manager[] arrayManager;

    //первое задание - поиск по имени
    public static String findEmployeeByName(String name) {
        for (String str : arrayEmployers) {
            if (str.equals(name))
                return str;
        }
        return "имя не найдено";
    }

    //второе задание - поиск по имени, которое является частью строки
    public static String findEmployeeByNameByContains(String name) {
        for (String str : arrayEmployers) {
            if (str.contains(name))
                return str;
        }
        return "имя не найдено";
    }

    //подсчет зарплатного бюджета
    public static Double salary() {
        double salary = 0;
        for (Worker worker : arrayWorkers) {
            salary = worker.getSalary() + salary;
        }
        return salary;
    }

    //поиск наименьшей зарплаты
    public static Double minSalary() {
        double minSalary = 0;
        for (int i = 0; i < arrayWorkers.length; i++) {
            if (minSalary > arrayWorkers[i].getSalary()) {
                minSalary = arrayWorkers[i].getSalary();
            }
        }
        return minSalary;
    }

    //поиск наибольшей зарплаты
    public static Double maxSalary() {
        double maxSalary = 0;
        for (int i = 0; i < arrayWorkers.length; i++) {
            if (maxSalary < arrayWorkers[i].getSalary()) {
                maxSalary = arrayWorkers[i].getSalary();
            }
        }
        return maxSalary;
    }


    //поиск наименьшего количества подчиненных в массиве менеджеров
    public static int minManagers() {
        int minCntManegers = 0;
        for (int i = 0; i < arrayManager.length; i++) {
            if (minCntManegers > arrayManager[i].getNumberOfSubordinates()) {
                minCntManegers = arrayManager[i].getNumberOfSubordinates();
            }
        }
        return minCntManegers;
    }

    //поиск наибольшего количества подчиненных в массиве менеджеров
    public static int maxManagers() {
        int maxCntManegers = 0;
        for (int i = 0; i < arrayManager.length; i++) {
            if (maxCntManegers < arrayManager[i].getNumberOfSubordinates()) {
                maxCntManegers = arrayManager[i].getNumberOfSubordinates();
            }
        }
        return maxCntManegers;
    }

    //поиск наименьшей надбавки
    public static int minPremiaManagers() {
        int minPremiaManegers = 0;
        for (int i = 0; i < arrayManager.length; i++) {
            if (minPremiaManegers > (int) (arrayManager[i].getSalary() - new Worker().salary)) {
                minPremiaManegers = (int) (arrayManager[i].getSalary() - new Worker().salary);
            }
        }
        return minPremiaManegers;
    }

    //поиск наибольшей надбавки
    public static int maxPremiaManagers() {
        int maxPremiaManegers = 0;
        for (int i = 0; i < arrayManager.length; i++) {
            if (maxPremiaManegers < (int) (arrayManager[i].getSalary() - new Worker().salary)) {
                maxPremiaManegers = (int) (arrayManager[i].getSalary() - new Worker().salary);
            }
        }
        return maxPremiaManegers;
    }
}
