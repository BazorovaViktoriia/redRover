public class Person {
    String name;
    String sex;
    int age;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public String getName(Person person) {
        if(person.getSex().equals("male")){
            return "Mr. " + person.getName();
        }

        return "Mrs. " + person.getName();
    }
}