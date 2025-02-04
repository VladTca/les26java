import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person0 = new Person("John", 20);
        Person person1 = new Person("Jane", 25);
        Person person2 = new Person("Jin", 30);
        Person person3 = new Person("Alice", 22);
        Person person4 = new Person("Bob", 28);
        Person person5 = new Person("Charlie", 35);
        Person person6 = new Person("Diana", 27);
        Person person7 = new Person("Eve", 24);
        Person person8 = new Person("Frank", 32);
        Person person9 = new Person("Grace", 29);
        Person[] persons = {person0, person1, person2, person3, person4, person5, person6, person7, person8, person9};

        PersonArrayHandler personArrayHandler = new PersonArrayHandler(persons);
        System.out.println(personArrayHandler);
        System.out.println();
        System.out.println(personArrayHandler.indexOfMaxAgePerson());
        System.out.println(personArrayHandler.indexOfMaxAgePerson(6));
        System.out.println(personArrayHandler.isPersonExists(new Person("Alice", 22)));

        Person newPerson0 = new Person("Alice", 22);
        Person newPerson1 = new Person("Bob", 28);
        Person newPerson2 = new Person("Charlie", 35);
        Person newPerson3 = new Person("Diana", 27);
        Person[] newPersons1 = {newPerson0, newPerson1, newPerson2, newPerson3};
        Person[] newPersons2 = {newPerson0, newPerson1, newPerson2, newPerson3, new Person("Olaf", 59)};
        System.out.println();
        System.out.println(personArrayHandler.isPersonExists(newPersons1));
        System.out.println(personArrayHandler.isPersonExists(newPersons2));
        System.out.println();
        List<Person> list = personArrayHandler.retainAll(newPersons2);
        for (Person person : list) {
            System.out.println(person.getName() + " " + person.getAge());
        }

    }
}