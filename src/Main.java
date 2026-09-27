import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== EJERCICIO 1 Y 2: BOOK =====");

        Book book1 = new Book(
                "Clean Code",
                "Robert C. Martin",
                2008
        );

        Book book2 = new Book(
                "Design Patterns",
                "Erich Gamma",
                1994
        );

        Book book3 = new Book(
                "Effective Java",
                "Joshua Bloch",
                2018
        );

        book1.showInformation();
        System.out.println();

        book2.showInformation();
        System.out.println();

        book3.showInformation();
        System.out.println();

        System.out.println("¿Book 1 es antiguo? " + book1.isOldBook());
        System.out.println("¿Book 2 es antiguo? " + book2.isOldBook());
        System.out.println("¿Book 3 es antiguo? " + book3.isOldBook());


        System.out.println("\n===== EJERCICIO 3: AGREGACION =====");

        Teacher teacher = new Teacher(
                "Ana Torres",
                35,
                "Programacion"
        );

        Course course = new Course(
                "Programacion Orientada a Objetos",
                teacher
        );

        course.showInformation();


        System.out.println("\n===== EJERCICIO 4: COMPOSICION =====");

        Car car = new Car(
                "Toyota",
                "2.0 Turbo",
                200
        );

        car.showInformation();


        System.out.println("\n===== EJERCICIO 5: ENCAPSULAMIENTO =====");

        Student student1 = new Student(
                "Carlos",
                20,
                "SIS001",
                "Ingenieria de Sistemas"
        );

        student1.showInformation();

        student1.setName("Pedro");

        System.out.println("\nDespues de cambiar el nombre:");

        student1.showInformation();


        System.out.println("\n===== EJERCICIO 6: LISTA DE ESTUDIANTES =====");

        List<Student> students = new ArrayList<>();

        students.add(new Student(
                "Carlos",
                20,
                "SIS001",
                "Ingenieria de Sistemas"
        ));

        students.add(new Student(
                "Ana",
                21,
                "SIS002",
                "Informatica"
        ));

        students.add(new Student(
                "Luis",
                19,
                "SIS003",
                "Ingenieria de Sistemas"
        ));

        students.add(new Student(
                "Maria",
                22,
                "SIS004",
                "Ingenieria de Software"
        ));

        students.add(new Student(
                "Juan",
                20,
                "SIS005",
                "Informatica"
        ));

        for (Student student : students) {
            System.out.println(
                student.getStudentId() + " - " + student.getName()
            );
        }

        System.out.println(
            "Cantidad de estudiantes: " + students.size()
        );


        System.out.println("\n===== EJERCICIO 7: CURSO =====");

        Teacher teacher2 = new Teacher(
                "Juan Perez",
                40,
                "Programacion"
        );

        Course course2 = new Course(
                "Java",
                teacher2
        );

        course2.addStudent(students.get(0));
        course2.addStudent(students.get(1));
        course2.addStudent(students.get(2));

        course2.showInformation();
        course2.showStudents();


        System.out.println("\n===== EJERCICIO 8: HERENCIA =====");

        Student student2 = new Student(
                "Carlos",
                20,
                "SIS001",
                "Ingenieria de Sistemas"
        );

        student2.showInformation();
        student2.study();


        System.out.println("\n===== MODELO ACADEMICO =====");

        Teacher teacher3 = new Teacher(
                "Ana Torres",
                35,
                "Programacion"
        );

        Course academicCourse = new Course(
                "Programacion Orientada a Objetos",
                teacher3
        );

        Student s1 = new Student(
                "Carlos",
                20,
                "SIS001",
                "Ingenieria de Sistemas"
        );

        Student s2 = new Student(
                "Ana",
                21,
                "SIS002",
                "Informatica"
        );

        Student s3 = new Student(
                "Luis",
                19,
                "SIS003",
                "Ingenieria de Software"
        );

        academicCourse.addStudent(s1);
        academicCourse.addStudent(s2);
        academicCourse.addStudent(s3);

        academicCourse.showInformation();
        academicCourse.showStudents();
    }
}