public class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void showInformation() {
        System.out.println("Titulo: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Año: " + year);
    }

    public boolean isOldBook() {
        return 2026 - year > 20;
    }
}