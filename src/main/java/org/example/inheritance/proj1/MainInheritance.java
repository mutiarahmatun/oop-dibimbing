package org.example.inheritance.proj1;

public class MainInheritance {
    public static void main(String[] args) {

        // Constructor lengkap
        Student student1 = new Student(
                "Mutia",
                21,
                "STD001",
                "Computer Science"
        );

        // Constructor overloading
        Student student2 = new Student(
                "Budi",
                "STD002"
        );

        Teacher teacher1 = new Teacher(
                "Rafif",
                30,
                "TCH001",
                "Java"
        );

        Teacher teacher2 = new Teacher(
                "Andi",
                "TCH002"
        );

        System.out.println("=== Student 1 ===");
        student1.showStudentInfo();

        System.out.println("\n=== Student 2 ===");
        student2.showStudentInfo();

        System.out.println("\n=== Teacher 1 ===");
        teacher1.showTeacherInfo();

        System.out.println("\n=== Teacher 2 ===");
        teacher2.showTeacherInfo();
    }
}
