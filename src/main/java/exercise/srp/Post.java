package exercise.srp;

public class Post {

    private final String author ;
    private final String title;
    private final String body;

    public Post(){

        author = null;
        title =null;
        body = null;
    }
    public Post(String author, String title, String body) {
        this.author = author;
        this.title = title;
        this.body = body;
    }

    public String getBody() {
        return this.body;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String printAll(){
        return "[ autore :"+this.getAuthor() + " Contenuto :" + this.getBody() +" tiltolo :" +this.getTitle() +"]" ;
    }



}
