package Daytwelve.userdefinedexp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Executor {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Accept student details
            Student student = new Student();

            System.out.println("Enter the roll no: ");
            int rollNo = sc.nextInt();
            student.setRollNo(rollNo);

            // Fix: consume the leftover newline after nextInt()
            sc.nextLine();

            System.out.println("Enter your name: ");
            String name = sc.nextLine(); // now this works properly
            student.setName(name);

            System.out.println("Enter the number of subjects: ");
            int sub = sc.nextInt();

            if (sub > 0) {
                student.setNoOfSubjects(sub);
                System.out.println("Enter the marks for " + sub + " subjects:");

                int[] marks = new int[sub];
                for (int i = 0; i < sub; i++) {
                    marks[i] = sc.nextInt();
                }

                StudentService studentService = new StudentService();
                studentService.setMarks(student, marks);

                System.out.println("\nStudent Details:");
                System.out.println(student);
            } else {
                System.out.println("Enter a valid number of subjects.");
            }

        } catch (InvalidMarksException e) {
            System.err.println("Invalid Marks: " + e.getMessage());

        } catch (InputMismatchException e) {
            System.err.println("Enter Valid Input (numeric values expected).");

        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }
}
