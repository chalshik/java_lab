public class LibraryManagementSystem {
    public static void main(String[] args) {

        Ebook ebook = new Ebook("PDF", 5.5, "Delbirim", "Aitmatov", 1997);
        ebook.printBookInfo();
        ebook.bookType();

        PrintedBook printedBook = new PrintedBook(350, "Kyzyl army", "KelKel", "Tologon Kasymbekov", 186);
        printedBook.printBookInfo();
        printedBook.bookType();
    }

    public static class Book {
         String title;
         String author;
         int published;

        public Book(String author, String title, int published) {
            this.author = author;
            this.title = title;
            this.published = published;
        }

        public void printBookInfo() {
            System.out.println("Author: " + author + ", Title: " + title + ", Publish Year: " + published);
        }

        public String getBookInfo() {
            return "Author: " + author + ", Title: " + title + ", Publish Year: " + published;
        }
    }

    public static class Ebook extends Book {
         String fileFormat;
         double fileSizeMB;
         double price = 100;

        public Ebook(String fileFormat, double fileSizeMB, String title, String author, int published) {
            super(author, title, published);
            this.fileFormat = fileFormat;
            this.fileSizeMB = fileSizeMB;
        }

        @Override
        public void printBookInfo() {
            System.out.println("Author: " + author + ", Title: " + title + ", File Format: " + fileFormat +
                    ", File Size: " + fileSizeMB + " MB, Published: " + published+" price"+" "+price*fileSizeMB);
        }

        @Override
        public String getBookInfo() {
            return "Author: " + author + ", Title: " + title + ", File Format: " + fileFormat +
                    ", File Size: " + fileSizeMB + " MB, Published: " + published+" price"+" "+price*fileSizeMB;
        }

        public void bookType() {
            System.out.println("This is an eBook.");
        }
    }

    public static class PrintedBook extends Book {
         int numberOfPages;
         String publisher;
         double price = 1;
        public PrintedBook(int numberOfPages, String publisher, String title, String author, int published) {
            super(author, title, published);
            this.numberOfPages = numberOfPages;
            this.publisher = publisher;
        }

        @Override
        public void printBookInfo() {
            System.out.println("Author: " + author + ", Title: " + title + ", Publisher: " + publisher +
                    ", Number of Pages: " + numberOfPages + ", Published: " + published+" price"+" "+price*numberOfPages);
        }

        @Override
        public String getBookInfo() {
            return "Author: " + author + ", Title: " + title + ", Publisher: " + publisher +
                    ", Number of Pages: " + numberOfPages + ", Published: " + published+" price"+" "+price*numberOfPages;
        }
        public void printBook(){
            System.out.println("Book is printing....");
        }

        public void bookType() {
            System.out.println("This is a printed book.");
        }
    }
}
