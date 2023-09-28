import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Person {
    private int id;
    private String name;
    private int age;

    Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Ques2B {
    public static void main(String[] args) {
        // Answer (i)
        List<Person> list = new ArrayList<>();

        list.add(new Person(1, "Rodgers", 10));
        list.add(new Person(2, "Bradley", 25));
        list.add(new Person(3, "Chambers", 15));
        list.add(new Person(4, "Calvin", 10));
        list.add(new Person(5, "Quinn", 30));
        list.add(new Person(6, "Mccoy", 15));

        // Answer (ii)

        // List<String> names = new ArrayList<>();
        // for (int i = 0; i < list.size(); i++) {
        //     Person mc = list.get(i);
        //     names.add(mc.getName());
        // }
        List<String> names = list.stream().map(Person::getName).collect(Collectors.toList());
        for(var x : names)
        {
            System.out.println(x);
        }
        System.out.println();

        // List<Person> persons = new ArrayList<>();
        // for (int i = 0; i < list.size(); i++) {
        //     Person mc = list.get(i);
        //     if (mc.getAge() <= 20) {
        //         persons.add(mc);
        //     }
        // }
        List<Person> persons = list.stream().filter(e -> (e.getAge() <= 20)).collect(Collectors.toList());
        for(var x : persons)
        {
            System.out.println(x.getId() + " " + x.getName() + " " + x.getAge());
        }
        System.out.println();
    }
}
