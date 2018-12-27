package json.parser;

public class News {

    private String article;
    private String author;
    private String description;
    private String title;

    public News() {}

    public News(String article, String author, String description, String title) {
        this.article = article;
        this.author = author;
        this.description = description;
        this.title = title;
    }

        public String getArticle() {
            return article; }

        public void setArticle (String article){
            this.article = article;
        }

        public String getAuthor () {
            return author;
        }

        public void setAuthor (String author){
            this.author = author;
        }

        public String getDescription () {
            return description;
        }

        public void setDescription (String description){
            this.description = description;
        }

        public String getTitle () {
            return title;
        }

        public void setTitle (String title){
            this.title = title;
        }
}