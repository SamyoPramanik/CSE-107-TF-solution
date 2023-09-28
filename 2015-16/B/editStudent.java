import java.util.Scanner;

public class editStudent {
    static void editStudentDetails(StringBuilder name, int[] ageArray, double[] cgpaArray) {
        name.delete(0, name.length());
        name.append("Hello");
        ageArray[0] = 1;
        cgpaArray[0] = 2.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        StringBuilder nameBuilder = new StringBuilder(name);

        int[] ageArray = { 0 };
        double[] cgpaArray = { 0.0 };

        System.out.print("Enter age: ");
        ageArray[0] = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter CGPA: ");
        cgpaArray[0] = scanner.nextDouble();
        scanner.nextLine(); 

        editStudentDetails(nameBuilder, ageArray, cgpaArray);

        System.out.println("Updated Name: " + nameBuilder);
        System.out.println("Updated Age: " + ageArray[0]);
        System.out.println("Updated CGPA: " + cgpaArray[0]);

        scanner.close();
    }
}
