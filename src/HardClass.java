import java.util.Map;

public class HardClass {
    String surname1 = "Иванов";
    String surname2 = "Петров";
    String surname3 = "Сидоров";
    String surname4 = "Кузнецов";
    String surname5 = "Дуров";
    String surname6 = "Кротов";
    String surname7 = "Самокатов";
    String surname8 = "Кабелей";
    String surname9 = "Зайцев";
    String surname10 = "Облаков";
    //Map<String, Integer[]> journal = new HashMap<>();

    public void putValues(Map<String, Integer[]> journal) {
        journal.put(surname1, new Integer[]{4,5,3,4,4,4,4,5,4,5});
        journal.put(surname2, new Integer[]{2,5,3,2,5,4,2,5,2,3});
        journal.put(surname3, new Integer[]{2,5,2,2,5,2,2,5,2,1});
        journal.put(surname4, new Integer[]{2,5,3,2,1,4,2,4,2,5});
        journal.put(surname5, new Integer[]{2,5,3,2,4,4,2,3,2,4});
        journal.put(surname6, new Integer[]{1,5,3,2,1,5,2,5,2,4});
        journal.put(surname7, new Integer[]{5,5,3,2,3,4,2,5,2,5});
        journal.put(surname8, new Integer[]{5,5,3,2,3,4,2,5,2,5});
        journal.put(surname9, new Integer[]{2,5,3,2,5,4,2,5,2,3});
        journal.put(surname10, new Integer[]{5,5,5,5,5,4,5,5,5,5});
    }

    public void giveGrade(int lesson, int mark) {

    }

    public String giveAllMarksByLesson(int lesson) {

    }

    public void giveAllMarks(Map<String, Integer[]> journal) {

        for (Map.Entry<String, Integer[]> item : journal.entrySet()) {
            System.out.printf("Фамилия: %s  Value: %s \n", item.getKey(), item.getValue());
        }
    }

    public double meridian(String surname, Map<String, Integer[]> journal) {
        double mark=0;
        Integer[] grades;
        for(Map.Entry<String, Integer[]> item : journal.entrySet()){
            if(item.getKey().equals(surname)){
                grades = item.getValue();
                for(int i: grades){
                    mark+=i;
                }
                mark=mark/(grades.length);
            }
        }
        return mark;
    }
}
