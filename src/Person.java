public class Person {

    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInformation() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
    }
}