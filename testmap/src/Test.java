import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);


        System.out.println(peopleList);
        System.out.println(peopleSet);
     }

     private static void addElements(Collection collection){
         collection.add(new Person(1, "Boo"));
         collection.add(new Person(3, "Jon"));
         collection.add(new Person(2, "Sofa"));
         collection.add(new Person(4, "George"));


     }
}

class Person implements Comparable<Person>{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


    @Override
    public int compareTo(Person o) {
        if (this.name.length() > o.name.length()) return 1;
        else if (o.name.length() > this.name.length()) return -1;
        else return 0;
    }
}



