package Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] read = scanner.nextLine().split("\\s+");
            double grade = Double.parseDouble(read[2]);
            Student student = new Student(read[0], read[1], grade);
            students.add(student);
        }
        students.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
