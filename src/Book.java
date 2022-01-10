public class Book implements BookHandler{

    private BookPersistence bookPersistence;

    private int numberOfPages;
    private String authorName;

    public Book(int numberOfPages, String authorName) {
        this.numberOfPages = numberOfPages;
        this.authorName = authorName;
        this.bookPersistence = new BookPersistence();
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public void save() {
        this.bookPersistence.save(this);
    }

    @Override
    public String toString() {
        return authorName + " -- " + numberOfPages;
    }
}
