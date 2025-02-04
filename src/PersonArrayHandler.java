import java.util.ArrayList;
import java.util.List;

public class PersonArrayHandler {
    Person[] array;

    public PersonArrayHandler(Person[] array) {
        this.array = array;
    }

    int indexOfMaxAgePerson() {
        return indexOfMaxAgePerson(0);
    }

    int indexOfMaxAgePerson(int index) {
        int temp = 0;
        int indexTemp = 0;
        for (int i = index; i < array.length; i++) {
            if (array[i].getAge() > temp) {
                temp = array[i].getAge();
                indexTemp = i;
            }
        }
        return indexTemp;
    }

    boolean isPersonExists(Person person) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(person)) {
                return true;
            }
        }
        return false;
    }

    boolean isPersonExists(Person[] person) {
        boolean isExist = false;
        for (int i = 0; i < person.length; i++) {
            if (isPersonExists(person[i])) {
                isExist = true;
            } else {
                isExist = false;
                break;
            }
        }
        return isExist;
    }

    List retainAll(Person[] person) {
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < person.length; i++) {
            if (isPersonExists(person[i])) {
                list.add(person[i]);
            }
        }
        return list;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i] + "\n");
        }
        return sb.toString();
    }
}