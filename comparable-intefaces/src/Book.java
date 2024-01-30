public class Book implements Comparable<Book> {
    int numberOfPages;
    String title;
    String author;

    public Book(int numberOfPages, String title, String author) {
        this.numberOfPages = numberOfPages;
        this.title = title;
        this.author = author;
    }

    @Override
    public int compareTo(Book specifiedBook) {
        // check the number of pages of two books
        if (this.numberOfPages != specifiedBook.numberOfPages)
            return this.numberOfPages - specifiedBook.numberOfPages;
        // compare title are same or not.
        if (!this.title.equals(specifiedBook.title))
            return this.title.compareTo(specifiedBook.title);
        // compare author are same or not
        return this.author.compareTo(specifiedBook.author);
    }
}
