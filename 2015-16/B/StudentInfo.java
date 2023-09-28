import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student>, Serializable{
    String Name;
    Integer Age;
    Double CGPA;

    Student(String name, Integer age, Double cgpa){
        Name = name;
        Age = age;
        CGPA = cgpa;
    }
    //a
    @Override
    public int compareTo(Student s){
        if (Age == s.Age && CGPA.equals(s.CGPA))
        return Name.compareTo(s.Name);
        else if (CGPA.equals(s.CGPA))
        return Age.compareTo(s.Age);
        return s.CGPA.compareTo(CGPA);
    }

    @Override
    public String toString(){
        return Name + "," + Age + "," + CGPA;
    }
}

public class StudentInfo {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Student>students = new ArrayList<>();
            ArrayList<Student>students2 = new ArrayList<>();
            Double cgpa;
            String name;
            Integer age;

            //b
            for (int i =0; i<120; i++){
                System.out.print("Enter the name of the student: ");
                name = scanner.nextLine();
                System.out.print("Enter the age of the student: ");
                age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter the CGPA of the student: ");
                cgpa = scanner.nextDouble();
                scanner.nextLine();
                students.add(new Student(name, age, cgpa));
            }
            Collections.sort(students);
            System.out.println(students);
            try(
                OutputStream os = new FileOutputStream("Students.info");
                ObjectOutputStream oos = new ObjectOutputStream(os)){;
                for (Student temp: students){
                    oos.writeObject(temp);
                }
            }catch(Exception e){
                System.out.println(e);
            }
            //for verifying
            try(
                InputStream is = new FileInputStream("Students.info");
                ObjectInputStream ois = new ObjectInputStream(is)){
                for (int i= 0; i<120; i++){
                    students2.add((Student)ois.readObject());   
                }
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println(students2);
            scanner.close();
    }
}
