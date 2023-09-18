public class WriterInfo {
    Book book;


    public WriterInfo() {

    }

    public void print(Book book) {
        book.printWholeInfo();
    }

    public void printName() {
        this.book.printName();
    }

    public void printPrice() {
        this.book.printPrice();
    }

    public void printIllustrations() {
        this.book.printIllistrations();
    }

}
