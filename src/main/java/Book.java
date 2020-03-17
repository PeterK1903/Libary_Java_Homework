public class Book {
    private String title;
    private String author;
    private String genre;
    private Integer yearOfPublish;

    public Book(String title, String author,String genre, Integer yearOfPublish){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearOfPublish = yearOfPublish;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getGenre(){
        return this.genre;
    }

    public Integer getDate(){
        return this.yearOfPublish;
    }

}