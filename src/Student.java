public class Student extends Person {

    private String studentId;
    private String career;

    public Student(String name, int age, String studentId, String career) {
        super(name, age);
        this.studentId = studentId;
        this.career = career;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public void showInformation() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Codigo: " + studentId);
        System.out.println("Carrera: " + career);
    }

    public void study() {
        System.out.println(name + " esta estudiando.");
    }
}