import java.util.*;

class Student {
    String name;
    double grade;

    Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students? ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // consume newline

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student #" + (i + 1));

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Grade: ");
            double grade = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            students.add(new Student(name, grade));
        }

        // Sort students by grade
        students.sort(Comparator.comparingDouble(s -> s.grade));

        System.out.println("\nSorted Students by Grade (Ascending):");
        for (Student s : students) {
            System.out.println(s.name + "-" + s.grade);
        }

        scanner.close();
    }
}