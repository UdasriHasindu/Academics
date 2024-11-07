package Question02.library.books;

public class FictionBooks {

    private String title;
    private String author;
    private String genre;

    public FictionBooks(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    public void displaInfo(){
        System.out.println("Title of Book: "+ this.title);
        System.out.println("Author of Book: "+ this.author);
        System.out.println("Genre of Book: "+ this.genre);
    }

}
