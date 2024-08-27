public class SecondLesson {
   public static int a = 3;
    public static int b = 6;
    public static int piastr = 1345;
    public static int cntTeam = 8;
    public static int capitan;
    public static int master;
    public static int worker;

    public static int sum() {
        return a+b;
    }

    public static int diff() {
        return a-b;
    }

    public static int multyply() {
        return a*b;
    }

    public static int division() {
        return a/b;
    }

    public static void even(int number) {
       System.out.println(number%2==0 ? "Число четное":"Число нечетное");
    }

    public static void printHowMuchMoney() {
        master = piastr-piastr/2;
        capitan = (piastr-master)/2;
        worker = (piastr-master-capitan)/cntTeam;

        System.out.println("Владелец корабля получает "+master+" пиастр. " +"Капитан корабля получает " +
                (capitan+worker)+" пиастр. " + "Каждый член команды получает "+ worker + " пиастр. ");


    }

}
