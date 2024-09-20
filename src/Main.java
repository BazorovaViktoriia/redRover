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
        //TaxPayment taxPayment = new TaxPayment();
        //Employee firstEmployee = new Employee("Иван", 2, 10500);
        //Employee secondEmployee = new Employee("Vasy", 0, 9000);

        //Employee[] employees = new Employee[]{firstEmployee,secondEmployee};
        //for (double nds : taxPayment.whiteSalary(employees)){
        //    System.out.println(nds);
        //}
        Journal firstLine = new Journal("Ivanov", new int[10]);
        Journal secondLine = new Journal("Petrov", new int[]{3,4,4,4,4,5,4,2,5,5});
        Journal thirdLine = new Journal("Petrov", new int[]{5,1,5,5,3,5,3,1,2,4});
        Journal forthLine = new Journal("Pachenko", new int[]{5,5,5,5,5,5,5,5,5,5});
        Journal[] journal = new Journal[]{firstLine, secondLine, thirdLine, forthLine};
        ClassLessons firstClass = new ClassLessons();
        firstClass.setMark(journal,"Ivanov",1,5);
        //firstClass.printAllmarksByLesson(journal, 1);
        firstClass.printAll(journal);
        System.out.println(firstClass.getMeridianMark(journal, "Pachenko"));

    }
}