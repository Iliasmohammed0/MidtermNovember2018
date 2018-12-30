package json.parser;

public class News {
    private String source;
    private String url;
    private String publishedAt;
    private String content;
    private String urlToImage;
    private String author;
    private String description;
    private String title;

    public News() {
    }

    public News(String content, String author, String description, String title,
                String source, String url, String publishedAt, String urlToImage) {
        this.urlToImage = urlToImage;
        this.author = author;
        this.description = description;
        this.title = title;
        this.source = source;
        this.url = url;
        this.publishedAt = publishedAt;
        this.content = content;
    }

        public String getSource () {
            return source;
        }

        public void setSource (String source){
            this.source = source;
        }

        public String getUrl () {
            return url;
        }

        public void setUrl (String url){
            this.url = url;
        }

        public String getPublishedAt () {
            return publishedAt;
        }

        public void setPublishedAt (String publishedAt){
            this.publishedAt = publishedAt;
        }

        public String getContent () {
            return content;
        }

        public void setContent (String content){
            this.content = content;
        }

        public String getUrlToImage () {
            return urlToImage;
        }

        public void setUrlToImage (String urlToImage){
            this.urlToImage = urlToImage;
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
