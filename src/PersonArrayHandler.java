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
            if (array[i].age() > temp) {
                temp = array[i].age();
                indexTemp = i;
            }
        }
        return indexTemp;
    }

    boolean isPersonExists(Person person) {
        for (Person value : array) {
            if (value.equals(person)) {
                return true;
            }
        }
        return false;
    }

    boolean isPersonExists(Person[] person) {
        boolean isExist = false;
        for (Person value : person) {
            if (isPersonExists(value)) {
                isExist = true;
            } else {
                isExist = false;
                break;
            }
        }
        return isExist;
    }

     public List<Person> retainAll(Person[] person) {
        List<Person> list = new ArrayList<>();
         for (Person value : person) {
             if (isPersonExists(value)) {
                 list.add(value);
             }
         }
        return list;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Person person : array) {
            sb.append(person).append("\n");
        }
        return sb.toString();
    }
}