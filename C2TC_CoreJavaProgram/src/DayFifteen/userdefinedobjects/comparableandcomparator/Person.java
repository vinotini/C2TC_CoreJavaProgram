package DayFifteen.userdefinedobjects.comparableandcomparator;

import java.util.Comparator;

public class Person {
    private String name;
    private String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Person() {
        // default constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", city=" + city + "]";
    }
}

// Comparator to sort by name
class SortByName implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

// Comparator to sort by city
class SortByCity implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getCity().compareTo(p2.getCity());
    }
}
