// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Book book = new Book("Песнь льда и пламени", 24.09, false);
    WriterInfo writer_info = new WriterInfo();
    writer_info.print(book);
    }
}