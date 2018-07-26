import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        person1.setWeight(100);
        person1.setHeight(6);
        System.out.println(person1.bodyMassIndex());

        person2.setWeight(150);
        person2.setHeight(5);
        System.out.println(person2.bodyMassIndex());

        person3.setWeight(200);
        person3.setHeight(6);
        System.out.println(person3.bodyMassIndex());

        ArrayList<Person> groupArray = new ArrayList<Person>();
        groupArray.add(person1);
        groupArray.add(person2);
        groupArray.add(person3);

        person2.printPerson();

    }
}
