public class Book {

    String title;
    String author;
    String publishDate;
    String category;
    int quantity;

    public Book(String title, String author, String publishDate, String category, int quantity) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.category = category;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
