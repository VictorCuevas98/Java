public class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(){
        setTitle("Unknown");
        setAuthor("Unknown");
        setPublicationYear(0);
    }
    public Book(String title, String author, int publicationYear){
        setTitle(title);
        setAuthor(author);
        setPublicationYear(publicationYear);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void displayInfo(){
        System.out.println("[Title: " + getTitle() + ", Author: " + getAuthor() + ", Publication Year: " + getPublicationYear());
    }
}
