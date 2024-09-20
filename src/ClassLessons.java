public class ClassLessons {

    public void setMark(Journal[] journal, String surname, int lesson, int mark) {
        for (Journal jrnl : journal) {
            if (jrnl.getSurname().equals(surname)) {
                jrnl.lessons[lesson] = mark;
            }
        }
    }

    public void printAllmarksByLesson(Journal[] journal, int lesson) {
        for (Journal jrnl : journal) {
            System.out.println(jrnl.lessons[lesson]);
        }
    }

    public void printAll(Journal[] journal) {
        for (Journal line : journal) {
            for (int i = 0; i < line.lessons.length; i++) {
                System.out.print(line.lessons[i]);
            }
            System.out.println();
        }
    }

    public double getMeridianMark(Journal[] journal, String surname) {
        double someMark = 0;
        int cntLesson=1;
        for (Journal line : journal) {
            if (line.getSurname().equals(surname)) {

                for (int i = 0; i < line.lessons.length; i++) {
                    someMark += line.lessons[i];
                    cntLesson++;
                }
            }
        }
        return someMark/(cntLesson-1);
    }
}