import java.util.Comparator;
// import java.util.Collections;

class Employee{
    private String name;
    private int age;

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    int getAge(){
        return age;
    }

    String getName(){
        return name;
    }
}

class CmpAge implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2){
        return emp1.getAge() - emp2.getAge();
    }
}

class CmpName implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2){
        return emp1.getName().compareTo(emp2.getName());
    }
}


public class TF_2013_2014_5c {
    public static void main(String[] args) {
        // Collections.sort(employeeArray, new CmpAge());
        // Collections.sort(employeeArray, new CmpName());
    }
}
