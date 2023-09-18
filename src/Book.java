public class Book {
    private String name;
    private double price;
    private boolean illustrations;

    public Book() {
        name = "N/A";
        price = 0;
        illustrations = false;
    }

    public Book(String name, double price, boolean illustrations) {
        this.name = name;
        this.price = price;
        this.illustrations = illustrations;
    }

    public Book(double price, boolean illustrations) {
        name = "N/A";
        this.price = price;
        this.illustrations = illustrations;
    }

    public Book(String name, boolean illustrations) {
        this.name = name;
        price = 0;
        this.illustrations = illustrations;
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
        illustrations = false;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isIllustrations() {
        return illustrations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIllustrations(boolean illustrations) {
        this.illustrations = illustrations;
    }

    public void printName() {
        System.out.println("Название книги: " + this.name);
    }

    public void printPrice() {
        System.out.println("Цена книги: " + this.price);
    }

    public void printIllistrations() {
        System.out.printf("Наличие иллюстраций: ");
        if (this.illustrations) {
            System.out.println("Есть");
        } else System.out.println("Отсутствуют");
    }

    public void printWholeInfo() {
        System.out.println("Название книги: " + this.name + "\nЦена книги: " + this.price);
        System.out.printf("Наличие иллюстраций: ");
        if (this.illustrations) {
            System.out.println("Есть");
        } else System.out.println("Отсутствуют");
    }

}
