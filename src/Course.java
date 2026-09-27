import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private Teacher teacher;
    private List<Student> students;

    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void showInformation() {
    System.out.println("Curso: " + name);
    System.out.println("Docente: " + teacher.getName());
    System.out.println("Especialidad: " + teacher.getSpecialty());
}

    public void showStudents() {
        System.out.println("Estudiantes:");

        for (Student student : students) {
            System.out.println(
                student.getStudentId() + " - " + student.getName()
            );
        }
    }
}