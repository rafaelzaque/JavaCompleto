package aula69.exercicio3.application;

import aula69.exercicio3.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter student name: ");
        student.name = sc.nextLine();
        System.out.print(("Enter grade1 (30% final grade): "));
        student.grade1 = sc.nextDouble();
        System.out.print(("Enter grade2 (35% final grade): "));
        student.grade2 = sc.nextDouble();
        System.out.print(("Enter grade3 (35% final grade): "));
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

        System.out.println(student.passNoPass());
        System.out.println(student.missingPoint());

        sc.close();
    }
}
