public class Teacher extends Person {

    private String specialty;

    public Teacher(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public void showInformation() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Especialidad: " + specialty);
    }
}