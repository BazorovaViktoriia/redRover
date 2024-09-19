public class Main {

    public static void main(String[] args) {
        // FirstLesson.poehali();
        //FirstLesson.butterfly();
       // FirstLesson.emodji("\uD83D\uDE0A");
        //System.out.println(SecondLesson.sum());
        //System.out.println(SecondLesson.diff());
        //System.out.println(SecondLesson.multyply());
        //System.out.println(SecondLesson.division());
        //SecondLesson.even(SecondLesson.a);
        //SecondLesson.even(SecondLesson.b);
        //SecondLesson.printHowMuchMoney();
        //System.out.println(EightLesson.numberToWords(730));
        TaxPayment taxPayment = new TaxPayment();
        Employee firstEmployee = new Employee("Иван", 2, 10500);
        Employee secondEmployee = new Employee("Vasy", 0, 9000);

        Employee[] employees = new Employee[]{firstEmployee,secondEmployee};
        for (double nds : taxPayment.whiteSalary(employees)){
            System.out.println(nds);
        }

    }
}